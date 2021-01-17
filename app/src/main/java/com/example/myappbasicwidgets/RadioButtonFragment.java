package com.example.myappbasicwidgets;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


public class RadioButtonFragment extends Fragment {
    View view;
    TextView textView;
    RadioButton radioButtonBlack;
    RadioButton radioButtonRed;
    RadioButton radioButtonGreen;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_radio_button, container, false);

        textView = view.findViewById(R.id.textViewRadio);
        radioButtonBlack = view.findViewById(R.id.radio1);
        radioButtonRed = view.findViewById(R.id.radio2);
        radioButtonGreen = view.findViewById(R.id.radio3);
        radioButtonBlack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setBackgroundColor(Color.BLACK);
            }
        });
        radioButtonRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setBackgroundColor(Color.RED);
            }
        });

        radioButtonGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setBackgroundColor(Color.GREEN);
            }
        });
        return view;
    }
}