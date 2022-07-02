package com.example.expandablefloatingactionbutton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.getbase.floatingactionbutton.FloatingActionButton;
import com.getbase.floatingactionbutton.FloatingActionsMenu;

public class MainActivity extends AppCompatActivity {

    FloatingActionsMenu fab_Menu;
    FloatingActionButton fab_call, fab_about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        fab_Menu = findViewById(R.id.fab_Menu);
        fab_call = findViewById(R.id.fab_call);
        fab_about = findViewById(R.id.fab_about);

        //fab_Menu.setBackgroundColor(getResources().getColor(R.color.purple_200));


        fab_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "Call is Clicked", Toast.LENGTH_SHORT).show();
                fab_Menu.collapse();
            }
        });

        fab_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "About is Clicked", Toast.LENGTH_SHORT).show();
                fab_Menu.collapse();
            }
        });
    }
}