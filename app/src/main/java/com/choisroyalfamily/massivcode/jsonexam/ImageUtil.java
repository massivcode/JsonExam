package com.choisroyalfamily.massivcode.jsonexam;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by massivcode on 2017-03-17.
 */

public class ImageUtil {
    private static final String BASE_URL = "http://suwonsmartapp.iptime.org:3000/images/";

    public static void loadImageFromServer(Context context, ImageView imageView, String url) {
        Glide.with(context).load(BASE_URL + url).into(imageView);
    }

}
