package com.B58works.settings.textmods;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.Preference;

import com.B58works.settings.Superpref;

import static com.B58works.B58.getResID;


public class Chatscreen extends Superpref{

    public void onCreate(Bundle b) {
        super.onCreate(b);
        addPreferencesFromResource(getResID("tchat", "xml"));
        final Preference p1=this.findPreference("call_btn");
        p1.setEnabled(false);
        p1.setSummary("Will be back in next release.");
    }

    protected void onPause() {
        super.onPause();
    }

    protected void onResume() {
        super.onResume();
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String s) {
        super.onSharedPreferenceChanged(sharedPreferences, s);
    }

}
