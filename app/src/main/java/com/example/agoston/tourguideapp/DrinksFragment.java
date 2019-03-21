package com.example.agoston.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class DrinksFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle sacedInstanceState) {
        View rootView = inflater.inflate(R.layout.locations_list, container, false);
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.drink_1_name, R.string.drink_1_description,
                R.string.drink_1_address, R.string.drink_1_time,
                R.string.drink_1_phone, R.string.drink_1_web, R.drawable.img_drink_1));
        locations.add(new Location(R.string.drink_2_name, R.string.drink_2_description, R.string.drink_2_address, R.string.drink_2_time, R.string.drink_2_phone, R.string.drink_2_web, R.drawable.img_drink_2));
        locations.add(new Location(R.string.drink_3_name, R.string.drink_3_description,
                R.string.drink_3_address, R.string.drink_3_time,
                R.string.drink_3_phone, R.string.drink_3_web, R.drawable.img_drink_3));
        locations.add(new Location(R.string.drink_4_name, R.string.drink_4_description,
                R.string.drink_4_address, R.string.drink_4_time,
                R.string.drink_4_phone, R.string.drink_4_web, R.drawable.img_drink_4));
        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations);

        ListView listView = (ListView) rootView.findViewById(R.id.listView);
        listView.setAdapter(locationAdapter);
        return rootView;
    }
}