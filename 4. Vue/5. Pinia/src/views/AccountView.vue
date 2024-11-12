<script setup>
import { useStore } from '../store/index.js';

const store = useStore();
</script>

<template>
  <div class="about">
    <h1>This is an Account page</h1>
    <h3>{{ `User: ${store.username}` }}</h3>
    <h3>{{ `User: ${store.email}` }}</h3>
  </div>
</template>

<style>
</style>
