<script setup>
import { useStore } from '../store';

const store = useStore();
</script>

<template>
    <div class="cart">
        <h1>Shopping Cart</h1>
        <div class="item" v-for="([key, value]) in store.cart">
            <img :src="`https://image.tmdb.org/t/p/w500${value.url}`" />
            <h1>{{ value.title }}</h1>
            <button @click="store.cart.delete(key)">Remove</button>
        </div>
    </div>
</template>

<style scoped>
h1 {
    color: #e50914;
    text-align: center;
}

button {
    display: inline-block;
    margin-bottom: 20px;
    padding: 10px 15px;
    background-color: #e50914;
    color: white;
    text-decoration: none;
    border-radius: 5px;
}

.cart {
    display: flex;
    flex-direction: column;
    background-color: #141414;
    gap: 2rem;
    height: 100vw;
}

.item {
    display: flex;
    align-items: center;
    gap: 2rem;
}

img {
    width: 10%;
    border-radius: 5%;
}
</style>
