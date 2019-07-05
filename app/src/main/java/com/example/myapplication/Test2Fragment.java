package com.example.myapplication;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class Test2Fragment extends Fragment {

    List<Page> pages;
    TextView textview;
    TextView textview2;
    public Test2Fragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        pages = Util.getPages(context);

    }
    public void setContentId(int position) { //position은 1번째 프래그먼트에서 main을 거쳐서 넘겨받음
        textview.setText(pages.get(position).title); //첫번째 textview를 만들어 그곳에 페이지에 저장되어 있던 title 저장
        textview2.setText(pages.get(position).content); //두 번째 textview를 만들어 그곳에 페이지에 저장되어 있던 content 저장
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

       View view = inflater.inflate(R.layout.fragment_test2, container, false) ;
        textview = (TextView) view.findViewById(R.id.Textview) ;
        textview2 = (TextView) view.findViewById(R.id.textView);
       return view;

    }

}
