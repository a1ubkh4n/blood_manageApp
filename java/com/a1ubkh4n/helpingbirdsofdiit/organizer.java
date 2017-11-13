package com.a1ubkh4n.helpingbirdsofdiit;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crash.FirebaseCrash;

import java.util.ArrayList;

public class organizer extends AppCompatActivity {
    private FirebaseAnalytics mFirebaseAnalytics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view_for_advisor);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolList2);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        AdView adView = (AdView) findViewById(R.id.adViewlistadvisor);
        AdRequest adRequest = new AdRequest.Builder()
                .setRequestAgent("android_studio:ad_template").build();
        adView.loadAd(adRequest);

        FirebaseCrash.log("Crash Reported");
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        final ArrayList<list_for_advisor> words2 = new ArrayList<list_for_advisor>();
        words2.add(new list_for_advisor("SM. Saiful Islam Shanto", "President & Founder", "", "Helping Birds of DIIT", "", R.drawable.saiful));
        words2.add(new list_for_advisor("Taslima Akter Shanta", "General Secretary & Founder", "", "Helping Birds of DIIT", "", R.drawable.shanta));
        words2.add(new list_for_advisor("Touhidur Rahman Saurav", "Organizational Secretary", "", "Helping Birds of DIIT", "", R.drawable.saurav));
        words2.add(new list_for_advisor("Shirajum Munira Choyon", "Joint Secretary", "", "Helping Birds of DIIT", "", R.drawable.choyon));
        words2.add(new list_for_advisor("Sayed Biplob Hossain", "Cultural Secretary", "", "Helping Birds of DIIT", "", R.drawable.biplob));
        words2.add(new list_for_advisor("Rahatur Rahman Nahin", "Educational Secretary", "", "Helping Birds of DIIT", "", R.drawable.rahat));
        words2.add(new list_for_advisor("Sheikh Fouzia Sattar", "Effective Member", "", "Helping Birds of DIIT", "", R.drawable.sheikh_foujiya));
        words2.add(new list_for_advisor("Salma Akter Shampa", "Effective Member", "", "Helping Birds of DIIT", "", R.drawable.sompa));
        words2.add(new list_for_advisor("Fuad Hossain", "Effective Member", "", "Helping Birds of DIIT", "", R.drawable.fuad));
        words2.add(new list_for_advisor("Parvez Bhuiyan", "Effective Member", "", "Helping Birds of DIIT", "", R.drawable.parvej));
        words2.add(new list_for_advisor("Mehedi Hasan", "Effective Member", "", "Helping Birds of DIIT", "", R.drawable.mehedi));
        words2.add(new list_for_advisor("Palash Acharjee", "Effective Member", "", "Helping Birds of DIIT", "", R.drawable.polash));
        words2.add(new list_for_advisor("Arifur Rahman Hridoy", "Committee Advisor", "", "Helping Birds of DIIT", "", R.drawable.hridoy));

        list_adapter_for_advisor adapter = new list_adapter_for_advisor(this, words2, R.color.list_category);
        ListView listView = (ListView) findViewById(R.id.list_for_advisor);
        listView.setAdapter(adapter);

    }
    private void closeWindow() {
        finish();
        overridePendingTransition(R.anim.stand_still, R.anim.move_out_to_bottom);
    }

    @Override
    public void onBackPressed() {
        closeWindow();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_sub, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.share) {
            Intent messageIntent = new Intent(Intent.ACTION_VIEW, Uri.fromParts("sms", "", null));
            messageIntent.putExtra("sms_body", getString(R.string.share));
            startActivity(messageIntent);
            return true;
        }

        if (id == android.R.id.home) {
            closeWindow();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
