package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListAdapter;

import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView1 = (ImageView) findViewById(R.id.imageView) ;
        imageView1.setImageResource(R.drawable.bbb) ;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) { //클릭을 해주었을 때 그거에 따른 정보를 받아옴

        Test2Fragment frag = (Test2Fragment) getSupportFragmentManager().findFragmentById(R.id.article_fragment);
        frag.setContentId(position);
    }
}
