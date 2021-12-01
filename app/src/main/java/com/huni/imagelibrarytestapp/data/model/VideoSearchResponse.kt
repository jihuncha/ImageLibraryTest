package com.huni.imagelibrarytestapp.data.model

class VideoSearchResponse(var documents: ArrayList<Document>, var meta: Meta) {
    data class Document(
        var title: String,
        var url: String,
        var datetime: String,
        var play_time: Int,
        var thumbnail: String,
        var author: String
    )

    data class Meta(
        var total_count: Int,
        var pageable_count: Int,
        var is_end: Boolean
    )
}