package com.example.myeducationapp;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CardViewCourseAdapter extends RecyclerView.Adapter<CardViewCourseAdapter.CardViewHolder> {

    private Context context;
    private ArrayList<Course> courses;



    private ArrayList<Course> getListCourses() {
        return courses;
    }

    public CardViewCourseAdapter(Context context) {
        this.context = context;
    }
    public void setListCourse(ArrayList<Course> course) {
        this.courses = course;
    }


    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview_course, parent, false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        Course course = getListCourses().get(position);
        holder.tvCourseTitle.setText(course.getCourseTitle());
        holder.tvCourseDescription.setText(course.getCourseDescription());
        holder.imageView.setImageResource(course.getCourseImage());
        holder.cardViewBackground.setCardBackgroundColor(Color.parseColor(course.getCourseColor() ));
        holder.cardViewCointainer.setAnimation(AnimationUtils.loadAnimation(context,R.anim.fade_scale_aniimation));

    }

    @Override
    public int getItemCount() {
        return getListCourses().size();
    }
    public class CardViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView tvCourseTitle, tvCourseDescription;
        CardView cardViewBackground, cardViewCointainer;

        public CardViewHolder(View view) {
            super(view);

            imageView = itemView.findViewById(R.id.img_item_course);
            tvCourseTitle = itemView.findViewById(R.id.tv_item_title);
            tvCourseDescription = itemView.findViewById(R.id.tv_item_description);
            cardViewBackground = itemView.findViewById(R.id.card_view_background);
            cardViewCointainer = itemView.findViewById(R.id.cointainer);

        }
    }
}




