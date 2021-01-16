package com.example.myappbasicwidgets;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainFragment extends Fragment { //capitulo 9
    ListView listView;
    View view;
    String[] elements = {"Game", "Widgets"};
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
//        Context context = getActivity().getApplicationContext();

        view = inflater.inflate(R.layout.fragment_main, container, false);
        listView = view.findViewById(R.id.listViewMain);
//        listView = getActivity().findViewById(R.id.listViewId);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext().getApplicationContext(),android.R.layout.simple_list_item_1,elements);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(elements[position].equals(elements[0])){
                    replaceFragment(new GameOption());
                }else{
                    replaceFragment(new WidgetsOption());
                }
            }
        });
        return view;
    }

    public void replaceFragment(Fragment frag) {
        Fragment fragment = frag;
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragmentContainer, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}