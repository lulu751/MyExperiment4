package com.example.hp.myexperiment4;

import android.preference.PreferenceActivity;
import android.os.Bundle;
import android.preference.PreferenceFragment;

public class SettingsFragment extends  PreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);

    }
}
