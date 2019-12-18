package com.example.tfboys.karry;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.example.tfboys.R;

import java.util.Date;

public class KarryFragment extends Fragment implements View.OnClickListener {

    private Button button_1;


    public KarryFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_karry,container,false);
        button_1=view.findViewById(R.id.button_1);

        button_1.setOnClickListener(this);

        return view;
    }




    @Override
    public void onClick(View view) {
        Date date=new Date(System.currentTimeMillis());

        switch (view.getId()){
            case R.id.button_1:
                Intent intent1 = new Intent(getActivity(),PhotokActivity.class);
                startActivity(intent1);
                break;

        }
    }
}
