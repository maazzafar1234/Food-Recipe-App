package com.example.foodrecipe;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;

public class Dinner extends AppCompatActivity {
    ViewPager mViewPager;
    // images array
    int[] images = {R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4,
            R.drawable.image5};
    // Creating Object of ViewPagerAdapter
    ViewPagerAdapter mViewPagerAdapter;
    AutoCompleteTextView first ;
    String []a1 = {"Cauliflower","Coriander Leaf","Corn","Red Chilli",
            "Carrot","Tomato", "Cluster Beans", "Brinjal","Bengal Gram","Capsicum",
            "Fenugreek Leaf","Onion","Potato", "Garlic","Lady Finger","Green chilli",
            "Mushroom","Peas" , "Peppermint ","Radish","Spinach",
            "Spring Onion","Sweet Potato","Cabbage","Pumpkin",
            "Bitter Melon","keri"};
    String  s2 ;
    TextView info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinner);
        info = findViewById(R.id.not);
        info.postDelayed(new Runnable() {
            @Override
            public void run() {
                info.setVisibility(View.GONE);
            }
        },12000);
        LunchData obj = new LunchData("First", R.drawable.kofta, "Recipe");
        LunchData[] myListData = new LunchData[]{
                new LunchData("Special Pulav", R.drawable.pulav, "Recipe"),
                new LunchData("Fried Shejwan Rice", R.drawable.friedrice, "Recipe"),
                new LunchData("Dal Khichadi", R.drawable.dalk, "Recipe"),
                new LunchData("Chesse Khichadi", R.drawable.k1, "Recipe"),
                new LunchData("Pasta", R.drawable.pasta, "Recipe"),
                new LunchData("Veg Biryani", R.drawable.biryani, "Recipe"),
                new LunchData("Dal Makhani", R.drawable.dalmkh, "Recipe"),
                new LunchData("Dal Pakwan", R.drawable.dalpakwan, "Recipe"),
        };
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        DinnerAdapter adapter1 = new DinnerAdapter(this, myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.setAdapter(adapter1);
        first = findViewById(R.id.secondary);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item,a1);
        first.setThreshold(1);
        first.setAdapter(adapter);
        first.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                s2 = ((TextView)view).getText().toString();
                if(s2.equals("Corn"))
                {
                    Intent z = new Intent(Dinner.this,Corn.class);
                    startActivity(z);
                }
                else if(s2.equals("Cauliflower"))
                {
                    Intent z = new Intent(Dinner.this,Cauliflower.class);
                    startActivity(z);
                }
                else if(s2.equals("Coriander Leaf"))
                {
                    Intent z = new Intent(Dinner.this,CorianderLeaf.class);
                    startActivity(z);
                }
                else if(s2.equals("Red Chilli"))
                {
                    Intent z = new Intent(Dinner.this,RedChilli.class);
                    startActivity(z);
                }
                else if(s2.equals("Carrot"))
                {
                    Intent z = new Intent(Dinner.this,Carrot.class);
                    startActivity(z);
                }
                else if(s2.equals("Tomato"))
                {
                    Intent z = new Intent(Dinner.this,Tomato.class);
                    startActivity(z);
                }
                else if(s2.equals("Cluster Beans"))
                {
                    Intent z = new Intent(Dinner.this,ClusterBeans.class);
                    startActivity(z);
                }
                else if(s2.equals("Brinjal"))
                {
                    Intent z = new Intent(Dinner.this,Brinjal.class);
                    startActivity(z);
                }
                else if(s2.equals("Bengal Gram"))
                {
                    Intent z = new Intent(Dinner.this,BengalGram.class);
                    startActivity(z);
                }
                else if(s2.equals("Capsicum"))
                {
                    Intent z = new Intent(Dinner.this,Capsicum.class);
                    startActivity(z);
                }
                else if(s2.equals("Fenugreek Leaf"))
                {
                    Intent z = new Intent(Dinner.this,FenugreekLeaf.class);
                    startActivity(z);
                }
                else if(s2.equals("Onion"))
                {
                    Intent z = new Intent(Dinner.this,Onion.class);
                    startActivity(z);
                }
                else if(s2.equals("Potato"))
                {
                    Intent z = new Intent(Dinner.this,Potato.class);
                    startActivity(z);
                }
                else if(s2.equals("Garlic"))
                {
                    Intent z = new Intent(Dinner.this,Garlic.class);
                    startActivity(z);
                }
                else if(s2.equals("Lady Finger"))
                {
                    Intent z = new Intent(Dinner.this,LadyFinger.class);
                    startActivity(z);
                }
                else if(s2.equals("Green chilli"))
                {
                    Intent z = new Intent(Dinner.this,Greenchilli.class);
                    startActivity(z);
                }
                else if(s2.equals("Mushroom"))
                {
                    Intent z = new Intent(Dinner.this,Mushroom.class);
                    startActivity(z);
                }
                else if(s2.equals("Peas"))
                {
                    Intent z = new Intent(Dinner.this,Peas.class);
                    startActivity(z);
                }
                else if(s2.equals("Peppermint"))
                {
                    Intent z = new Intent(Dinner.this,Peppermint.class);
                    startActivity(z);
                }
                else if(s2.equals("Radish"))
                {
                    Intent z = new Intent(Dinner.this,Radish.class);
                    startActivity(z);
                }
                else if(s2.equals("Spinach"))
                {
                    Intent z = new Intent(Dinner.this,Spinach.class);
                    startActivity(z);
                }
                else if(s2.equals("Spring Onion"))
                {
                    Intent z = new Intent(Dinner.this,SpringOnion.class);
                    startActivity(z);
                }
                else if(s2.equals("Sweet Potato"))
                {
                    Intent z = new Intent(Dinner.this,SweetPotato.class);
                    startActivity(z);
                }
                else if(s2.equals("Cabbage"))
                {
                    Intent z = new Intent(Dinner.this,Cabbage.class);
                    startActivity(z);
                }
                else if(s2.equals("Pumpkin"))
                {
                    Intent z = new Intent(Dinner.this,Pumpkin.class);
                    startActivity(z);
                }
                else if(s2.equals("Bitter Melon"))
                {
                    Intent z = new Intent(Dinner.this,BitterMelon.class);
                    startActivity(z);
                }
                else if(s2.equals("keri"))
                {
                    Intent z = new Intent(Dinner.this,keri.class);
                    startActivity(z);
                }
            }

        });
        /* Initializing the ViewPager Object
        mViewPager = (ViewPager) findViewById(R.id.viewPagerMain);
        // Initializing the ViewPagerAdapter
        mViewPagerAdapter = new ViewPagerAdapter(Dinner.this, images);
        // Adding the Adapter to the ViewPager
        mViewPager.setAdapter(mViewPagerAdapter);*/

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
            Intent i = new Intent(Dinner.this,lunchRecipes.class);
            startActivity(i);
        }
        else if(id==R.id.dinner)
        {
            Intent i = new Intent(Dinner.this,Dinner.class);
            startActivity(i);
        }
        else if(id==R.id.breakfast)
        {
            Intent i = new Intent(Dinner.this,Breakfast.class);
            startActivity(i);
        }
        else if(id==R.id.fastfood)
        {
            Intent i = new Intent(Dinner.this,FastFood.class);
            startActivity(i);
        }
        else if(id==R.id.mexio)
        {
            Intent i = new Intent(Dinner.this,Mexicon.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }
}