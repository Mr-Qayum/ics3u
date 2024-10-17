<script setup>
import { ref, defineProps } from 'vue';
import axios from "axios";

const props = defineProps(["category"]);
const mealDetails = ref(null);
const response = await axios.get(`https://www.themealdb.com/api/json/v1/1/filter.php?c=${props.category}`);

async function getMeal(id) {
    mealDetails.value = await axios.get(`https://www.themealdb.com/api/json/v1/1/lookup.php?i=${id}`);
}


</script>

<template>
    <div class="main">
        <div class="menu-container">
            <h1>{{ `${props.category} Menu` }}</h1>
            <ol class="menu-list">
                <li v-for="(item, index) in response.data.meals" :key="index" class="menu-item">
                    <span class="menu-number">{{ index + 1 }}.</span>
                    <img :src="item.strMealThumb" class="menu-image" alt="Meal Image" />
                    <div class="menu-details">
                        <p class="meal-name">{{ item.strMeal }}</p>
                        <a @click="getMeal(item.idMeal)" href="#" class="menu-link">See More</a>
                    </div>
                </li>
            </ol>
        </div>
        <div v-if="mealDetails">
            <h1>Menu Item</h1>
            <p>{{ mealDetails.data.meals[0].strMeal }}</p>
            <p>{{ mealDetails.data.meals[0].strInstructions }}</p>

        </div>
    </div>
</template>

<style scoped>
.main {
display: flex;
}

.menu-container {
    font-family: Arial, sans-serif;
    max-width: 700px;
    margin: 0 auto;
    padding: 20px;
    background-color: #f9f9f9;
    border-radius: 10px;
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
}

h1 {
    text-align: center;
    color: #333;
    margin-bottom: 30px;
}

.menu-list {
    list-style-type: none;
    padding: 0;
    margin: 0;
}

.menu-item {
    display: flex;
    align-items: center;
    background-color: #fff;
    border: 1px solid #e0e0e0;
    border-radius: 8px;
    padding: 15px;
    margin-bottom: 20px;
    box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
    transition: transform 0.3s ease;
}

.menu-item:hover {
    transform: scale(1.02);
}

.menu-number {
    font-size: 20px;
    font-weight: bold;
    color: #333;
    margin-right: 15px;
}

.menu-image {
    width: 100px;
    height: 100px;
    border-radius: 8px;
    object-fit: cover;
    margin-right: 20px;
}

.menu-details {
    flex-grow: 1;
}

.meal-name {
    font-size: 18px;
    color: #444;
    margin: 10px 0;
}

.menu-link {
    text-decoration: none;
    color: #007bff;
    font-weight: bold;
}

.menu-link:hover {
    text-decoration: underline;
    color: #0056b3;
}
</style>