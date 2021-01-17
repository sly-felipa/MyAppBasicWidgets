package com.example.myappbasicwidgets;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


public class CheckBoxFragment extends Fragment {
    CheckBox checkBoxDog;
    CheckBox checkBoxCat;
    TextView textView;
    View view;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_check_box, container, false);
        checkBoxDog = view.findViewById(R.id.checkboxDog);
        checkBoxCat = view.findViewById(R.id.checkboxCat);
        textView = view.findViewById(R.id.textViewCheck);

        boolean dog = checkBoxDog.isChecked();
        boolean cat = checkBoxCat.isChecked();

        checkBoxDog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBoxDog.isChecked()) {
                    textView.append("I have a " + checkBoxDog.getText() + "\n");
                    textView.setTextColor(Color.BLUE);
                    textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 30f);
                } else if (!checkBoxDog.isChecked()) {
                    textView.setText("");
                }
            }
        });

        checkBoxCat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBoxCat.isChecked()) {
                    textView.append("I have a " + checkBoxCat.getText() + "\n");
                    textView.setTextColor(Color.BLUE);
                } else if (!checkBoxCat.isChecked()) {
                    textView.setText("");
                }
            }
        });

        return view;
    }
}