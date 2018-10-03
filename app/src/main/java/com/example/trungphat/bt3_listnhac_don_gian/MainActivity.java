package com.example.trungphat.bt3_listnhac_don_gian;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView_casy;
    ArrayList<list_casy> list_casy;
    MediaPlayer player = new MediaPlayer(); //khai báo biến Media để phát nhạc


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView_casy = (ListView) findViewById(R.id.list_casy);

        list_casy = new ArrayList<list_casy>();

        list_casy.add(new list_casy("Sơn Tùng MTP","Anh sai rồi",R.drawable.casy1,R.raw.sontung_anh_sai_roi));
        list_casy.add(new list_casy("Soobin Hoàng Sơn","Day Dreams",R.drawable.casy2,R.raw.soobin_day_dreams));
        list_casy.add(new list_casy("Đông Nhi","30 ngày yêu",R.drawable.casy3,R.raw.dongnhi_30_ngay_yeu));
        list_casy.add(new list_casy("Chi Pu","Cho ta gần hơn",R.drawable.casy4,R.raw.chipu_cho_ta_gan_hon));
        list_casy.add(new list_casy("Avril Lavigne","Complicated",R.drawable.casy5,R.raw.avril_lavigne_complicated));

        Adapter_casy adapter_casy = new Adapter_casy(MainActivity.this, R.layout.item_casy, list_casy);

        listView_casy.setAdapter(adapter_casy);

        listView_casy.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (player.isPlaying()) {
                    player.stop();
                }
                player = MediaPlayer.create(MainActivity.this, list_casy.get(position).diachi_baihat);
                player.start();
            }
        });
    }
}
