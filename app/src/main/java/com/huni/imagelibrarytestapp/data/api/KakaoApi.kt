package com.huni.imagelibrarytestapp.data.api

import com.huni.imagelibrarytestapp.data.model.ImageSearchResponse
import com.huni.imagelibrarytestapp.data.model.VideoSearchResponse
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface KakaoApi {
    //비디오 받아오기
    @GET("/v2/search/vclip")
    suspend fun getSearchVideo(
        @Header("Authorization") auth:String,
        @Query("query") query:String,
        @Query("sort") sort:String,
        @Query("page") page:Int,
        @Query("size") size:Int
    ): VideoSearchResponse

    //이미지 받아오기
    @GET("/v2/search/image")
    suspend fun getSearchImage(
        @Header("Authorization") auth:String,
        @Query("query") query:String,
        @Query("sort") sort:String,
        @Query("page") page:Int,
        @Query("size") size:Int
    ): ImageSearchResponse
}