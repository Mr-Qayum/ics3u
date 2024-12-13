<script setup>
import { useRouter, RouterView } from 'vue-router';
import { useStore } from '../store';
import { signOut } from 'firebase/auth';
import { auth } from '../firebase';

const store = useStore();
const router = useRouter();

const logout = () => {
  store.user = null;
  signOut(auth);
  router.push(`/`);
}
</script>

<template>
  <div class="movie-gallery">
    <header class="header">
      <h1>{{ `Hello ${store.user.email}!` }}</h1>
      <button @click="router.push(`/cart`)" class="logout-button">Cart</button>
      <button @click="logout()" class="logout-button">Logout</button>
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