package com.example.tfboys.jackson;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.tfboys.R;

public class JackActivity extends AppCompatActivity implements View.OnClickListener{


    private TextView textView_1;
    private TextView textView_2;
    private TextView textView_3;
    private TextView textView_top_bar;
    private FrameLayout ly_content;
    private JackFragment f1,f2,f3;
    private FragmentManager fragmentManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_jack);
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
        if(f3!=null)fragmentTransaction.hide(f3);
    }



    @Override
    public void onClick(View view) {
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        hideAllFragment(fragmentTransaction);
        switch (view.getId()){
            case R.id.text_1:
                setSelected();
                textView_1.setSelected(true);
                textView_top_bar.setText("烊烊");
                if(f1==null){
                    f1=new JackFragment("易烊千玺，2000年11月28日生于湖南怀化，中国内地男歌手、舞者、演员，TFBOYS成员，就读于中央戏剧学院。\n" +
                            "\n" +
                            "2005年，首登电视荧屏，开始参演各类综艺节目。2009年，加入“飞炫少年”组合，两年后退出。2013年6月，获邀加入TF家族；8月，以TFBOYS形式出道。2018年1月，出席第60届格莱美奖颁奖典礼。2019.9月，参演雅加达亚运会闭幕式“杭州8分钟”。");
                    fragmentTransaction.add(R.id.ly_content,f1);
                }else {
                    fragmentTransaction.show(f1);
                }


                break;
            case R.id.text_2:
                setSelected();
                textView_2.setSelected(true);
                textView_top_bar.setText("演过的剧");
                if(f2==null){
                    f2=new JackFragment("首播时间\t剧名\t扮演角色\t导演\t合作演员\n2019-11-19\n" +
                            "热血同行\n" +
                            "\n" +
                            "阿易\t刘一志\t黄子韬\n" +
                            "2019-6-27\t长安十二时辰\t李必\t曹盾\t雷佳音\n" +
                            "2017\t我们的少年时代\n" +
                            "尹柯\n" +
                            "成志超\n" +
                            "易烊千玺， 王俊凯， 王源\n" +
                            "2017\n" +
                            "\n" +
                            "思美人\n" +
                            "屈原（少年）\t张孝正、丁仰国\t马可、乔振宇、张馨予、刘芸\n" +
                            "2016\t小别离\n" +
                            "宋云哲\n" +
                            "汪俊\t黄磊、海清\n" +
                            "2016\t诛仙青云志\t狐仙小七\t朱瑞斌\t李易峰、杨紫\n" +
                            "2016\t超少年密码\t谌浩轩\t郑芬芬\n" +
                            "王俊凯、王源\n" );
                    fragmentTransaction.add(R.id.ly_content,f2);
                }else {
                    fragmentTransaction.show(f2);
                }
                break;
            case R.id.text_3:
                setSelected();
                textView_3.setSelected(true);
                textView_top_bar.setText("你保护世界，我保护你");
                if(f3==null){
                    f3=new JackFragment("《少年的你》是根据玖月晞小说改编的电影，由导演曾国祥执导，周冬雨、易烊千玺主演 。该片讲述在高考前夕，被一场校园意外改变命运的两个少年，如何守护彼此成为想成为的成年人的故事。");
                    fragmentTransaction.add(R.id.ly_content,f3);
                }else {
                    fragmentTransaction.show(f3);
                }
                break;
        }
        fragmentTransaction.commit();

    }
}
