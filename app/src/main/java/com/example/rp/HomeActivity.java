package com.example.rp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    ConstraintLayout resume;
    ConstraintLayout quiz;
    ConstraintLayout announcement;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        resume=findViewById(R.id.resume_creator_view);
        quiz=findViewById(R.id.quiz_view);
        announcement=findViewById(R.id.announcement_view);

        resume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), resume_creator.class);
                view.getContext().startActivity(intent);}
        });

        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), quiz_time.class);
                view.getContext().startActivity(intent);}
        });

        announcement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Announcements.class);
                view.getContext().startActivity(intent);}
        });


    }
}