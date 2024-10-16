<script setup>
import { ref } from "vue";

const props = defineProps(['text', 'menu'])
let showMenu = ref(true);

function hideMenu() {
    showMenu.value = !showMenu.value;
}
</script>

<template>
    <div>
        <h1>{{ props.text }}</h1>
        <ol v-if="showMenu">
            <li v-for="item in props.menu">{{ item }}</li>
        </ol>
        <p v-else>Menu Hidden</p>
        <button @click="hideMenu">Hide Menu</button>
    </div>
</template>

<style scoped>
h1 {
    font-family: Arial, Helvetica, sans-serif;
    text-align: center;
}

ol li {
    margin: 2rem;
}
</style>