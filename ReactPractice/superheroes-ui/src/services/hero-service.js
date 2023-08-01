import axios from "axios";
import http from './axios-common';

export function saveHero(hero){
    return http.post("/heroes", hero)
}

export function getAllHeroes(){
    return http.get("/heroes")
}
