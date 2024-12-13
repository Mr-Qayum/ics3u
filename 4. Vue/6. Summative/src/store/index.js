import { ref } from "vue"
import { defineStore } from "pinia";
import { onAuthStateChanged } from "firebase/auth";
import { auth } from "../firebase";

export const useStore = defineStore('store', () => {
  const user = ref(null);
  const cart = ref(new Map());

  return { user, cart }
})

export const userAuthorized = new Promise((resolve, reject) => {
  onAuthStateChanged(auth, user => {
    try {
      const store = useStore();

      store.user = user;
      resolve();
    } catch (error) {
      reject();
    }
  })
})