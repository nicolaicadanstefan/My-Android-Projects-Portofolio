package com.nicolaicadanstefan.stefansandroidprojects;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView list = findViewById(R.id.recycle_view_projects);

        Project[] projects = {
                new Project("Getting Started App", "The first project, the default 'Hello World' app!", R.drawable.getting_started),
                new Project("Stefan Quote", "Making a simple change to the layout, with my own personal motivation quote for software developers", R.drawable.quote),
                new Project("Inches Converter","A basic converter to convert inches to meters",R.drawable.tape),
                new Project("BMI Calculator", "A real life working BMI calculator teaching me Variables, Methods and Conditional Logic", R.drawable.calculator),
                new Project("The Hungry Developer", "A menu app for a fictional restaurant, learning about Activities, Classes & Objects, Arrays, Intents and ListViews", R.drawable.hungry_developer),
                new Project("Bucket list","An app for things to do and places to go in the near future",R.drawable.bucket_list),
                new Project("The Self Promo app", "App for promoting different developer and contacting them",R.drawable.promotion_app)

        };

        ProjectsAdapter adapter = new ProjectsAdapter(projects);

        list.setAdapter(adapter);
    }
}