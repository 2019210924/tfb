package com.example.tfboys.karry;


import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.tfboys.R;

public class KarryActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textView_1;
    private TextView textView_2;
    private TextView textView_3;
    private TextView textView_top_bar;
    private FrameLayout ly_content;
    private MyFragment f1;
    private DemoFragment fDemo;
    private KarryFragment f2;
    private FragmentManager fragmentManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_karry);
        fragmentManager=getSupportFragmentManager();
        bindView();
        textView_1.performClick();
    }

    //UI组件初始化与事件绑定
    private void bindView() {
        textView_1= findViewById(R.id.text_1);
        textView_2=findViewById(R.id.text_2);
        textView_3=findViewById(R.id.text_3);
        textView_top_bar=findViewById(R.id.text_top_bar);
        ly_content=findViewById(R.id.ly_content);

        textView_1.setOnClickListener(this);
        textView_2.setOnClickListener(this);
        textView_3.setOnClickListener(this);
        textView_top_bar.setOnClickListener(this);
    }
    //重置所有文本的选中状态
    private void setSelected(){
        textView_1.setSelected(false);
        textView_2.setSelected(false);
        textView_3.setSelected(false);
        textView_top_bar.setSelected(false);
    }
    //隐藏所有Fragment
    private void hideAllFragment(FragmentTransaction fragmentTransaction){
        if(f1!=null)fragmentTransaction.hide(f1);
        if(f2!=null)fragmentTransaction.hide(f2);
        if(fDemo!=null)fragmentTransaction.hide(fDemo);
    }


    @Override

    public void onClick(View view) {
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        hideAllFragment(fragmentTransaction);
        switch (view.getId()){
            case R.id.text_1:

                textView_1.setSelected(true);
                textView_top_bar.setText("0921");

                if(f1==null){

                    f1=new MyFragment("2016年，在公开的“2016年中国90后十大富豪榜”中排名第6，身价已达人民币2.48亿元。2018年4月18日，任命为“联合国环境署亲善大使”。4月10日，APEC未来之声中国区组委会宣布王俊凯成为“2019年APEC未来之声青年大使”。9月7日，王俊凯荣获“第17届中国电影表演艺术学会奖”新人奖。");
                    fragmentTransaction.add(R.id.ly_content,f1);
                }else {
                    fragmentTransaction.show(f1);
                }


                break;
            case R.id.text_2:
                setSelected();
                textView_2.setSelected(true);
                textView_top_bar.setText("sqgg");
                if(f2==null){
                    f2=new KarryFragment();
                    fragmentTransaction.add(R.id.ly_content,f2);
                }else {
                    fragmentTransaction.show(f2);
                }
                break;
            case R.id.text_3:
                setSelected();
                textView_3.setSelected(true);
                textView_top_bar.setText("lover");
                if(fDemo==null){
                    fDemo=new DemoFragment();
                    fragmentTransaction.add(R.id.ly_content,fDemo);
                }else {
                   fragmentTransaction.show(fDemo);
                }
                break;
        }

        fragmentTransaction.commit();

    }
}
