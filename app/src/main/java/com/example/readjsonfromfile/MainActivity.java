package com.example.readjsonfromfile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    private final String TAG = "===";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String mountainText = readFile("mountains.json");
        Log.d(TAG, mountainText);

        Gson gson = new Gson();
        Type type = new TypeToken<List<Mountain>>() {}.getType();
        List<Mountain> listOfMountains = gson.fromJson(mountainText, type);

        Log.d(TAG, "Number of elements: " + listOfMountains.size());

    }

    @SuppressWarnings("SameParameterValue")
    private String readFile(String fileName) {
        try {
            //noinspection CharsetObjectCanBeUsed
            return new Scanner(getApplicationContext().getAssets().open(fileName), Charset.forName("UTF-8").name()).useDelimiter("\\A").next();
        } catch (IOException e) {
            Log.e(TAG, "Could not read file: " + fileName);
            return null;
        }
    }


}