package ru.android.payinhomev2;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class CountersData extends AppCompatActivity {
    Fragment fragGet;
    Fragment fragAll;
    FragmentTransaction fTrans;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counters_data);
        fragGet = new Fragment();
        fragAll = new Fragment();

    }

    public void onClick(View v) {
        fTrans = getFragmentManager().beginTransaction();
        switch (v.getId()) {
            case R.id.button_counters_current_data:
                fTrans.add(R.id.frame_counters, fragGet);
                break;
            case R.id.button_counters_all_data:
                fTrans.replace(R.id.frame_counters, fragAll);
            default:
                break;
        }
        fTrans.addToBackStack(null);
        fTrans.commit();
    }

}
