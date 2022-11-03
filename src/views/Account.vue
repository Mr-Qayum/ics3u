<script setup>
import Date from "../components/Date.vue";
import Weather from "../components/Weather.vue";
import Calculator from "../components/Calculator.vue";
import Register from "../components/Register.vue";
</script>

<template>
  <div class="account-container">
    <Date />
    <Suspense>
      <Weather />
    </Suspense>
    <Calculator />
    <Register />
  </div>
</template>

<style scoped>
.account-container {
  display: grid;
  grid-template-columns: repeat(2, 1fr);
  width: 100vw;
  height: 100vh;
}
</style>
