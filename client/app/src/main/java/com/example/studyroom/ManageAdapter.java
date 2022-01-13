package com.example.studyroom;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ManageAdapter extends BaseAdapter {

    Context mContext = null;
    LayoutInflater mLayoutInflater = null;
    ArrayList<ManageContents> managelist;

    public ManageAdapter(Context context, ArrayList<ManageContents> list){
        mContext = context;
        managelist = list;
        mLayoutInflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return managelist.size();
    }

    @Override
    public ManageContents getItem(int position) {
        return managelist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View converView, ViewGroup parentViewGroup) {
        View view = mLayoutInflater.inflate(R.layout.manage_layout, null);

        TextView date = (TextView)view.findViewById(R.id.tv_date);
        TextView content = (TextView)view.findViewById(R.id.tv_content);
        date.setText(managelist.get(position).getDate());
        content.setText(managelist.get(position).getContents());

        return view;
    }
}
