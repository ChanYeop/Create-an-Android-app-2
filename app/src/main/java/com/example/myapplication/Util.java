package com.example.myapplication;

import android.content.Context;
import android.util.Log;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Util {
    private static final String  TAG="TAG";
    public Util(){

    }
    public static List<Page> getPages(Context context) {
        InputStreamReader inputStream = new InputStreamReader(context.getResources().openRawResource(R.raw.data));
        BufferedReader buffreader = new BufferedReader(inputStream);

        List<Page> pages = new ArrayList<>();

        try{
            String line;
            while((line = buffreader.readLine()) != null) {
                Log.d(TAG,line);
                String []fields = line.split(",");
                pages.add(new Page(fields[0], fields[1]));
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        for(int i=0; i<4; i++)
        Log.d(TAG, pages.get(i).title);


        return pages;
    }
}
