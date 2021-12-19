package com.example.proycdraw.ui.servicios;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.proycdraw.R;
import com.example.proycdraw.activity_form;


public class ServiciosFragment extends Fragment {


    View v;
    ImageView servimage2;
    ImageButton servimageB;
    Drawable drawable;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         v=inflater.inflate(R.layout.fragment_servicios, container, false);

        drawable = getResources().getDrawable(R.drawable.combo);
        servimage2=(ImageView) v.findViewById(R.id.servimage2);
        servimage2.setImageDrawable(drawable);


        drawable = getResources().getDrawable(R.drawable.prom);
        servimageB= (ImageButton) v.findViewById(R.id.servimageB);
        servimageB.setImageDrawable(drawable);



        return v;
    }


}