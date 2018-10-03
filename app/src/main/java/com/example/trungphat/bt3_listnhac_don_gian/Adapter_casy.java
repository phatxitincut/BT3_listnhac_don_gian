package com.example.trungphat.bt3_listnhac_don_gian;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter_casy extends BaseAdapter {

    Context mContext;
    int mLayout;
    List<list_casy> mList_casy;

    Adapter_casy(Context context, int Layout, List<list_casy> list_casies ) {
        mContext = context;
        mLayout = Layout;
        mList_casy = list_casies;
    }

    @Override
    public int getCount() {
        return mList_casy.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        assert inflater != null;
        convertView = inflater.inflate(mLayout,null);

        //anh xa
        ImageView IMG_casy = (ImageView) convertView.findViewById(R.id.IMG_casy);
        IMG_casy.setImageResource(mList_casy.get(position).hinh_casy);

        TextView txt_ten_casy = (TextView) convertView.findViewById(R.id.txt_ten_casy);
        txt_ten_casy.setText(mList_casy.get(position).ten_casy);
        TextView txt_baihat = (TextView) convertView.findViewById(R.id.txt_bai_hat);
        txt_baihat.setText(mList_casy.get(position).bai_hat);

        return convertView;
    }
}



