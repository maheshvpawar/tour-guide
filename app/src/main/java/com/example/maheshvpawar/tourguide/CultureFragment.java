/**
 * Copyright 2020 Mahesh V. Pawar
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.maheshvpawar.tourguide;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class CultureFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Creating the View that returns all the views on the fragment
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        //  Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.drawable.mumbadevi, "Mumba Devi Temple"));
        places.add(new Place(R.drawable.siddhivianayak,"Shri Siddhi Vinayak Ganapati Mandir"));
        places.add(new Place(R.drawable.mahalakshmi, "Shree Mahalakhmi Temple"));
        places.add(new Place(R.drawable.babulnath, "Babulnath Temple"));
        places.add(new Place(R.drawable.iskon_juhu, "International Society for Krishna Consciousness® (ISKCON® - Juhu)"));
        places.add(new Place(R.drawable.baps,"BAPS Shri Swaminarayan Mandir"));
        places.add(new Place(R.drawable.haji_ali,"Haji Ali Dargah"));
        places.add(new Place(R.drawable.st_thomas_cathedral,"St. Thomas Cathedral"));
        places.add(new Place(R.drawable.global_vipasana_pagoda,"Global Vipassana Pagoda"));
        places.add(new Place(R.drawable.bandra_fort,"Bandra Fort"));
        places.add(new Place(R.drawable.vasai_fort,"Vasai Fort"));
        places.add(new Place(R.drawable.elephanta_caves,"Elephanta Caves"));
        places.add(new Place(R.drawable.kanheri_caves,"Kanheri Caves"));

        //  Creating object of an PlaceAdapter
        final PlaceAdapter adapter=new PlaceAdapter(getActivity(),places);
        ListView listView=(ListView)rootView.findViewById(R.id.list);
        // Set adapter on ListView object
        listView.setAdapter(adapter);
        return rootView;
    }
}