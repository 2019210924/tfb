package com.example.tfboys.roy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tfboys.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RActivity extends AppCompatActivity {
    private ImageView imageView;
    private TextView textView1, textView2;
    private ListView lv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r);



        intID();
        List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();
        Map map1 = new HashMap<String, Object>();
        map1.put("name", "Roy");
        map1.put("type", "2000.11.08");
        map1.put("image",R.drawable.y);
        data.add(map1);
        Map map2 = new HashMap<String, Object>();
        map2.put("name", "因为遇见你");
        map2.put("type", "第一首原创单曲");
        map2.put("image",R.drawable.y);
        data.add(map2);
        Map map3 = new HashMap<String, Object>();
        map3.put("name", "十七");
        map3.put("type", "2017.10.25");
        map3.put("image",R.drawable.y);
        data.add(map3);
        Map map4 = new HashMap<String, Object>();
        map4.put("name", "我不知道");
        map4.put("type", "2018.12.04");
        map4.put("image",R.drawable.y);
        data.add(map4);
        Map map5 = new HashMap<String, Object>();
        map5.put("name", "阳光不锈");
        map5.put("type", "2017.07.08");
        map5.put("image",R.drawable.y);
        data.add(map5);
        Map map6 = new HashMap<String, Object>();
        map6.put("name", "骄傲");
        map6.put("type", "2017.11.20");
        map6.put("image",R.drawable.y);
        data.add(map6);
        Map map7 = new HashMap<String, Object>();
        map7.put("name", "天使");
        map7.put("type", "2018.11.17");
        map7.put("image",R.drawable.y);
        data.add(map7);
        Map map8 = new HashMap<String, Object>();
        map8.put("name", "一样");
        map8.put("type", "2018.11.06");
        map8.put("image",R.drawable.y);
        data.add(map8);
        Map map9 = new HashMap<String, Object>();
        map9.put("name", "源");
        map9.put("type", "专辑⚪");
        map9.put("image",R.drawable.y);
        data.add(map9);
        Map map10 = new HashMap<String, Object>();
        map10.put("name", "彩虹云朵");
        map10.put("type", "专辑⚪");
        map10.put("image",R.drawable.y);
        data.add(map10);
        Map map11 = new HashMap<String, Object>();
        map11.put("name", "易碎的吻");
        map11.put("type", "专辑⚪");
        map11.put("image",R.drawable.y);
        data.add(map11);
        Map map12 = new HashMap<String, Object>();
        map12.put("name", "柔");
        map12.put("type", "专辑⚪");
        map12.put("image",R.drawable.y);
        data.add(map12);
        Map map13 = new HashMap<String, Object>();
        map13.put("name", "这里");
        map13.put("type", "专辑⚪");
        map13.put("image",R.drawable.y);
        data.add(map13);
        Map map14 = new HashMap<String, Object>();
        map14.put("name", "夜间游泳池");
        map14.put("type", "专辑⚪");
        map14.put("image",R.drawable.y);
        data.add(map14);


        SimpleAdapter adapter =new SimpleAdapter(this,
                data,
                R.layout.list_view_item,
                new String[]{"name","type","image"},
                new int[]{R.id.lv_item1,R.id.lv_item2,R.id.image});
        lv.setAdapter(adapter);


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {

                    Intent intent = new Intent(RActivity.this,RoActivity.class);
                    startActivity(intent);

            }
        });

    }

    private void intID() {
        lv = findViewById(R.id.lv);
        textView1 = findViewById(R.id.lv_item1);
        textView2 = findViewById(R.id.lv_item2);
        imageView = findViewById(R.id.image);

    }
}
