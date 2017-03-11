package com.choisroyalfamily.massivcode.jsonexam;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by massivcode@gmail.com on 2017. 3. 11. 10:20
 */

public interface Api {
    @GET("json")
    Call<Model> getJson();
}
