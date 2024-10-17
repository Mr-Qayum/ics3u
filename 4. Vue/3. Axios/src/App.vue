<script setup>
import Menu from './components/Menu.vue';
</script>

<template>
  <Suspense>
    <div class="menus">
      <Menu category="Chicken" />
      <Menu category="Beef" />
    </div>
  </Suspense>
</template>

<style scoped>
.menus {
  display: grid;
  grid-template-columns: repeat(2, 1fr);
}
</style>
