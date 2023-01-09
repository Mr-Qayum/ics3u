<script setup>
import { ref } from "vue";
import { useRouter } from "vue-router";
import Register from "../components/Register.vue";

const router = useRouter();
const username = ref("");
const password = ref("");
const error = ref(false);

const login = () => {
  if (username.value === "Bobby" && password.value === "guns") {
    router.push("/account");
  } else {
    error.value = true;
  }
};
</script>

<template>
  <div class="home-container">
    <h1>Home</h1>
    <Register />
  </div>
</template>

<style scoped>
.home-container {
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  width: 100vw;
  height: 100vh;
  font-size: 4rem;
}
</style>
