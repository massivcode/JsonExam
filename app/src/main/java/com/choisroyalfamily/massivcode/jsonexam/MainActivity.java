package com.choisroyalfamily.massivcode.jsonexam;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.choisroyalfamily.massivcode.jsonexam.http.Api;
import com.choisroyalfamily.massivcode.jsonexam.http.HttpHelper;
import com.choisroyalfamily.massivcode.jsonexam.models.Image;
import com.choisroyalfamily.massivcode.jsonexam.models.Model;
import com.choisroyalfamily.massivcode.jsonexam.models.Result;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private Api mApi;
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mApi = HttpHelper.createApi();

        Call<Model> call = mApi.getJson();

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


        mApi.path("pathExam").enqueue(new Callback<Result>() {
            @Override
            public void onResponse(Call<Result> call, Response<Result> response) {
                if (response.isSuccessful()) {
                    Toast.makeText(MainActivity.this, "성공!", Toast.LENGTH_SHORT).show();
                    System.out.println(response.body());
                } else {
                    Toast.makeText(MainActivity.this, "실패!", Toast.LENGTH_SHORT).show();
                }
            }


            @Override
            public void onFailure(Call<Result> call, Throwable t) {
                t.printStackTrace();
            }
        });

        mApi.query("asdasd").enqueue(new Callback<Result>() {
            @Override
            public void onResponse(Call<Result> call, Response<Result> response) {
                if (response.isSuccessful()) {
                    Toast.makeText(MainActivity.this, "성공!", Toast.LENGTH_SHORT).show();
                    System.out.println(response.body());
                } else {
                    Toast.makeText(MainActivity.this, "실패!", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Result> call, Throwable t) {
                t.printStackTrace();
            }
        });

        initViews();
    }

    private void initViews() {
        mImageView = (ImageView) findViewById(R.id.iv);
        findViewById(R.id.btn).setOnClickListener(mOnGetImageButtonClickListener);
    }

    private View.OnClickListener mOnGetImageButtonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            mApi.getRandomImage().enqueue(new Callback<Image>() {
                @Override
                public void onResponse(Call<Image> call, Response<Image> response) {
                    if (response.isSuccessful()) {
                        Toast.makeText(MainActivity.this, "성공!", Toast.LENGTH_SHORT).show();
                        Image image = response.body();
                        System.out.println(image);

                        ImageUtil.loadImageFromServer(getApplicationContext(), mImageView, image.getFileName() + "." +image.getFileType());
                    } else {
                        Toast.makeText(MainActivity.this, "실패!", Toast.LENGTH_SHORT).show();
                    }
                }

                @Override
                public void onFailure(Call<Image> call, Throwable t) {
                    t.printStackTrace();
                }
            });
        }
    };

}
