package com.example.rp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import static com.example.rp.R.id.Quiz_Time_buton;

public class HomeActivity extends AppCompatActivity {

    ConstraintLayout resume_view;
    ConstraintLayout quiz_view;
    ConstraintLayout announcement_view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        resume_view=findViewById(R.id.resume_creator_view);
        announcement_view=findViewById(R.id.announcement_view);
        quiz_view=findViewById(R.id.announcement_view);

        resume_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(view.getContext(), resume_creator.class);
                view.getContext().startActivity(intent1);}
        });

        quiz_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(view.getContext(), quiz_time.class);
                view.getContext().startActivity(intent2);}
        });

        announcement_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(view.getContext(), Announcements.class);
                view.getContext().startActivity(intent3);}
        });


    }
}