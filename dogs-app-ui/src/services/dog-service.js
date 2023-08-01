import http from './axios-common';

export function getAllDogs() {
    http.get("/dogs")
}