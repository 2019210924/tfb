package com.example.tfboys.karry;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.tfboys.R;

import java.util.Date;

public class DemoFragment extends Fragment implements View.OnClickListener {

    private Button button_1;
    private Button button_2;

    public DemoFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_demo,container,false);
        button_1=view.findViewById(R.id.button_1);
        button_2=view.findViewById(R.id.button_2);
        button_1.setOnClickListener(this);
        button_2.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        Date date=new Date(System.currentTimeMillis());

        switch (view.getId()){
            case R.id.button_1:
                Toast.makeText(getContext(),"TFBOYS队长王俊凯",Toast.LENGTH_LONG).show();
                break;
            case R.id.button_2:
                Toast.makeText(getContext(),"1999.09.21",Toast.LENGTH_LONG).show();
                break;
        }
    }
}
