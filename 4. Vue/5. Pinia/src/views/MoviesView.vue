<script setup>
import { useRouter, RouterView } from 'vue-router';
import { useStore } from '../store';

const store = useStore();
const router = useRouter();
</script>

<template>
  <div class="movie-gallery">
    <header class="header">
      <h1>{{ `Hello ${store.email}!` }}</h1>
      <button @click="router.push(`/cart`)" class="logout-button">Cart</button>
      <button @click="router.push(`/`)" class="logout-button">Logout</button>
    </header>
    <main class="movie-container">
      <RouterView />
    </main>
  </div>
</template>

<style scoped>
.header {
  display: flex;
  justify-content: space-between;
  background-color: #141414;
}

h1 {
  color: #FFFFFF;
}

button {
  padding: 1rem;
  color: #FFFFFF;
  background-color: #e50914;
  border-radius: 1rem;
  ;
}
</style>