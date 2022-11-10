import { defineStore } from 'pinia'

export const useStore = defineStore('store;', {
  state: () => {
    return {
      city: "Ottawa",
      count: 0,
    }
  },
  actions: {
    increment() {
      this.count++;
    }
  },
});