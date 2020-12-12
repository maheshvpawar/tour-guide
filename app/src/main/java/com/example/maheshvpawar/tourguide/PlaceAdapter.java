package com.example.maheshvpawar.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place> {

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * This context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context The current context. Used to inflate the layout file.
     * @param places  A list of Place objects to display in a list.
     */
    public PlaceAdapter(Context context, ArrayList<Place> places) {
        super(context, 0, places);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //  Get the {@link Place} object located at this location in the list.
        Place currentPlace = getItem(position);

        //  Check if the exixting view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        //  Set ImageResource to the ImageView
        ImageView placeImageView=(ImageView)listItemView.findViewById(R.id.image_view);
        placeImageView.setImageResource(currentPlace.getmImageResourceID());

        //  Set Text to the TextView
        TextView placeTitleTextView =(TextView)listItemView.findViewById(R.id.place_title_text_view);
        placeTitleTextView.setText(currentPlace.getmPlaceTitle());

        //  Return the whole list item layout ( containing 1 ImageView & 1 TextView)
        // so that it can be shown in ListView
        return listItemView;
    }
}
