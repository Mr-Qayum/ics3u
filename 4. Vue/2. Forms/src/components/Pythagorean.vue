<script setup>
import { ref } from 'vue';

const aValue = ref(0);
const bValue = ref(0);
const cValue = ref(0);

function pythagoreanTheorem() {
  cValue.value = Math.sqrt(aValue.value * aValue.value + bValue.value * bValue.value);
}
</script>

<template>
  <form @submit.prevent="pythagoreanTheorem()">
    <label>a Value:</label>
    <input v-model="aValue" type="number" />
    <label>b Value:</label>
    <input v-model="bValue" type="number" />
    <label>c Value (Result):</label>
    <input v-model="cValue" type="number" readonly />
    <input type="submit" value="Calculate" />
  </form>
</template>

<style scoped>
form {
  background-color: #ffffff;
  padding: 20px;
  border-radius: 10px;
  box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.1);
  max-width: 400px;
  width: 100%;
}

label {
  display: block;
  margin-bottom: 10px;
  color: #333333;
  font-weight: bold;
}

input[type="number"] {
  width: 100%;
  padding: 10px;
  margin-bottom: 20px;
  border: 1px solid #cccccc;
  border-radius: 5px;
  box-sizing: border-box;
  font-size: 16px;
  color: #333333;
  background-color: #f9f9f9;
}

input[type="number"]:focus {
  outline: none;
  border-color: #6200ea;
  background-color: #ffffff;
}

input[type="submit"] {
  width: 100%;
  padding: 10px;
  background-color: #6200ea;
  color: #ffffff;
  border: none;
  border-radius: 5px;
  font-size: 16px;
  cursor: pointer;
  transition: background-color 0.3s ease;
}

input[type="submit"]:hover {
  background-color: #3700b3;
}

input[readonly] {
  background-color: #e0e0e0;
  cursor: not-allowed;
}
</style>