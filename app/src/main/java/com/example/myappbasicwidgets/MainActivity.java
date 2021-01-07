package com.example.myappbasicwidgets;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    private MainFragment mFragment;
    private FragmentTransaction fragmentTransaction;

    TextView textView_game;
    TextView textView_widgets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /** mFragment = MainFragment.getInstance();

        textView_game = mFragment.textViewGame;
        textView_widgets = mFragment.textViewGame;

        textView_game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                fragmentTransaction = getSupportFragmentManager().beginTransaction();
//                fragmentTransaction.replace(R.id.fragmentContainer, new MainFragment()).commit();
            }
        });

        textView_widgets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                fragmentTransaction = getSupportFragmentManager().beginTransaction();
//                fragmentTransaction.replace(R.id.fragmentContainer, new MainFragment()).commit();
            }
        });**/

    }
}