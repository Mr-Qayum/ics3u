<script setup>
import { ref } from "vue";

const name = ref("");
const email = ref("");
const showData = ref(false);

const submitEvent = () => {
  showData.value = true;
};
</script>

<template>
  <div class="register-container">
    <form @submit.prevent="submitEvent()">
      <input type="text" placeholder="Name" v-model="name" required />
      <br />
      <input type="email" placeholder="Email" v-model="email" required />
      <br />
      <slot />
    </form>
    <div v-if="showData">
      <p>You submitted:</p>
      <p>{{ name }}</p>
      <p>{{ email }}</p>
    </div>
  </div>
</template>

<style scoped>
.register-container {
  color: white;
}

input {
  padding: 0.25rem;
  font-family: Impact, Haettenschweiler, "Arial Narrow Bold", sans-serif;
  color: purple;
  font-size: 1.25rem;
}

input[type="submit"] {
  background-color: grey;
  border-radius: 0.75rem;
}
</style>
