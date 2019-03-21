package com.example.agoston.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ShopsFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle sacedInstanceState) {
        View rootView = inflater.inflate(R.layout.locations_list, container, false);
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.shop_1_name, R.string.shop_1_description,
                R.string.shop_1_address, R.string.shop_1_time,
                R.string.shop_1_phone, R.string.shop_1_web, R.drawable.img_shop_1));
        locations.add(new Location(R.string.shop_2_name, R.string.shop_2_description, R.string.shop_2_address, R.string.shop_2_time, R.string.shop_2_phone, R.string.shop_2_web, R.drawable.img_shop_2));
        locations.add(new Location(R.string.shop_3_name, R.string.shop_3_description,
                R.string.shop_3_address, R.string.shop_3_time,
                R.string.shop_3_phone, R.string.shop_3_web, R.drawable.img_shop_3));
        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations);

        ListView listView = (ListView) rootView.findViewById(R.id.listView);
        listView.setAdapter(locationAdapter);
        return rootView;
    }
}