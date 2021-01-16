package com.example.myappbasicwidgets;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


public class ButtonFragment extends Fragment {
    Button btnTime;
    TextView tviewTime;
    View view;
    MainActivity mainActivity;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        mainActivity = (MainActivity) getActivity();
        view = inflater.inflate(R.layout.fragment_button, container, false);

        btnTime = view.findViewById(R.id.buttonTime);
        tviewTime = view.findViewById(R.id.textViewTime);

        btnTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnTime.setBackgroundColor(Color.GREEN);
                tviewTime.setText(mainActivity.updateTime());
            }
        });


        return view;
    }
}