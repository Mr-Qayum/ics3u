<script setup>
import { ref } from "vue";
let date = ref(0);
let time = ref(0);

setInterval(() => {
  const dateAndTime = new Date(Date.now()).toUTCString().split(" ");
  date.value = `${dateAndTime.at(0)} ${dateAndTime.at(1)} ${dateAndTime.at(
    2
  )} ${dateAndTime.at(3)}`;
  time.value = dateAndTime.at(4);
}, 1000);
</script>

<template>
  <div class="date-container">
    <p>{{ date }}</p>
    <p>{{ time }}</p>
  </div>
</template>

<style scoped>
div p {
  color: blueviolet;
  font-family: Impact, Haettenschweiler, "Arial Narrow Bold", sans-serif;
  font-size: 3rem;
  text-align: center;
}
</style>
