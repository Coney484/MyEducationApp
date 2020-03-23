package com.example.myeducationapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Course> courses;
    private RecyclerView rvCourse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCourse = findViewById(R.id.recycleView_course);

        //providedata
        courseData();

        //showrecycleView
        showRecycleViewCard();
    }

    public void showRecycleViewCard()
    {
        rvCourse.setLayoutManager(new LinearLayoutManager(this));
        CardViewCourseAdapter cardViewCourseAdapter = new CardViewCourseAdapter(this);
        cardViewCourseAdapter.setListCourse(courses);
        rvCourse.setAdapter(cardViewCourseAdapter);
    }

    private void courseData()
    {
        courses = new ArrayList<>();
        courses.add(new Course("Android Basics","Android Development, Building\nLayouts, Android Studio, Views",R.drawable.ic_android_fill,"#40D7CB"));
        courses.add(new Course("UI UX Fundamentals","User Interface, User Experience,\nPrototyping, Interactive Design",R.drawable.ic_ui_ux,"#FC46A5"));
        courses.add(new Course("Full Stack Web Development","Python, JavaScript, PostgresSQL, \n Flask, Docker, Kubernetes",R.drawable.ic_react,"#F14C50"));
        courses.add(new Course("Android Intermediate","Data Binding, API & REST API, \n Databases, Firebase and more",R.drawable.ic_android_fill,"#1E59F6"));
        courses.add(new Course("Data Visualization","Combine data, visuals, and narrative to tell\nimpacting stories and more",R.drawable.ic_database,"#6A2C91"));
        courses.add(new Course("Cloud Developer","Cloud development is the foundation for\n the new world of data computing and more",R.drawable.ic_cloud,"#F79919"));
        courses.add(new Course("UI UX Fundamentals","Data Engineering is the foundation for \n the new world of Big Data and more",R.drawable.ic_bargraph,"#1C546F"));
        courses.add(new Course("Market Analyst","Gain foundational data skills applicable to marketing\nworld",R.drawable.ic_market,"#F9E79F"));

        courses.add(new Course("Android Basics","Android Development, Building\nLayouts, Android Studio, Views",R.drawable.ic_android_fill,"#40D7CB"));
        courses.add(new Course("UI UX Fundamentals","User Interface, User Experience,\nPrototyping, Interactive Design",R.drawable.ic_ui_ux,"#FC46A5"));
        courses.add(new Course("Full Stack Web Development","Python, JavaScript, PostgresSQL, \n Flask, Docker, Kubernetes",R.drawable.ic_react,"#F14C50"));
        courses.add(new Course("Android Intermediate","Data Binding, API & REST API, \n Databases, Firebase and more",R.drawable.ic_android_fill,"#1E59F6"));
        courses.add(new Course("Data Visualization","Combine data, visuals, and narrative to tell\nimpacting stories and more",R.drawable.ic_database,"#6A2C91"));
        courses.add(new Course("Cloud Developer","Cloud development is the foundation for\n the new world of data computing and more",R.drawable.ic_cloud,"#F79919"));
        courses.add(new Course("UI UX Fundamentals","Data Engineering is the foundation for \n the new world of Big Data and more",R.drawable.ic_bargraph,"#1C546F"));
        courses.add(new Course("Market Analyst","Gain foundational data skills applicable to marketing\nworld",R.drawable.ic_market,"#F9E79F"));

        courses.add(new Course("Android Basics","Android Development, Building\nLayouts, Android Studio, Views",R.drawable.ic_android_fill,"#40D7CB"));
        courses.add(new Course("UI UX Fundamentals","User Interface, User Experience,\nPrototyping, Interactive Design",R.drawable.ic_ui_ux,"#FC46A5"));
        courses.add(new Course("Full Stack Web Development","Python, JavaScript, PostgresSQL, \n Flask, Docker, Kubernetes",R.drawable.ic_react,"#F14C50"));
        courses.add(new Course("Android Intermediate","Data Binding, API & REST API, \n Databases, Firebase and more",R.drawable.ic_android_fill,"#1E59F6"));
        courses.add(new Course("Data Visualization","Combine data, visuals, and narrative to tell\nimpacting stories and more",R.drawable.ic_database,"#6A2C91"));
        courses.add(new Course("Cloud Developer","Cloud development is the foundation for\n the new world of data computing and more",R.drawable.ic_cloud,"#F79919"));
        courses.add(new Course("UI UX Fundamentals","Data Engineering is the foundation for \n the new world of Big Data and more",R.drawable.ic_bargraph,"#1C546F"));
        courses.add(new Course("Market Analyst","Gain foundational data skills applicable to marketing\nworld",R.drawable.ic_market,"#F9E79F"));

        courses.add(new Course("Android Basics","Android Development, Building\nLayouts, Android Studio, Views",R.drawable.ic_android_fill,"#40D7CB"));
        courses.add(new Course("UI UX Fundamentals","User Interface, User Experience,\nPrototyping, Interactive Design",R.drawable.ic_ui_ux,"#FC46A5"));
        courses.add(new Course("Full Stack Web Development","Python, JavaScript, PostgresSQL, \n Flask, Docker, Kubernetes",R.drawable.ic_react,"#F14C50"));
        courses.add(new Course("Android Intermediate","Data Binding, API & REST API, \n Databases, Firebase and more",R.drawable.ic_android_fill,"#1E59F6"));
        courses.add(new Course("Data Visualization","Combine data, visuals, and narrative to tell\nimpacting stories and more",R.drawable.ic_database,"#6A2C91"));
        courses.add(new Course("Cloud Developer","Cloud development is the foundation for\n the new world of data computing and more",R.drawable.ic_cloud,"#F79919"));
        courses.add(new Course("UI UX Fundamentals","Data Engineering is the foundation for \n the new world of Big Data and more",R.drawable.ic_bargraph,"#1C546F"));
        courses.add(new Course("Market Analyst","Gain foundational data skills applicable to marketing\nworld",R.drawable.ic_market,"#F9E79F"));


    }
}
