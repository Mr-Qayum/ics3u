<script setup>
import Date from './components/Date.vue'
import Weather from './components/Weather.vue'
import Calculator from './components/Calculator.vue'
</script>

<template>
  <div class="app-container">
    <Date />
    <Suspense>
      <Weather />
    </Suspense>
    <Calculator />
  </div>
</template>

<style scoped>
.app-container {
  display: grid;
  grid-template-columns: repeat(2, 1fr);
  background-color: black;
}
</style>
