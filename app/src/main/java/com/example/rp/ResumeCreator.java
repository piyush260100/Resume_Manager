package com.example.rp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationMenu;

public class ResumeCreator extends AppCompatActivity {

    View personal_info;
    View education;
    View skill;
    View achievements;
    View projects;
    View objective;
    TextView name,email;
    ImageView image;;
    View bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__resume___creator);

        personal_info=findViewById(R.id.personal_details_view);
        education=findViewById(R.id.education_view);
        skill=findViewById(R.id.skill_view);
        achievements=findViewById(R.id.achievement_view);
        projects=findViewById(R.id.project_view);
        objective=findViewById(R.id.objective_view);
        name = findViewById(R.id.navHeadName);
        email = findViewById(R.id.navHeadEmail);
        image = findViewById(R.id.navHeadImage);
        bottomNavigationView = findViewById(R.id.bottomNavigationView2);

        personal_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), personal_detail.class);
                view.getContext().startActivity(intent);}
        });


        education.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), education.class);
                view.getContext().startActivity(intent);}
        });

        skill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), skill.class);
                view.getContext().startActivity(intent);}
        });

        achievements.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), achievement.class);
                view.getContext().startActivity(intent);}
        });

        projects.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), project.class);
                view.getContext().startActivity(intent);}
        });

        objective.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), objective.class);
                view.getContext().startActivity(intent);}
        });


    }
}