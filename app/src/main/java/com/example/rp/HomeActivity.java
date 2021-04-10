package com.example.rp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;

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

    }
}