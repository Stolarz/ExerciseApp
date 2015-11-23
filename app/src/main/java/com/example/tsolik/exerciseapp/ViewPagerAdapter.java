package com.example.tsolik.exerciseapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by tsolik on 2015-11-23.
 */
public class ViewPagerAdapter extends FragmentStatePagerAdapter{
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return new ButtonFragment();
    }

    @Override
    public int getCount() {
        return 5;
    }
}
