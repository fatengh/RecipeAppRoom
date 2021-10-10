package com.example.recipeapp

import com.google.gson.annotations.SerializedName

class RecipeDeta {

    var data: List<recDatum>? = null

    class recDatum {

        @SerializedName("pk")
        var id: Int? = null


        @SerializedName("title")
        var title: String? = null

        @SerializedName("author")
        var author: String? = null


        @SerializedName("ingredients")
        var ingredients: String? = null

        @SerializedName("instructions")
        var instructions: String? = null

        constructor(title: String?, author: String?, ingredients: String?, instructions: String?) {
            this.title = title
            this.author = author
            this.ingredients = ingredients
            this.instructions = instructions
        }
    }

}