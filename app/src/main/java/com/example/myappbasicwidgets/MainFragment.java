package com.example.myappbasicwidgets;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class MainFragment extends Fragment {
    View view;
    TextView textViewGame;
    TextView textViewWidgets;

    private static MainFragment instance = null;

    // getInstance method
    public static MainFragment getInstance() {
        if (instance == null) {
            instance = new MainFragment();
        }
        return instance;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_main, container, false);
        textViewGame = view.findViewById(R.id.txt_game);
        textViewWidgets = view.findViewById(R.id.txt_widgets);

        return view;
    }
}