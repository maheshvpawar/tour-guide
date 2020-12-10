package com.example.maheshvpawar.tourguide;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {
    // String array to store tabTitles
    private String tabTitles[] = new String[] { "Culture", "Monuments", "Parks","Shopping" };
    public SimpleFragmentPagerAdapter(FragmentManager fm)
    {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new CultureFragment();
        }else if (position==1){
            return new MonumentFragment();
        }else if (position==2){
            return new ParksFragment();
        }else {
            return new ShoppingFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
