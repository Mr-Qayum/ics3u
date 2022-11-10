<script setup>
import { ref } from "vue";
import { useStore } from "../store/index.js";

const store = useStore();

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
    <p>{{ store.city }}</p>
    <p>{{ store.count }}</p>
  </div>
</template>

<style scoped>
div p {
  font-size: 2rem;
  text-align: center;
}
</style>
