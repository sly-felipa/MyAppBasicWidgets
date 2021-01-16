package com.example.myappbasicwidgets;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Date;

public class MainActivity extends AppCompatActivity {
    //    private FragmentTransaction fragmentTransaction;
//    private static final String TAG = "MainActivity";
    Button btn;
    TextView textView;
//    ButtonFragment buttonFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public String updateTime() {
        return new Date().toString();
    }
}
