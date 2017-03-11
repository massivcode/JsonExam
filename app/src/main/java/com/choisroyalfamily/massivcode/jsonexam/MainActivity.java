package com.choisroyalfamily.massivcode.jsonexam;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new NetworkAsyncTask().execute("http://suwonsmartapp.iptime.org:3000/json");
    }

    private class NetworkAsyncTask extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... strings) {
            return getDataFromUrl(strings[0]);
        }

        private String getDataFromUrl(String urlString) {
            try {
                URL url = new URL(urlString);
                BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
                StringBuffer buffer = new StringBuffer();
                String decodedString;
                while ((decodedString = in.readLine()) != null) {
                    buffer.append(decodedString);
                }
                in.close();
                return buffer.toString();

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            System.out.println(s);
        }
    }
}
