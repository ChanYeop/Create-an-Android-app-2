package com.example.myapplication;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class Test1Fragment extends Fragment {

    AdapterView.OnItemClickListener mCallback=null;
    //private List<Page> pages = Util.getPages(getContext());

    public Test1Fragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if(context instanceof AdapterView.OnItemClickListener){
            mCallback = (AdapterView.OnItemClickListener)context; //mCall에 click에 대한 이벤트 처리
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

            View view = inflater.inflate(R.layout.fragment_test1, container, false);
            ListView listview = (ListView) view.findViewById(R.id.listview);

            LIstAdapter Adapter = new LIstAdapter(getActivity(), Util.getPages(getContext()));

            listview.setAdapter(Adapter);//listadapter을 이용하여 값을 listview에 띄어줌
           listview.setOnItemClickListener(mCallback);

           return view;

    }

}