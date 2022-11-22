<script setup>
import { ref } from "vue";
import axios from "axios";

const city = ref("");
const response = ref(null);

const getWeather = async () => {
  const data = city.value.split(",");
  response.value = (
    await axios.get("https://api.open-meteo.com/v1/forecast", {
      params: {
        latitude: data[1],
        longitude: data[2],
        current_weather: true,
      },
    })
  ).data;
};
</script>

<template>
  <select v-model="city">
    <option value="Toronto,43.6532,79.3832">Toronto</option>
    <option value="Vancouver,49.2827,123.1207">Vancouver</option>
    <option value="Calgary,51.0447,114.0719">Calgary</option>
    <option value="Ottawa,45.4215,75.6972">Ottawa</option>
  </select>
  <button @click="getWeather">Get</button>
  <div v-if="response" class="weather-container">
    <p>Lat: {{ response.latitude }}</p>
    <p>Long: {{ response.longitude }}</p>
    <p>Temperature: {{ response.current_weather.temperature }}</p>
    <p>Windspeed: {{ response.current_weather.windspeed }}</p>
    <p>Wind Direction: {{ response.current_weather.winddirection }}</p>
  </div>
</template>

<style scoped>
div p {
  color: blueviolet;
  font-family: Impact, Haettenschweiler, "Arial Narrow Bold", sans-serif;
  font-size: 1.5rem;
  text-align: center;
}
</style>
