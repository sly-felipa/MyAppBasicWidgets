package com.example.myappbasicwidgets;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


public class WidgetsOption extends Fragment {
    ListView listWidgets;
    View view;
    String[] elements = {"TextView", "Button", "ImageButton", "EditText", "CheckBox","RadioButton","Spinner"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_widgets_option, container, false);
        listWidgets = view.findViewById(R.id.listViewWidgets);
//        listWidgets = getActivity().findViewById(R.id.listViewWidgets);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext().getApplicationContext(), android.R.layout.simple_list_item_1, elements);
        listWidgets.setAdapter(adapter);
        listWidgets.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (elements[position].equals(elements[0])) {
                    try {
                        replaceFragment(new TextViewFragment());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else if (elements[position].equals(elements[1])) {
                    try {
                        replaceFragment(new ButtonFragment());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else if (elements[position].equals(elements[2])) {
                    try {
                        replaceFragment(new FleetingImagesFragment());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else if (elements[position].equals(elements[3])) {
                    try {
                        replaceFragment(new EditTextFragment());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else if (elements[position].equals(elements[4])) {
                    try {
                        replaceFragment(new CheckBoxFragment());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else if (elements[position].equals(elements[5])) {
//                    Toast.makeText(getContext().getApplicationContext(), elements[position], Toast.LENGTH_SHORT).show(); //Correcto
                    try {
                        replaceFragment(new RadioButtonFragment());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else if (elements[position].equals(elements[6])) {
//                    Toast.makeText(getContext().getApplicationContext(), elements[position], Toast.LENGTH_SHORT).show(); //Correcto
                    try {
                        replaceFragment(new SpinnerFragment());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
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