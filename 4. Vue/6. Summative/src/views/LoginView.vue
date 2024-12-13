<script setup>
import { RouterLink, useRouter } from 'vue-router';
import { ref } from 'vue';
import { useStore } from "../store"
import { signInWithEmailAndPassword, signInWithPopup, GoogleAuthProvider } from "firebase/auth";
import { auth } from "../firebase"

const store = useStore();
const router = useRouter();
const email = ref('');
const password = ref('');

const loginByEmail = async () => {
  try {
    const user = (await signInWithEmailAndPassword(auth, email.value, password.value)).user;
    store.user = user;
    router.push("/movies/all");
  } catch (error) {
    console.log(error);
    alert("There was an error signing in with email!");
  }
};

const loginByGoogle = async () => {
  try {
    const user = (await signInWithPopup(auth, new GoogleAuthProvider())).user;
    store.user = user;
    router.push("/movies/all");
  } catch (error) {
    alert("There was an error signing in with Google!");
  }
};
</script>

<template>
  <div class="hero">
    <div class="overlay">
      <div class="navbar">
        <h1>MyFlix</h1>
        <RouterLink to="/register" class="button register">Register</RouterLink>
      </div>
      <div class="form-container">
        <h2>Login to Your Account</h2>
        <form @submit.prevent="loginByEmail()">
          <input v-model:="email" type="email" placeholder="Email" class="input-field" required />
          <input v-model:="password" type="password" placeholder="Password" class="input-field" required />
          <button type="submit" class="button login">Login by Email</button>
        </form>
        <button @click="loginByGoogle()" type="submit" class="button login">Login by Google</button>
      </div>
    </div>
  </div>
</template>

<style scoped>
.hero {
  background-image: url('https://source.unsplash.com/random/1920x1080/?movie');
  /* Replace with your desired background */
  background-size: cover;
  height: 100vh;
  display: flex;
  align-items: center;
  justify-content: center;
  position: relative;
}

.overlay {
  background-color: rgba(0, 0, 0, 0.7);
  width: 100%;
  height: 100%;
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  color: white;
  padding: 20px;
  /* Added padding for better spacing */
}

.navbar {
  width: 100%;
  display: flex;
  justify-content: space-between;
  padding: 20px;
}

.navbar h1 {
  font-size: 2rem;
}

.navbar .register {
  background-color: #e50914;
  color: white;
  padding: 10px 20px;
  text-decoration: none;
  border-radius: 5px;
  transition: background-color 0.3s;
}

.navbar .register:hover {
  background-color: #f40612;
}

form {
  display: flex;
  flex-direction: column;
}

.form-container {
  text-align: center;
  margin-top: 50px;
  /* Adjusts spacing from the top */
}

.form-container h2 {
  font-size: 2rem;
  margin-bottom: 20px;
}

.input-field {
  padding: 15px;
  /* Increased padding for better touch targets */
  width: 300px;
  border-radius: 5px;
  border: 1px solid #ccc;
  /* Added a border */
  margin-bottom: 15px;
  transition: border-color 0.3s;
}

.input-field:focus {
  border-color: #e50914;
  /* Change border color on focus */
  outline: none;
  /* Remove default outline */
}

.login {
  background-color: #e50914;
  color: white;
  padding: 10px 20px;
  border: none;
  border-radius: 5px;
  font-size: 1rem;
  cursor: pointer;
  transition: background-color 0.3s, transform 0.2s;
  /* Added transform for hover effect */
}

.login:hover {
  background-color: #f40612;
  transform: scale(1.05);
  /* Slightly scale up on hover */
}

@media (max-width: 600px) {
  .input-field {
    width: 90%;
    /* Make input fields responsive */
  }

  .navbar h1 {
    font-size: 1.5rem;
    /* Reduce font size on smaller screens */
  }
}
</style>