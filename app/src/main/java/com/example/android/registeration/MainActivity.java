package com.example.android.registeration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Integer> lstImages=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.carousel);

        initData();
        HorizontalInfiniteCycleViewPager pager= (HorizontalInfiniteCycleViewPager)findViewById(R.id.horizontal_cycle);
        MyAdapter adapter=new MyAdapter(lstImages,getBaseContext());
        pager.setAdapter(adapter);
    }
    private void initData()
    {
        lstImages.add(R.drawable.nj);
        lstImages.add(R.drawable.p);
        lstImages.add(R.drawable.images1);
    }
}
