<script setup>
import axios from "axios";

const props = defineProps(["city", "latitude", "longitude"]);
const response = (
  await axios.get("https://api.open-meteo.com/v1/forecast", {
    params: {
      latitude: props.latitude,
      longitude: props.longitude,
      current_weather: true,
    },
  })
).data;
let code = "";

switch (response.current_weather.weathercode) {
  case 0:
    code = "Clear sky";
    break;
  case 1:
  case 2:
  case 3:
    code = "Mainly clear, partly cloudy, and overcast";
    break;
  case 45:
  case 48:
    code = "Fog and depositing rime fog";
    break;
}
</script>

<template>
  <div class="weather-container">
    <p>City: {{ props.city }}</p>
    <p>Lat: {{ response.latitude }}</p>
    <p>Long: {{ response.longitude }}</p>
    <p>Temperature: {{ response.current_weather.temperature }}</p>
    <p>Windspeed: {{ response.current_weather.windspeed }}</p>
    <p>Wind Direction: {{ response.current_weather.winddirection }}</p>
    <p>Code: {{ code }}</p>
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
