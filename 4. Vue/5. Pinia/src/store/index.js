import { defineStore } from "pinia";
import { ref } from "vue";

export const useStore = defineStore('store', () => {
    const username = ref('Mr. Qayum');
    const email = ref('omar.qayum@tdsb.on.ca');

    const greeting = () => {
        return `Hello ${username.value}!`;
    }

    return { username, email, greeting }
})