package com.choisroyalfamily.massivcode.jsonexam;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by massivcode@gmail.com on 2017. 3. 11. 10:18
 */

public class HttpHelper {
    private static final String BASE_URL = "http://suwonsmartapp.iptime.org:3000/";

    private static OkHttpClient getClient() {
        return new OkHttpClient.Builder().build();
    }

    private static Retrofit getRetrofit() {
        return new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .client(getClient())
                .build();
    }

    public static Api createApi() {
        return getRetrofit().create(Api.class);
    }
}
