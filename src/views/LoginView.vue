<script setup>
</script>

<template>
  <div>
    <h1>Login</h1>
    <RouterLink to="/purchase" custom v-slot="{ navigate }">
      <button @click="navigate" role="link">Login</button>
    </RouterLink>
  </div>
</template>

<style scoped>

</style>