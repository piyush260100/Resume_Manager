package com.example.rp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import static com.example.rp.R.id.Quiz_Time_buton;

public class HomeActivity extends AppCompatActivity {

    ConstraintLayout resume_view;
    ConstraintLayout quiz_view;
    ConstraintLayout announcement_view;
    Button editprofile;
    Button log_out;

    Databasehelper db;
    DrawerLayout dl;
    TextView name, email;
    ImageView image;
    NavigationView nv;
    SharedPreferences pref;
    Button edit, logout;

    private int[] img = {R.drawable.boy, R.drawable.girl1, R.drawable.boyspecs, R.drawable.girl2, R.drawable.man, R.drawable.girl, R.drawable.boynormal, R.drawable.girl3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        resume_view=findViewById(R.id.resume_creator_view);
        announcement_view=findViewById(R.id.announcement_view);
        quiz_view=findViewById(R.id.quiz_view);
        editprofile=findViewById(R.id.edit_profile);
        log_out=findViewById(R.id.logout);

        db = new Databasehelper(this);
        nv = findViewById(R.id.nav_view);
        View v = nv.getHeaderView(0);
        pref = getApplicationContext().getSharedPreferences("mypref", MODE_PRIVATE);
        name = v.findViewById(R.id.navHeadName);
        email = v.findViewById(R.id.navHeadEmail);
        image = v.findViewById(R.id.navHeadImage);

        String ema = pref.getString("KEY_USER", null);

        if (!ema.equals("admin")) {
            name.setText(db.getName(ema));
            email.setText(ema);
            image.setImageResource(img[db.getImagid(ema)]);
        }



        resume_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(view.getContext(), ResumeCreator.class);
                view.getContext().startActivity(intent1);}
        });

        quiz_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(view.getContext(), QuizTime.class);
                view.getContext().startActivity(intent2);}
        });

        announcement_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(view.getContext(), Announcements.class);
                view.getContext().startActivity(intent3);}
        });

        editprofile.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(view.getContext(), Edit_Profile.class);
                view.getContext().startActivity(intent4);
            }
        });

        log_out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor edit = pref.edit();
                edit.clear();
                edit.apply();
                Intent intent = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });



    }
}