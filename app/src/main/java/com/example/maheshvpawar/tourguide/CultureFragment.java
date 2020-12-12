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
        places.add(new Place(R.drawable.mumbadevi, getString(R.string.mumba_devi)));
        places.add(new Place(R.drawable.siddhivianayak,getString(R.string.siddhivinayak_temple)));
        places.add(new Place(R.drawable.mahalakshmi, getString(R.string.mahalakshmi_temple)));
        places.add(new Place(R.drawable.babulnath, getString(R.string.babulnath_temple)));
        places.add(new Place(R.drawable.iskon_juhu, getString(R.string.iskon_juhu)));
        places.add(new Place(R.drawable.baps,getString(R.string.swaminarayan_mandir)));
        places.add(new Place(R.drawable.haji_ali,getString(R.string.haji_ali)));
        places.add(new Place(R.drawable.st_thomas_cathedral,getString(R.string.st_thomas)));
        places.add(new Place(R.drawable.global_vipasana_pagoda,getString(R.string.global_vipassana_pagoda)));
        places.add(new Place(R.drawable.bandra_fort,getString(R.string.bandra_fort)));
        places.add(new Place(R.drawable.vasai_fort,getString(R.string.vasai_fort)));
        places.add(new Place(R.drawable.elephanta_caves,getString(R.string.elephanta_caves)));
        places.add(new Place(R.drawable.kanheri_caves,getString(R.string.kanheri_caves)));

        //  Creating object of an PlaceAdapter
        final PlaceAdapter adapter=new PlaceAdapter(getActivity(),places);
        ListView listView=(ListView)rootView.findViewById(R.id.list);
        // Set adapter on ListView object
        listView.setAdapter(adapter);
        return rootView;
    }
}