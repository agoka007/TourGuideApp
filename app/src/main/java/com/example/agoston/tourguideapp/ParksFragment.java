package com.example.agoston.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ParksFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle sacedInstanceState) {
        View rootView = inflater.inflate(R.layout.locations_list, container, false);
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.park_1_name, R.string.park_1_description,
                R.string.park_1_address, R.string.park_1_time,
                R.string.park_1_phone, R.string.park_1_web, R.drawable.img_park_1));
        locations.add(new Location(R.string.park_2_name, R.string.park_2_description, R.string.park_2_address, R.string.park_2_time, R.string.park_2_phone, R.string.park_2_web, R.drawable.img_park_2));
        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations);

        ListView listView = (ListView) rootView.findViewById(R.id.listView);
        listView.setAdapter(locationAdapter);
        return rootView;
    }
}