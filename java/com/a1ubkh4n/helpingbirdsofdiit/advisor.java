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

public class advisor extends AppCompatActivity {

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
        words2.add(new list_for_advisor("Mohammed Shakhawat Hossain", "Honorable Chief Advisor", "", "Principle of DIIT", "", R.drawable.principal_sir));
        words2.add(new list_for_advisor("Lakkhan Chandra Robi Das", "Honorable Senior Advisor", "", "Assistant Professor of DIIT", "", R.drawable.lakkhan_sir));
        words2.add(new list_for_advisor("Md. Mokarram Hossain", "Honorable Senior Advisor", "", "Assistant Professor of DIIT", "", R.drawable.mokarram_sir));
        words2.add(new list_for_advisor("Md. Omar Faruk", "Honorable Senior Advisor", "", "Senior Lecturer of DIIT", "", R.drawable.omor_sir));
        words2.add(new list_for_advisor("Israt Moriom Khan", "Honorable Senior Advisor", "", "Senior Lecturer of DIIT", "", R.drawable.moriom_mem));
        words2.add(new list_for_advisor("Sabrina Quadir", "Honorable Senior Advisor", "", "Senior Lecturer of DIIT", "", R.drawable.sabrina_mem));
        words2.add(new list_for_advisor("Shakila Jahan Nipa", "Honorable Senior Advisor", "", "Lecturer of DIIT", "", R.drawable.nipa_mem));
        words2.add(new list_for_advisor("Aminul Haque Rassel", "Honorable Senior Advisor", "", "Lecturer of DIIT", "", R.drawable.russel_sir));
        words2.add(new list_for_advisor("Shahina Bhuiyan Suhi", "Honorable Advisor", "", "Lecturer of DIIT", "", R.drawable.suhi_mem));
        words2.add(new list_for_advisor("Rubaida Rafi", "Honorable Advisor", "", "Lecturer of DIIT", "", R.drawable.rafi_mem));
        words2.add(new list_for_advisor("Sanowar Hossain Atik", "Honorable Advisor", "", "Lecturer of DIIT", "", R.drawable.atik_sir));
        words2.add(new list_for_advisor("Fahmida Akter", "Honorable Advisor", "", "Lecturer of DIIT", "", R.drawable.fahmida_mem));
        words2.add(new list_for_advisor("Antara Saha", "Honorable Advisor", "", "Lecturer of DIIT", "", R.drawable.antara_mem));
        words2.add(new list_for_advisor("Md. Ashrafuzzaman Al Kabir Khan", "Honorable Senior Advisor", "", "Lecturer of DIIT", "", R.drawable.ashraf_sir));
        words2.add(new list_for_advisor("Jahidul Islam Rony", "Honorable Advisor", "", "Lecturer of DIIT", "", R.drawable.rony_sir));
        words2.add(new list_for_advisor("Atif ul Aftab", "Honorable Advisor", "", "Lecturer of DIIT", "", R.drawable.atif_sir));
        words2.add(new list_for_advisor("Prafulla Kumar Saha", "Honorable Advisor", "", "Lecturer of DIIT", "", R.drawable.profullo_sir));
        words2.add(new list_for_advisor("Imran Hossain Imu", "Honorable Advisor", "", "Lecturer of DIIT", "", R.drawable.imran_sir));
        words2.add(new list_for_advisor("Tahmina Akter Trisha", "Honorable Advisor", "", "Lecturer of DIIT", "", R.drawable.trisha_mem));
        words2.add(new list_for_advisor("Jannatul Akter Orin", "Honorable Advisor", "", "Lecturer of DIIT", "", R.drawable.orin_mem));
        words2.add(new list_for_advisor("Samia Afrin Shetu", "Honorable Advisor", "", "Lecturer of DIIT", "", R.drawable.shetu_mem));
        words2.add(new list_for_advisor("Poly Bhoumik", "Honorable Advisor", "", "Lecturer of DIIT", "", R.drawable.poly_men));
        words2.add(new list_for_advisor("Anwar Jahid", "Honorable Advisor", "", "Lecturer of DIIT", "", R.drawable.anwar_sir));




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
