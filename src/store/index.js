import { defineStore } from 'pinia'
import axios from 'axios';

export const useStore = defineStore('store', {
  state: () => {
    return {
      movies: [],
      cart: new Map(),
    }
  },
  actions: {
    async getMovies(id) {
      let data = (await axios.get("https://api.themoviedb.org/3/discover/movie", {
        params: {
          api_key: "ad891932e4907c23fc8a99002a4b5d3f",
          with_genres: id,
          include_adult: false,
        }
      })).data.results;
      
      this.movies = data.map((movie) => {
        return {
          id: movie.id,
          poster: movie.poster_path,
        }
      });
    },
    addToCart(id, data) {
      this.cart.set(id, data);
    },
    removeFromCart(id) {
      this.cart.delete(id);
    }
  }
});