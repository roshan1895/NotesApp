package com.example.myapplication.model;


public class OptionItem {
    int menu_img;
    String menu_name;
    public OptionItem()
    {

    }
    public OptionItem(int menu_img,String menu_name)
    {
        this.menu_img=menu_img;
        this.menu_name=menu_name;
    }

    public int getMenu_img() {
        return menu_img;
    }

    public String getMenu_name() {
        return menu_name;
    }
}
