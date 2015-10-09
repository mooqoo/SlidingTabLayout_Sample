package study.com.slidingtab.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;

import study.com.slidingtab.Fragment.Fragment_Tab1;
import study.com.slidingtab.Fragment.Fragment_Tab2;
import study.com.slidingtab.Fragment.Fragment_Tab3;

/**
 * Created by mooqoo on 10/9/15.
 */
public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    public static final String TAG = "ViewPagerAdapter";

    String[] tabNameArray;

    //Constructor
    public ViewPagerAdapter(FragmentManager fm, String[] tabNameArray) {
        super(fm);
        this.tabNameArray = tabNameArray;
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0)
        {
            Fragment_Tab1 tab1 = new Fragment_Tab1();
            return tab1;
        }
        else if(position == 1 )
        {
            Fragment_Tab2 tab2 = new Fragment_Tab2();
            return tab2;
        }
        else if(position == 2)
        {
            Fragment_Tab3 tab3 = new Fragment_Tab3();
            return tab3;
        }
        else {
            Log.e(TAG,"getItem: invalid position. No Fragment exist!");
            return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabNameArray[position];
    }

    @Override
    public int getCount() {
        return tabNameArray.length;
    }
}
