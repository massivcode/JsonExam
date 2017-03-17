package com.choisroyalfamily.massivcode.jsonexam.http;

import com.choisroyalfamily.massivcode.jsonexam.models.Image;
import com.choisroyalfamily.massivcode.jsonexam.models.Model;
import com.choisroyalfamily.massivcode.jsonexam.models.Result;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by massivcode@gmail.com on 2017. 3. 11. 10:20
 */

public interface Api {
    @GET("json")
    Call<Model> getJson();

    @GET("path/{input}")
    Call<Result> path(@Path("input") String input);

    @GET("query")
    Call<Result> query(@Query("input") String input);

    @GET("image")
    Call<Image> getRandomImage();

}
