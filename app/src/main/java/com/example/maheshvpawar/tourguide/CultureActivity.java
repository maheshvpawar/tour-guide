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

import android.os.Bundle;

public class CultureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        // Creating fragment transaction to show it within the container activity
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container,new CultureFragment())
                .commit();
    }
}