package com.codingblocks.whatsapplayout;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.widget.Switch;

public class PagerAdapter extends FragmentPagerAdapter{
    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

            switch (position) {
                case 0:
                    return new FragmentD();
                case 1:
                    return new FragmentA();

                case 2:
                    return new FragmentB();

                case 3:
                    return new FragmentC();




            }
            return null;

    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position)
        {
            case 1:
                return "chats";
            case 2:
                return "status";
                case 3:
                    return "call";
            case 0:return "camera";
        }
        return "";

    }
}
