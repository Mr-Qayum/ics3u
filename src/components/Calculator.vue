<script setup>
import { ref } from "vue";

let operandOne = ref(0);
let operandTwo = ref(0);
let operator = ref("");
let result = ref(0);

const addOperand = (operand) => {
  if (operator.value === "") {
    operandOne.value = operand;
  } else {
    operandTwo.value = operand;
  }
  result.value = operand;
};

const addOperator = (operation) => {
  operator.value = operation;
  result.value = operation;
};

const getResult = () => {
  switch (operator.value) {
    case "+":
      result.value = operandOne.value + operandTwo.value;
      break;
    case "-":
      result.value = operandOne.value - operandTwo.value;
      break;
    case "*":
      result.value = operandOne.value * operandTwo.value;
      break;
    case "/":
      result.value = operandOne.value / operandTwo.value;
      break;
  }
};
</script>

<template>
  <div class="calculator-container">
    <p class="result">{{ result }}</p>
    <button @click="addOperand(1)">1</button>
    <button @click="addOperand(2)">2</button>
    <button @click="addOperand(3)">3</button>
    <button @click="addOperand(4)">4</button>
    <button @click="addOperand(5)">5</button>
    <button @click="addOperand(6)">6</button>
    <button @click="addOperand(7)">7</button>
    <button @click="addOperand(8)">8</button>
    <button @click="addOperand(9)">9</button>
    <button @click="addOperand(0)">0</button>
    <button @click="addOperator('+')">+</button>
    <button @click="addOperator('-')">-</button>
    <button @click="addOperator('/')">/</button>
    <button @click="addOperator('*')">*</button>
    <button @click="getResult()">=</button>
  </div>
</template>

<style scoped>
.calculator-container {
  display: grid;
  grid-template-columns: repeat(5, 1fr);
  color: white;
}

.calculator-container .result {
  text-align: right;
  grid-column: 1 / span 5;
  font-size: 1.5rem;
  font-family: Impact, Haettenschweiler, "Arial Narrow Bold", sans-serif;
  font-weight: bold;
  color: purple;
}
</style>
