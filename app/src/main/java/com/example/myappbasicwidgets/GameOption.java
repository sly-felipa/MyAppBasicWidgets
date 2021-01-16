package com.example.myappbasicwidgets;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class GameOption extends Fragment {
    ListView listGame;
    View view;
    String[] elements = {"play", "options"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_game_option, container, false);
        listGame = view.findViewById(R.id.listViewGame);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext().getApplicationContext(),android.R.layout.simple_list_item_1, elements);
        listGame.setAdapter(adapter);
        listGame.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(elements[position].equals(elements[0])){
                    Toast.makeText(getContext().getApplicationContext(), elements[position], Toast.LENGTH_SHORT).show(); //Correcto
//                    Fragment gameOption = new GameOption();
//                    FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
//                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//                    fragmentTransaction.replace(R.id.fragmentContainer, gameOption);
//                    fragmentTransaction.addToBackStack(null);
//                    fragmentTransaction.commit();

                }else{
                Toast.makeText(getContext().getApplicationContext(), elements[position], Toast.LENGTH_SHORT).show();

//                    Fragment widgetsOption = new WidgetsOption();
//                    FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
//                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//                    fragmentTransaction.replace(R.id.fragmentContainer, widgetsOption);
//                    fragmentTransaction.addToBackStack(null);
//                    fragmentTransaction.commit();

                }

            }
        });

        return view;
    }
}