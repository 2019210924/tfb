package com.example.tfboys.jackson;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.tfboys.R;


public class JackFragment extends Fragment {

    private String text;
    public JackFragment(String text) {
        this.text=text;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_jack,container,false);
        TextView textView=(TextView)view.findViewById(R.id.fragment_text);
        textView.setText(text);
        return view;
    }
}