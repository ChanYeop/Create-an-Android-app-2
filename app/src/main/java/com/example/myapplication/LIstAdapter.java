package com.example.myapplication;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class LIstAdapter extends BaseAdapter {
    private LayoutInflater inflater;
    private Activity context;
    private List<Page> pages ;

    public LIstAdapter(Activity _context, List<Page> _pages) {
        pages = _pages;
        context = _context;
    }


    @Override
    public int getCount() {
        return pages.size();
    }

    @Override
    public Object getItem(int position) {
        return pages.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            if (inflater == null) {
                inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            }
            convertView = inflater.inflate(R.layout.fragment_test1, parent, false);
            ((TextView) convertView.findViewById(R.id.text_name)).setText(pages.get(position).title);
        }
        return convertView;
    }

}