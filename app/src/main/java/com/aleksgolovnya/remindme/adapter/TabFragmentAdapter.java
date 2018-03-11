package com.aleksgolovnya.remindme.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.aleksgolovnya.remindme.fragment.AbstractTabFragment;
import com.aleksgolovnya.remindme.fragment.BirthdaysFragment;
import com.aleksgolovnya.remindme.fragment.HistoryFragment;
import com.aleksgolovnya.remindme.fragment.IdeasFragment;
import com.aleksgolovnya.remindme.fragment.TodoFragment;

import java.util.HashMap;
import java.util.Map;

public class TabFragmentAdapter extends FragmentPagerAdapter {

    private Map<Integer, AbstractTabFragment> tabs;
    private Context context;

    public TabFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
        initTabsMap(context);
    }

    @Override
    public Fragment getItem(int position) {
        return tabs.get(position);
    }

    @Override
    public int getCount() {
        return tabs.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position).getTitle();
    }

    private void initTabsMap(Context context) {
        tabs = new HashMap<>();
        tabs.put(0, HistoryFragment.getInstance(context));
        tabs.put(1, IdeasFragment.getInstance(context));
        tabs.put(2, TodoFragment.getInstance(context));
        tabs.put(3, BirthdaysFragment.getInstance(context));
    }


}
