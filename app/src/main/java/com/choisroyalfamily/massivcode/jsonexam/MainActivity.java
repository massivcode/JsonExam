package com.choisroyalfamily.massivcode.jsonexam;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Api api = HttpHelper.createApi();

        Call<Model> call = api.getJson();

        call.enqueue(new Callback<Model>() {
            @Override
            public void onResponse(Call<Model> call, Response<Model> response) {
                if (response.isSuccessful()) {
                    Toast.makeText(MainActivity.this, "성공!", Toast.LENGTH_SHORT).show();
                    System.out.println(response.body());
                } else {
                    Toast.makeText(MainActivity.this, "실패!", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Model> call, Throwable t) {
                t.printStackTrace();
            }
        });


    }

}
