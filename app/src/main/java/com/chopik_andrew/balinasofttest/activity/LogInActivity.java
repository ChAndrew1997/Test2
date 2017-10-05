package com.chopik_andrew.balinasofttest.activity;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.chopik_andrew.balinasofttest.R;
import com.chopik_andrew.balinasofttest.adapters.LogInPagerAdapter;

public class LogInActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private LogInPagerAdapter mPagerAdapter;
    private TabLayout mTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setOffscreenPageLimit(LogInPagerAdapter.PAGE_COUNT);
        mPagerAdapter = new LogInPagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mPagerAdapter);

        mTabLayout = (TabLayout) findViewById(R.id.tabLayout);
        mTabLayout.setupWithViewPager(mViewPager);
    }
}
