package com.example.android.registeration;
import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.android.registeration.R;

import java.util.List;

import static com.example.android.registeration.R.id.imageView;

/**
 * Created by user on 9/2/2017.
 */

public class MyAdapter extends PagerAdapter
{

    List<Integer> lstImages;
    Context context;
    LayoutInflater layoutInflater;
   // ImageView imageView=new ImageView(Context context);

    public MyAdapter(List<Integer> lstImages, Context context)
    {
        this.lstImages=lstImages;
        this.context=context;
        layoutInflater=LayoutInflater.from(context);
    }


    @Override
    public int getCount()
    {
        return lstImages.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object)
    {
        return view.equals(object);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object)
    {
        container.removeView((View)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position)
    {
      View view=layoutInflater.inflate(R.layout.card_item,container,false);
        ImageView imageView=(ImageView)view.findViewById(R.id.imageView);
        imageView.setImageResource(lstImages.get(position));
        container.addView(view);
        return view;
    }

}
