<script setup>
import Menu from "./components/Menu.vue"
</script>

<template>
  <div class="menus">
    <Menu :text="'Our Food Menu'" :menu="['Hot Dogs', 'Hamburgers', 'Pizza', 'Poutine', 'Fish']"></Menu>
    <Menu :text="'Our Beverage Menu'" :menu="['Coke', '7-Up', 'Mountain Dew', 'Sprite', 'Ginger Ale', 'Dr. Pepper']"></Menu>
  </div>
</template>

<style scoped>
.menus {
  display: flex;
  gap: 3rem;
}
</style>
