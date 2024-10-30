package com.example.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    private ArrayAdapter<String> adapter;
    private ArrayList<String> items;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        items = new ArrayList<>();
        items.add("C. Elem");
        items.add("A. Elem");
        items.add("B. Elem");

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);
        listView.setAdapter(adapter);

        registerForContextMenu(listView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_sort) {
            Collections.sort(items);
            adapter.notifyDataSetChanged();
            return true;
        } else if (item.getItemId() == R.id.action_delete) {
            items.clear();
            adapter.notifyDataSetChanged();
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Szín kiválasztása");
        menu.add(0, v.getId(), 0, "Piros");
        menu.add(0, v.getId(), 1, "Zöld");
        menu.add(0, v.getId(), 2, "Sárga");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();

        if (info != null && info.position >= 0 && info.position < listView.getCount()) {
            View listItemView = listView.getChildAt(info.position - listView.getFirstVisiblePosition());

            if (listItemView instanceof TextView) {
                TextView textView = (TextView) listItemView;
                switch (item.getTitle().toString()) {
                    case "Piros":
                        textView.setTextColor(Color.RED);
                        break;
                    case "Zöld":
                        textView.setTextColor(Color.GREEN);
                        break;
                    case "Sárga":
                        textView.setTextColor(Color.YELLOW);
                        break;
                }
            }
        }
        return true;
    }
}
