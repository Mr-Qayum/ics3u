import { ref } from "vue"
import { defineStore } from "pinia";

export const useStore = defineStore('store', () => {
  const user = ref(null);
  const cart = ref(new Map());

  return { user, cart }
})