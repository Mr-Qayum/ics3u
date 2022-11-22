<script setup>
import Weather from "./components/Weather.vue";
</script>

<template>
  <div class="app-container">
    <Suspense>
      <Weather />
    </Suspense>
  </div>
</template>

<style scoped>
.app-container {
  background-color: black;
  width: 100vw;
  height: 100vh;
}
</style>
