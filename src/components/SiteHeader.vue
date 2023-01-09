<script setup>

</script>

<template>
  <div class="header-container">
    <h1>Netflix</h1>
    <RouterLink to="/login" custom v-slot="{ navigate }">
      <button @click="navigate" role="link">Login</button>
    </RouterLink>
  </div>
</template>

<style scoped>
.header-container {
  padding: 1rem;
  border: 1px solid red;
}
</style>