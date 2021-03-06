package com.frabbi.londriservice.view.activities;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.List;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    private List<Fragment> fragments;
    private List<String> fTitle;
    public ViewPagerAdapter(@NonNull FragmentManager fm,List<Fragment> fragments,List<String> fTitle) {
        super(fm);
        this.fragments = fragments;
        this.fTitle = fTitle;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return fTitle.get(position);
    }
}
