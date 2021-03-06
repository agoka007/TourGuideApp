package com.example.agoston.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {
    private Context mContext;
    public SimpleFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new ParksFragment();
        } else if (position == 1){
            return new FoodsFragment();
        } else if (position == 2) {
            return new DrinksFragment();
        } else {
            return new ShopsFragment();
        }
    }
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_parks);
        } else if (position == 1) {
            return mContext.getString(R.string.category_foods);
        } else if (position == 2) {
            return mContext.getString(R.string.category_drinks);
        } else {
            return mContext.getString(R.string.category_shops);
        }
    }
}