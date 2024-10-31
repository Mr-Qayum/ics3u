<script setup>
import { RouterLink } from 'vue-router';
</script>

<template>
    <div class="hero">
        <div class="overlay">
            <div class="navbar">
                <h1>MyFlix</h1>
                <div class="nav-buttons">
                    <RouterLink to="/register" class="button register">Register</RouterLink>
                    <RouterLink to="/login" class="button login">Login</RouterLink>
                </div>
            </div>
            <div class="hero-content">
                <h2>Watch Anywhere. Cancel Anytime.</h2>
                <p>Ready to watch? Enter your email to create or restart your membership.</p>
                <input type="email" placeholder="Email address" class="email-input">
                <button class="button join">Get Started</button>
            </div>
        </div>
    </div>
</template>

<style scoped>
.hero {
    background-image: url('https://source.unsplash.com/random/1920x1080/?movie');
    /* Random movie-like image */
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
}

.navbar {
    position: absolute;
    top: 20px;
    width: 100%;
    display: flex;
    justify-content: space-between;
    padding: 0 20px;
}

.nav-buttons .button {
    background-color: #e50914;
    color: white;
    padding: 10px 20px;
    text-decoration: none;
    border-radius: 5px;
    margin-left: 10px;
    transition: background-color 0.3s;
}

.nav-buttons .button:hover {
    background-color: #f40612;
}

.hero-content {
    text-align: center;
    margin-top: 50px;
}

.hero-content h2 {
    font-size: 3rem;
    margin-bottom: 20px;
}

.hero-content p {
    font-size: 1.2rem;
    margin-bottom: 20px;
}

.email-input {
    padding: 10px;
    width: 300px;
    border-radius: 5px;
    border: none;
    margin-bottom: 10px;
}

.join {
    background-color: #e50914;
    color: white;
    padding: 10px 20px;
    border: none;
    border-radius: 5px;
    font-size: 1rem;
    cursor: pointer;
    transition: background-color 0.3s;
}

.join:hover {
    background-color: #f40612;
}
</style>