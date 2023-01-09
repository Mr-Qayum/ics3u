<script setup>
import { ref } from "vue";
import { auth } from "../firebase/index.js";
import { createUserWithEmailAndPassword } from "firebase/auth";

const name = ref("");
const email = ref("");
const password = ref("");
const showData = ref(false);

const register = () => {
  createUserWithEmailAndPassword(auth, email.value, password.value);
};
</script>

<template>
  <div class="register-container">
    <form @submit.prevent="register()">
      <input type="text" placeholder="Name" v-model="name" required />
      <input type="email" placeholder="Email" v-model="email" required />
      <input type="password" placeholder="Password" v-model="password" required />
      <input type="submit" value="Register" />
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

form {
  display: flex;
  flex-direction: column;
  gap: 0.5rem;
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
