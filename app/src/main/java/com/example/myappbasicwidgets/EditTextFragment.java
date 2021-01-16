package com.example.myappbasicwidgets;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

public class EditTextFragment extends Fragment {
    View view;
    EditText editText;
    EditText editTextCopy;
    ImageView imageView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_edit_text, container, false);
        editText = view.findViewById(R.id.field);
        editText.setBackgroundColor(R.style.EditTextStyleBlack);
        editText.setText(getString(R.string.apache));
        editTextCopy = view.findViewById(R.id.fieldCopy);
        imageView = view.findViewById(R.id.icon);
        imageView.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
//                editText.setBackgroundColor(R.color.colorOrange);
//                editTextCopy.setBackgroundColor(R.style.EditTextStyleWhite);
                editTextCopy.setText(R.string.apache);
            }
        });
        return view;
    }
}