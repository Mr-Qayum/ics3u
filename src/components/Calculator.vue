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
    <label class="result">{{ result }}</label>
    <button v-for="value in [1, 2, 3, 4, 5, 6, 7, 8, 9, 0]" @click="addOperand(value)">
      {{ value }}
    </button>
    <button v-for="operator in ['+', '-', '/', '*']" @click="addOperator(operator)">
      {{ operator }}
    </button>
    <button @click="getResult()">=</button>
  </div>
</template>

<style scoped>
.calculator-container {
  display: grid;
  grid-template-columns: repeat(5, 1fr);
  width: 75%;
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

button {
  background-color: grey;
  color: purple;
  font-family: Impact, Haettenschweiler, "Arial Narrow Bold", sans-serif;
  font-size: 1.5rem;
  border-radius: 0.75rem;
}
</style>
