package com.pursuit.viewpagerexercise;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Fragment> fragmentList = new ArrayList<>();

        fragmentList.add(DisplayFragment.newInstance("Mercury", "1", "https://www.go-astronomy.com/images/planets/planet-mercury.jpg"));
        fragmentList.add(DisplayFragment.newInstance("Venus", "2", "https://surrealsciencestuff.files.wordpress.com/2014/09/planets3.jpg"));
        fragmentList.add(DisplayFragment.newInstance("Earth", "3", "https://cdn.britannica.com/700x450/25/160325-004-AD594C66.jpg"));
        fragmentList.add(DisplayFragment.newInstance("Mars", "4", "https://d.ibtimes.co.uk/en/full/403889/planet-mars.jpg"));
        fragmentList.add(DisplayFragment.newInstance("Jupiter", "5", "https://www.cool2bkids.com/wp-content/uploads/2014/05/Jupiter-Picture.jpg"));
        fragmentList.add(DisplayFragment.newInstance("Saturn", "6", "https://www.yourdictionary.com/images/definitions/lg/8616.saturn.jpg"));
        fragmentList.add(DisplayFragment.newInstance("Uranus", "7", "https://www.startrekdb.se/astronomi/bilder/uranus2.jpg"));
        fragmentList.add(DisplayFragment.newInstance("Neptune", "8", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/56/Neptune_Full.jpg/1200px-Neptune_Full.jpg"));

        ViewPager viewPager = findViewById(R.id.mainActivity_viewPager);
        viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager(), fragmentList));
    }
    }
