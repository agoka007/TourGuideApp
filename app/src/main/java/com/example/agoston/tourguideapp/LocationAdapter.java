package com.example.agoston.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {


    public LocationAdapter(Context context, ArrayList<Location> location) {
        super(context, 0, location);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Location currentLocation = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.placeNameView);
        nameTextView.setText(currentLocation.getName());

        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.descriptionView);
        descriptionTextView.setText(currentLocation.getDescription());

        TextView addressTextView = (TextView) listItemView.findViewById(R.id.addressView);
        addressTextView.setText(currentLocation.getAddress());

        TextView phoneTextView = (TextView) listItemView.findViewById(R.id.phoneView);
        phoneTextView.setText(currentLocation.getPhone());

        TextView timeTextView = (TextView) listItemView.findViewById(R.id.timeView);
        timeTextView.setText(currentLocation.getTime());

        TextView webTextView = (TextView) listItemView.findViewById(R.id.webView);
        webTextView.setText(currentLocation.getWeb());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.photoView);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        iconView.setImageResource(currentLocation.getImageResourceId());

        return listItemView;
    }
}