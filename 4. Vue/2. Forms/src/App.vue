<script setup>
import Pythagorean from './components/Pythagorean.vue';
</script>

<template>
  <div class="app-container">
    <Pythagorean />
    <Pythagorean />
  </div>
</template>

<style scoped>
.app-container {
  display: flex;
  gap: 2rem;
}
</style>
