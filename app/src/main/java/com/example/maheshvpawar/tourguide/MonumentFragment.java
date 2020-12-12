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

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MonumentFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Creating the View that returns all the views on the fragment
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        //  Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.drawable.gateway_of_india, getString(R.string.gateway_of_india)));
        places.add(new Place(R.drawable.cst,getString(R.string.cst)));
        places.add(new Place(R.drawable.shivaji_maharaj,getString(R.string.shivaji_maharaj_sangrahalaya)));
        places.add(new Place(R.drawable.mnc,getString(R.string.mumbai_municipal_corp)));
        places.add(new Place(R.drawable.rajabai_clock_tower,getString(R.string.rajabai_tower)));
        places.add(new Place(R.drawable.asiatic_society_hall,getString(R.string.asiatic_society_hall)));
        places.add(new Place(R.drawable.david_sasson_lib,getString(R.string.david_sassoon_library_room)));
        places.add(new Place(R.drawable.nationalgalleryofart,getString(R.string.national_gallery_of_modern_art)));

        //  Creating object of an PlaceAdapter
        final PlaceAdapter adapter=new PlaceAdapter(getActivity(),places);
        ListView listView=(ListView)rootView.findViewById(R.id.list);
        // Set adapter on ListView object
        listView.setAdapter(adapter);

        return rootView;
    }

}