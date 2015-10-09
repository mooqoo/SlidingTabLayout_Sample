package study.com.slidingtab.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import study.com.slidingtab.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment_Tab2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment_Tab2 extends Fragment {

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment Fragment_Tab1.
     */
    public static Fragment_Tab2 newInstance() {
        Fragment_Tab2 fragment = new Fragment_Tab2();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    public Fragment_Tab2() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_tab2, container, false);
    }


}
