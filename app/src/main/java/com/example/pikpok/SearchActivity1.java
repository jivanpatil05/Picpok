package com.example.pikpok;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SearchActivity1 extends AppCompatActivity {
        ListView listView;
        String[] name={"WatsApp Video","Trending","Funny","Romantic","Classic","Driving","Bloging","Drama"};
        ArrayAdapter<String> arrayAdapter;
        @SuppressLint("MissingInflatedId")
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_search1);


            listView=findViewById(R.id.listview);
            arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,name);
            listView.setAdapter(arrayAdapter);
        }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            getMenuInflater().inflate(R.menu.menu,menu);
            MenuItem menuItem=menu.findItem(R.id.action_search);
            SearchView searchView=(SearchView) menuItem.getActionView();
            searchView.setQueryHint("Type Here To Search");
            searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                @Override
                public boolean onQueryTextSubmit(String query) {
                    return false;
                }

                @Override
                public boolean onQueryTextChange(String newText) {
                    arrayAdapter.getFilter().filter(newText);
                    return false;
                }
            });
            return super.onCreateOptionsMenu(menu);
        }
    }