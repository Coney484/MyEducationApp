package com.example.myeducationapp;

public class Course {
   private String courseTitle, courseDescription, courseColor;
    private int courseImage;

    public Course(String courseTitle, String courseDescription,  int courseImage,String courseColor) {
        this.courseTitle = courseTitle;
        this.courseDescription = courseDescription;
        this.courseImage = courseImage;
        this.courseColor = courseColor;

    }

    public String getCourseTitle() {
        return courseTitle;
    }


    public String getCourseDescription() {
        return courseDescription;
    }


    public String getCourseColor() {
        return courseColor;
    }


    public int getCourseImage() {
        return courseImage;
    }
}
