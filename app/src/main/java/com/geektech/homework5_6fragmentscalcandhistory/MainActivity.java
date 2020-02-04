package com.geektech.homework5_6fragmentscalcandhistory;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements ButtonInterface,HistoryInterface{
    ButtonsFragment buttonsFragment;
    HistoryFragment historyFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonsFragment = new ButtonsFragment();
        historyFragment = new HistoryFragment();
        changeFragment(buttonsFragment);
    }

    @Override
    public void openHistory() {
        buttonsFragment.sendAnswer();
    }

    @Override
    public void back() {changeFragment(buttonsFragment);
    }
    public void changeFragment(Fragment fragment) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.container, fragment);
        transaction.commit();
    }




    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
