package com.example.wtest005;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.MapView;

public class MainAct extends AppCompatActivity  {
    Button btnShowHide;
    Button btnHide;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_act);
        LinearLayout ll = findViewById(R.id.llMapLayout);

        //ll.setVisibility(View.INVISIBLE);
        btnShowHide = findViewById(R.id.btnShowMap);
        btnShowHide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout ll = findViewById(R.id.llMapLayout);
                if (ll.getVisibility()==View.INVISIBLE) {ll.setVisibility(View.VISIBLE); }
                else {ll.setVisibility(View.INVISIBLE); }
            }
        });

        btnHide = findViewById(R.id.btnHideLayout);
        btnHide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout ll = findViewById(R.id.llMapLayout);
                ll.setVisibility(View.INVISIBLE);
            }
        });
    }


}
