package com.example.myappbasicwidgets;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    private MainFragment mFragment;
    private FragmentTransaction fragmentTransaction;

    Button textView_game;
    Button textView_widgets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFragment = MainFragment.getInstance();

        textView_game = this.findViewById(R.id.txt_game);
        textView_widgets = this.findViewById(R.id.txt_widgets);

        textView_game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(this, "onShowPress", Toast.LENGTH_SHORT).show();
//                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
//                alertDialogBuilder.setMessage("soy un alertDialogBuilder");

            }
        });
        textView_game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                fragmentTransaction = getSupportFragmentManager().beginTransaction();
//                fragmentTransaction.replace(R.id.fragmentContainer, new GameOption()).commit();
            }
        });

//        textView_widgets.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                fragmentTransaction = getSupportFragmentManager().beginTransaction();
//                fragmentTransaction.replace(R.id.optionWidgetsFrag, new MainFragment()).commit();
//            }
//        });

    }
}

/**
 * <fragment
 * android:id="@+id/optionMainFrag"
 * android:name="com.example.myappbasicwidgets.GameOption"
 * android:layout_width="match_parent"
 * android:layout_height="match_parent"
 * app:layout_constraintBottom_toBottomOf="parent"
 * app:layout_constraintLeft_toLeftOf="parent"
 * app:layout_constraintRight_toRightOf="parent"
 * app:layout_constraintTop_toTopOf="parent"
 * tools:layout="@layout/fragment_game_option"/>
 * <p>
 * <p>
 * <fragment
 * android:id="@+id/optionWidgetsFrag"
 * android:name="com.example.myappbasicwidgets.WidgetsOption"
 * android:layout_width="match_parent"
 * android:layout_height="match_parent"
 * app:layout_constraintBottom_toBottomOf="parent"
 * app:layout_constraintLeft_toLeftOf="parent"
 * app:layout_constraintRight_toRightOf="parent"
 * app:layout_constraintTop_toTopOf="parent"
 * tools:layout="@layout/fragment_widgets_option"/>
 **/