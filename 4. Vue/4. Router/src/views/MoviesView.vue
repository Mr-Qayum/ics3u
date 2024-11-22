<script setup>
import axios from "axios";
import { useRouter } from "vue-router";

const router = useRouter();
const response = await axios.get(`https://api.themoviedb.org/3/movie/now_playing?api_key=${import.meta.env.VITE_TMDB_KEY}`);

function getMovieDetails(id) {
    router.push(`/movies/${id}`)
}
</script>

<template>
  <div class="movie-gallery">
    <h1>Now Playing</h1>
    <div class="movie-list">
      <div v-for="movie in response.data.results" :key="movie.id" class="movie-card" @click="getMovieDetails(movie.id)">
        <img :src="`https://image.tmdb.org/t/p/w500${movie.poster_path}`" alt="Movie Poster" class="movie-poster" />
        <p class="movie-title">{{ movie.title }}</p>
      </div>
    </div>
  </div>
</template>

<style scoped>
.movie-gallery {
  padding: 20px;
  color: white;
  background-color: #141414;
  /* Dark background for the gallery */
}

.movie-gallery h1 {
  text-align: center;
  margin-bottom: 20px;
  font-size: 2.5rem;
}

.movie-list {
  display: flex;
  flex-wrap: wrap;
  /* Allow wrapping of movie cards */
  justify-content: center;
  /* Center cards horizontally */
  gap: 20px;
  /* Space between cards */
}

.movie-card {
  background-color: #222;
  /* Card background color */
  border-radius: 10px;
  overflow: hidden;
  /* Ensures rounded corners on images */
  transition: transform 0.2s;
  /* Smooth transition effect */
  width: 200px;
  /* Fixed width for cards */
}

.movie-card:hover {
  transform: scale(1.05);
  /* Scale effect on hover */
}

.movie-poster {
  width: 100%;
  /* Full width of the card */
  height: auto;
  /* Maintain aspect ratio */
}

.movie-title {
  padding: 10px;
  text-align: center;
  font-size: 1.1rem;
  /* Adjust title font size */
  color: #e50914;
  /* Netflix red for titles */
}
</style>