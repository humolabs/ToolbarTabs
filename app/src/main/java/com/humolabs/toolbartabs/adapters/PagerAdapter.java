package com.humolabs.toolbartabs.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.humolabs.toolbartabs.fragments.FirstFragment;
import com.humolabs.toolbartabs.fragments.SecondFragment;
import com.humolabs.toolbartabs.fragments.ThirdFragment;

/**
 * Created by rodo on 13/5/2017.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {

    private int mNumberOfTabs;

    public PagerAdapter(FragmentManager fm, int numberOfTabs) {
        super(fm);
        this.mNumberOfTabs = numberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new FirstFragment();
            case 1:
                return new SecondFragment();
            case 2:
                return new ThirdFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumberOfTabs;
    }
}
