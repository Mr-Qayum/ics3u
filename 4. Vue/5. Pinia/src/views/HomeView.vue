<script setup>
import { useStore } from '../store/index.js';

const store = useStore();
</script>

<template>
  <div>
    <h1>Home Page</h1>
    <h3>{{ `User: ${store.username}` }}</h3>
    <h3>{{ store.greeting() }}</h3>
</div>
</template>
