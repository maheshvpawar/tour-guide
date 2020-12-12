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
        places.add(new Place(R.drawable.gateway_of_india, "Gateway Of India"));
        places.add(new Place(R.drawable.cst,"Chhatrapati Shivaji Maharaj Terminus"));
        places.add(new Place(R.drawable.shivaji_maharaj,"Chhatrapati Shivaji Maharaj Vastu Sangrahalaya"));
        places.add(new Place(R.drawable.mnc,"Brihanmumbai Municipal Corporation"));
        places.add(new Place(R.drawable.rajabai_clock_tower,"Rajabai Clock Tower"));
        places.add(new Place(R.drawable.asiatic_society_hall,"The Asiatic Society of Mumbai Town Hall"));
        places.add(new Place(R.drawable.david_sasson_lib,"David Sassoon Library and Reading Room"));
        places.add(new Place(R.drawable.nationalgalleryofart,"National Gallery of Modern Art"));

        //  Creating object of an PlaceAdapter
        final PlaceAdapter adapter=new PlaceAdapter(getActivity(),places);
        ListView listView=(ListView)rootView.findViewById(R.id.list);
        // Set adapter on ListView object
        listView.setAdapter(adapter);

        return rootView;
    }

}