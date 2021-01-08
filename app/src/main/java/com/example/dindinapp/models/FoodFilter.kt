package com.example.dindinapp.models

data class FoodFilter(
    val id: Int,
    val foodMenus: List<FoodMenu>,
    val name: String
)