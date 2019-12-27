package com.example.tab;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            public void onTabSelected(TabLayout.Tab tab) {
                Log.d("MainActivity","here");
                int pos = tab.getPosition();
                Log.d("MainActivity",Integer.toString(pos));
                changeView(pos);
            }

            public void onTabUnselected(TabLayout.Tab tab) {
            }

            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
    }




    private void changeView(int index) {
        TextView testView1 = (TextView) findViewById(R.id.text3);
        TextView testView2 = (TextView) findViewById(R.id.text2);
        ListView testView3 = (ListView) findViewById(R.id.text1);

        switch (index) {
                case 2:
                    testView1.setVisibility(View.VISIBLE);
                    testView2.setVisibility(View.INVISIBLE);
                    testView3.setVisibility(View.INVISIBLE);
                    break;
                case 1:
                    testView1.setVisibility(View.INVISIBLE);
                    testView2.setVisibility(View.VISIBLE);
                    testView3.setVisibility(View.INVISIBLE);
                    break;
                case 0:
                    testView1.setVisibility(View.INVISIBLE);
                    testView2.setVisibility(View.INVISIBLE);
                    testView3.setVisibility(View.VISIBLE);
                break;
        }
    }
}


