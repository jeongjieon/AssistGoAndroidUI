package com.example.assistgoandroid.Settings;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import com.example.assistgoandroid.R;

public class settingsActivity extends AppCompatActivity {
    ListView listView;
    SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_page_layout);

        //Set up the cells and search bar for settings page
        String[] title =  getResources().getStringArray(R.array.settings_titles);
        int[] images = {R.drawable.profile, R.drawable.perferences, R.drawable.assistgologo,};

        searchView = findViewById(R.id.svContactSearch);
        searchView.clearFocus();

        listView = findViewById(R.id.listView);
        // now create an adapter class
        MyAdapter adapter = new MyAdapter(this, title, images);
        listView.setAdapter(adapter);
        //onclick listener for each cell
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position ==  0) {
                    Intent intent = new Intent(settingsActivity.this, profileActivity.class);
                    startActivity(intent);
                }
                if (position == 1){
                    Intent intent = new Intent(settingsActivity.this,PreferencesActivity.class);
                    startActivity(intent);
                }
                if (position == 2){
                    Intent intent = new Intent(settingsActivity.this, aboutActivity.class);
                    startActivity(intent);
                }

            }
        });

    }
    class MyAdapter extends ArrayAdapter<String> {

        Context context;
        String[] title;
        int[] imgs;

        MyAdapter (Context c, String[] title, int[] imgs) {
            super(c, R.layout.settings_page_cell, R.id.textView1, title);
            this.context = c;
            this.title = title;
            this.imgs = imgs;

        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            @SuppressLint("ViewHolder") View row = layoutInflater.inflate(R.layout.settings_page_cell, parent, false);
            ImageView images = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.textView1);

            // now set our images and title of each cell on the view
            images.setImageResource(imgs[position]);
            myTitle.setText(title[position]);

            return row;
        }
    }

}

