package com.chopik_andrew.balinasofttest.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.chopik_andrew.balinasofttest.App;
import com.chopik_andrew.balinasofttest.R;
import com.chopik_andrew.balinasofttest.fragments.LogInFragment;
import com.chopik_andrew.balinasofttest.fragments.SignUpFragment;

/**
 * Created by Andrew on 03.10.2017.
 */

public class LogInPagerAdapter extends FragmentPagerAdapter {

    public static final int PAGE_COUNT = 2;
    public static final int POSITION_LOG_IN = 0;
    public static final int POSITION_SIGN_UP = 1;

    public LogInPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case POSITION_LOG_IN:
                return LogInFragment.newInstance();
            case POSITION_SIGN_UP:
                return SignUpFragment.newInstance();
            default:
                throw new IllegalArgumentException("Bad Fragment type exception");
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case POSITION_LOG_IN:
                return App.getInstance().getString(R.string.login);
            case POSITION_SIGN_UP:
                return App.getInstance().getString(R.string.register);
            default:
                return super.getPageTitle(position);
        }
    }
}
