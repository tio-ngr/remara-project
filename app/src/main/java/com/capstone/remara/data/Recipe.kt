package com.capstone.remara.data


data class Recipe (
    val id: Int,
    val title: String,
    val kategori: String,
    val bahan: String,
    val description: String,
    val resepImageId: Int = 0

)