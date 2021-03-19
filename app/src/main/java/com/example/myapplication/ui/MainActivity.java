package com.example.myapplication.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.myapplication.R;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
   CardView cardView;
   BottomAppBar bottomAppBar;
   RelativeLayout searchRel;
   FloatingActionButton fab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cardView=findViewById(R.id.card);
        cardView.setBackgroundResource(R.drawable.normal_edit_text_bg);
        searchRel=findViewById(R.id.search_rel);
        fab=findViewById(R.id.fab);
        searchRel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, Activity_Search.class);
                startActivity(intent);
            }
        });
        fab.setColorFilter(Color.WHITE);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, AddNoteActivity.class);
                startActivity(intent);
            }
        });
//        inflateBottomAppBar();
    }

//    private boolean inflateBottomAppBar() {
//        bottomAppBar = findViewById(R.id.bottombar);
//        Menu bottomMenu = bottomAppBar.getMenu();
//        getMenuInflater().inflate(R.menu.bottom_app_menu, bottomMenu);
//        for (int i = 0; i < bottomMenu.size(); i++) {
//            bottomMenu.getItem(i).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
//                @Override
//                public boolean onMenuItemClick(MenuItem menuItem) {
//                    return onOptionsItemSelected(menuItem);
//                }
//            });
//        }
//        return super.onCreateOptionsMenu(bottomMenu);
//    }
}