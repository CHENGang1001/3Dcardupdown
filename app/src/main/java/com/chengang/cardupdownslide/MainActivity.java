package com.chengang.cardupdownslide;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = (RecyclerView) findViewById(R.id.rv);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        initializeData();
        RVAdapter adapter = new RVAdapter(persons,this);
        rv.setAdapter(adapter);
    }

    private List<Person> persons;

    // This method creates an ArrayList that has three Person objects
// Checkout the project associated with this tutorial on Github if
// you want to use the same images.
    private void initializeData(){
        persons = new ArrayList<>();
        persons.add(new Person("Emma Wilson", "23 years old", R.drawable.ic_launcher_background));
        persons.add(new Person("Lavery Maiss", "25 years old", R.drawable.ic_launcher_background));
        persons.add(new Person("Lillie Watts", "35 years old", R.drawable.ic_launcher_background));
        persons.add(new Person("Lillie Watts", "35 years old", R.drawable.ic_launcher_background));
        persons.add(new Person("Lillie Watts", "35 years old", R.drawable.ic_launcher_background));
        persons.add(new Person("Lillie Watts", "35 years old", R.drawable.ic_launcher_background));
        persons.add(new Person("Lillie Watts", "35 years old", R.drawable.ic_launcher_background));
        persons.add(new Person("Lillie Watts", "35 years old", R.drawable.ic_launcher_background));
        persons.add(new Person("Lillie Watts", "35 years old", R.drawable.ic_launcher_background));
    }
}
