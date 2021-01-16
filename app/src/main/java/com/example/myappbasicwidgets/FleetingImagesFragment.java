package com.example.myappbasicwidgets;

import android.content.Context;
import android.media.AudioManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.SoundEffectConstants;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;


public class FleetingImagesFragment extends Fragment {
    ImageView imageView;
    View view;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_fleeting_images, container, false);
//        mp = MediaPlayer.create(getContext().getApplicationContext(), R.raw.door);

//        audioManager = (AudioManager) getActivity().getSystemService(Context.AUDIO_SERVICE);

        imageView = view.findViewById(R.id.icon);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                imageView.setVisibility(View.INVISIBLE);
                MainActivity mainActivity = (MainActivity) getActivity();
                AudioManager audioManager = (AudioManager) mainActivity.getSystemService(Context.AUDIO_SERVICE);
                audioManager.playSoundEffect(SoundEffectConstants.CLICK, 5.0f);
            }
        });
        return view;
    }
}