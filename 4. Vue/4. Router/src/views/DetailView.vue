<script setup>
import axios from "axios";
import { useRoute } from "vue-router";

const route = useRoute();
const response = await axios.get(`https://api.themoviedb.org/3/movie/${route.params.id}?api_key=${import.meta.env.VITE_TMDB_KEY}&append_to_response=videos`);
console.log(response.data);
</script>

<template>
  <div class="movie-detail">
    <h1 class="movie-title">{{ response.data.original_title }}</h1>
    <p class="movie-overview">{{ response.data.overview }}</p>
    <p class="movie-release-date">Release Date: {{ response.data.release_date }}</p>
    <a class="movie-site" :href="response.data.homepage" target="_blank">Official Movie Site</a>
    <img :src="`https://image.tmdb.org/t/p/w500${response.data.poster_path}`" alt="Movie Poster" class="movie-poster" />

    <h2 class="trailers-title">Trailers</h2>
    <div class="trailers-container">
      <div v-for="trailer in response.data.videos.results" :key="trailer.id" class="trailer-tile">
        <a :href="`https://www.youtube.com/watch?v=${trailer.key}`" target="_blank">
          <img :src="`https://img.youtube.com/vi/${trailer.key}/hqdefault.jpg`" alt="Trailer"
            class="trailer-thumbnail" />
        </a>
      </div>
    </div>
  </div>
</template>

<style scoped>
.movie-detail {
  padding: 20px;
  color: white;
  background-color: #141414; /* Dark background for the detail view */
}

.movie-title {
  font-size: 2.5rem;
  margin-bottom: 10px;
  color: #e50914; /* Netflix red */
}

.movie-overview {
  font-size: 1.2rem;
  margin-bottom: 10px;
}

.movie-release-date {
  font-size: 1rem;
  margin-bottom: 20px;
}

.movie-site {
  display: inline-block;
  margin-bottom: 20px;
  padding: 10px 15px;
  background-color: #e50914; /* Netflix red */
  color: white;
  text-decoration: none;
  border-radius: 5px;
}

.movie-site:hover {
  background-color: #f01212; /* Darker red on hover */
}

.movie-poster {
  width: 25%;
  border-radius: 10px;
  margin-bottom: 20px;
}

.trailers-title {
  font-size: 2rem;
  margin-top: 40px;
  margin-bottom: 20px;
  text-align: center;
}

.trailers-container {
  display: flex;
  flex-wrap: wrap;
  justify-content: center;
  gap: 15px; /* Space between trailer tiles */
}

.trailer-tile {
  background-color: #222;
  border-radius: 10px;
  overflow: hidden;
  transition: transform 0.2s;
  width: 200px; /* Fixed width for trailer tiles */
}

.trailer-tile:hover {
  transform: scale(1.05); /* Scale effect on hover */
}

.trailer-thumbnail {
  width: 100%; /* Full width of the tile */
  height: auto; /* Maintain aspect ratio */
}
</style>