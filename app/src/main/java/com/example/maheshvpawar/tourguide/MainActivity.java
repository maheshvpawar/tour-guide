/**
 * Copyright 2020 Mahesh V. Pawar
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * */
package com.example.maheshvpawar.tourguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml
        setContentView(R.layout.activity_main);

        // Find the viewpager that will allows user to swipe between fragments
        ViewPager viewPager=(ViewPager)findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        SimpleFragmentPagerAdapter adapter=new SimpleFragmentPagerAdapter(getSupportFragmentManager());

        // Set the adapter onto the viewpager
        viewPager.setAdapter(adapter);

        //Find the TabsLayout to show the tabs to the user
        TabLayout tabLayout=(TabLayout)findViewById(R.id.sliding_tabs);

        // Set up the TabLayout with the ViewPager
        tabLayout.setupWithViewPager(viewPager);
    }
}