import { ref } from "vue"
import { defineStore } from "pinia";

export const useStore = defineStore('store', () => {
    const email = ref("");
    const cart = ref(new Map());
  
    return { email, cart }
  })