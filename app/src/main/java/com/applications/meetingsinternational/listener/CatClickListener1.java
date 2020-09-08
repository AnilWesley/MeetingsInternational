package com.applications.meetingsinternational.listener;


import com.applications.meetingsinternational.models.Categories;

public interface CatClickListener1 {

    void onAddClick(int position, Categories categories);
    void onRemoveClick(int position, Categories categories);

}
