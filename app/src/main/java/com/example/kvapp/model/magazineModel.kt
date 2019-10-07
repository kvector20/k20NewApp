package com.example.kvapp.model


import com.squareup.moshi.Json

data class magazineModel(
    @field:Json(name = "data")
    var data: List<Data>
) {
    data class Data(
        @field:Json(name = "id")
        var id: Int = 0,
        @field:Json(name = "title")
        var title: String = " ",
        @field:Json(name = "body")
        var body: String = " ",
        @field:Json(name = "author")
        var author: String = " ",
        @field:Json(name = "views")
        var views: Int = 0,
        @field:Json(name = "published")
        var published: Int = 0,
        @field:Json(name = "collection_name")
        var collectionName: String = " ",
        @field:Json(name = "collection_month")
        var collectionMonth: String = " ",
        @field:Json(name = "created_at")
        var createdAt: String = " ",
        @field:Json(name = "updated_at")
        var updatedAt: String = " "
    )
}