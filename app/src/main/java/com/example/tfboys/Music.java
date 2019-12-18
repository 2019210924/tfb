package com.example.tfboys;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Music extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        TextView textView = findViewById(R.id.music_text);
        textView.setText("第一次告白-TFBOYS\n" +
                "易烊千玺：\n" +
                "\n" +
                "看见你左转弯向我走来\n" +
                "\n" +
                "心跳不停在加快\n" +
                "\n" +
                "藏不住是我悸动的节拍\n" +
                "\n" +
                "这一切会不会就是爱\n" +
                "\n" +
                "王俊凯：\n" +
                "\n" +
                "鼓起勇气靠近你去告白\n" +
                "\n" +
                "结果会不会太坏\n" +
                "\n" +
                "控制心情努力不去瞎猜\n" +
                "\n" +
                "这一刻忽然间好期待\n" +
                "\n" +
                "王源：\n" +
                "\n" +
                "没想过 你开口会说些什么\n" +
                "\n" +
                "想回头 不甘心又一次沉默\n" +
                "\n" +
                "王俊凯：\n" +
                "\n" +
                "没有转身 的理由\n" +
                "\n" +
                "易烊千玺：\n" +
                "\n" +
                "放空心情 去追求\n" +
                "\n" +
                "王源：\n" +
                "\n" +
                "这一刻请拉住我的手\n" +
                "\n" +
                "合：\n" +
                "\n" +
                "第一次告白\n" +
                "\n" +
                "不在乎结局是好坏\n" +
                "\n" +
                "王俊凯：\n" +
                "\n" +
                "我想要把你宠坏\n" +
                "\n" +
                "给你遥远的未来\n" +
                "\n" +
                "合：\n" +
                "\n" +
                "请不要走开\n" +
                "\n" +
                "请用力去看去触碰去感慨\n" +
                "\n" +
                "不逃避这青春的色彩\n" +
                "\n" +
                "不担心会错会伤悲会失败\n" +
                "\n" +
                "青春不怕一切等待\n" +
                "\n" +
                "易烊千玺：\n" +
                "\n" +
                "For this time\n" +
                "\n" +
                "等你到来\n" +
                "\n" +
                "请接受我的爱\n" +
                "\n" +
                "For this time\n" +
                "\n" +
                "等你到来\n" +
                "\n" +
                "请接受我的爱\n" +
                "\n" +
                "王源：\n" +
                "\n" +
                "鼓起勇气靠近你去告白\n" +
                "\n" +
                "结果会不会太坏\n" +
                "\n" +
                "控制心情努力不去瞎猜\n" +
                "\n" +
                "这一刻忽然间好期待\n" +
                "\n" +
                "易烊千玺：\n" +
                "\n" +
                "没想过 你开口会说些什么\n" +
                "\n" +
                "想回头 不甘心又一次沉默\n" +
                "\n" +
                "王俊凯：\n" +
                "\n" +
                "没有转身 的理由\n" +
                "\n" +
                "易烊千玺：\n" +
                "\n" +
                "放空心情 去追求\n" +
                "\n" +
                "王源：\n" +
                "\n" +
                "这一刻请拉住我的手\n" +
                "\n" +
                "合：\n" +
                "\n" +
                "第一次告白\n" +
                "\n" +
                "不在乎结局是好坏\n" +
                "\n" +
                "王源：\n" +
                "\n" +
                "我想要把你宠坏\n" +
                "\n" +
                "给你遥远的未来\n" +
                "\n" +
                "合：\n" +
                "\n" +
                "请不要走开\n" +
                "\n" +
                "请用力去看去触碰去感慨\n" +
                "\n" +
                "不逃避这青春的色彩\n" +
                "\n" +
                "不担心会错会伤悲会失败\n" +
                "\n" +
                "青春不怕一切等待\n" +
                "\n" +
                "Rap：\n" +
                "\n" +
                "王俊凯：\n" +
                "\n" +
                "Wait wait 看你走过来\n" +
                "\n" +
                "Wait wait 不想再等待\n" +
                "\n" +
                "第一次的告白\n" +
                "\n" +
                "祈求上天关怀\n" +
                "\n" +
                "不要不理不睬\n" +
                "\n" +
                "不要当做意外\n" +
                "\n" +
                "易烊千玺：\n" +
                "\n" +
                "请你跟我来\n" +
                "\n" +
                "王源：\n" +
                "\n" +
                "在这个时代\n" +
                "\n" +
                "易烊千玺：\n" +
                "\n" +
                "不必去害怕\n" +
                "\n" +
                "王源：\n" +
                "\n" +
                "青春多精彩\n" +
                "\n" +
                "王俊凯：\n" +
                "\n" +
                "是 心动的节拍~\n" +
                "\n" +
                "合：\n" +
                "\n" +
                "第一次告白\n" +
                "\n" +
                "不在乎结局是好坏\n" +
                "\n" +
                "我想要把你宠坏\n" +
                "\n" +
                "给你遥远的未来\n" +
                "\n" +
                "请不要走开\n" +
                "\n" +
                "请用力去看去触碰去感慨\n" +
                "\n" +
                "不逃避这青春的色彩\n" +
                "\n" +
                "不担心会错会伤悲会失败\n" +
                "\n" +
                "王源：\n" +
                "\n" +
                "青春不怕一切等待");
        Intent intent = new Intent(Music.this,MusicServer.class);
        startService(intent);
    }

    protected void onStop(){
        Intent intent = new Intent(Music.this,MusicServer.class);
        stopService(intent);
        super.onStop();

    }
}