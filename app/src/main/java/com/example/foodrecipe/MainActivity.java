package com.example.foodrecipe;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    LinearLayout one , two , three , four ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one = findViewById(R.id.first);
        two = findViewById(R.id.second);
        three = findViewById(R.id.third);
        four = findViewById(R.id.four);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, Sweets.class);
                startActivity(in);
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this,lunchRecipes.class);
                startActivity(in);
            }
        }); 
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this,Dinner.class);
                startActivity(in);
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this,Breakfast.class);
                startActivity(in);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.lunch)
        {
            Intent i = new Intent(MainActivity.this,lunchRecipes.class);
            startActivity(i);
        }
        else if(id==R.id.dinner)
        {
            Intent i = new Intent(MainActivity.this,Dinner.class);
            startActivity(i);
        }
        else if(id==R.id.breakfast)
        {
            Intent i = new Intent(MainActivity.this,Breakfast.class);
            startActivity(i);
        }
        else if(id==R.id.fastfood)
        {
            Intent i = new Intent(MainActivity.this,FastFood.class);
            startActivity(i);
        }
        else if(id==R.id.mexio)
        {
            Intent i = new Intent(MainActivity.this,Mexicon.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }
    public void logout(View view) {
        startActivity(new Intent(MainActivity.this, Login_Activity.class));
    }

}
