import { createWebHistory, createRouter } from 'vue-router'
import HomeView from '../views/HomeView.vue';
import RegisterView from '../views/RegisterView.vue';
import LoginView from '../views/LoginView.vue';
import MoviesView from '../views/MoviesView.vue';
import AllMoviesView from '../views/AllMoviesView.vue';
import SingleMovieView from '../views/SingleMovieView.vue';
import CartView from '../views/CartView.vue';
import ErrorView from '../views/ErrorView.vue';

const routes = [
    { path: '/', meta: false, component: HomeView },
    { path: '/register', meta: false, component: RegisterView },
    { path: '/login', meta: false, component: LoginView },
    { path: '/cart', meta: true, component: CartView },
    {
        path: '/movies',
        component: MoviesView,
        meta: true,
        children: [
            { path: 'all', component: AllMoviesView },
            { path: ':id', component: SingleMovieView },
        ]
    },
    { path: '/:pathMatch(.*)*', meta: false, name: 'NotFound', component: ErrorView, },
]

const router = createRouter({
    history: createWebHistory(),
    routes,
})

export default router;