package com.bugfreebastard.fluxredux.models

import com.google.gson.annotations.SerializedName

data class MovieResponse(
        @SerializedName("page")
        var page: Int = 0,

        @SerializedName("total_results")
        var totalResults: Int = 0,

        @SerializedName("total_pages")
        var totalPages: Int = 0,

        @SerializedName("results")
        var results: List<MovieObject>? = emptyList()
)