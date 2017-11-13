package com.a1ubkh4n.helpingbirdsofdiit;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crash.FirebaseCrash;

import static android.os.Build.VERSION_CODES.M;

public class member extends AppCompatActivity {
    private FirebaseAnalytics mFirebaseAnalytics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolmember);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        AdView adView = (AdView) findViewById(R.id.adViewmember);
        AdRequest adRequest = new AdRequest.Builder()
                .setRequestAgent("android_studio:ad_template").build();
        adView.loadAd(adRequest);

        FirebaseCrash.log("Crash Reported");
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
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

    public void btnApos(View view) {
        Intent intent = new Intent(member.this, a_positive.class);
        startActivity(intent);
        overridePendingTransition(R.anim.move_in_from_bottom, R.anim.stand_still);
    }

    public void btnAneg(View view) {
        Intent intent = new Intent(member.this, a_negative.class);
        startActivity(intent);
        overridePendingTransition(R.anim.move_in_from_bottom, R.anim.stand_still);
    }

    public void btnBpos(View view) {
        Intent intent = new Intent(member.this, b_positive.class);
        startActivity(intent);
        overridePendingTransition(R.anim.move_in_from_bottom, R.anim.stand_still);
    }

    public void btnBneg(View view) {
        Intent intent = new Intent(member.this, b_negative.class);
        startActivity(intent);
        overridePendingTransition(R.anim.move_in_from_bottom, R.anim.stand_still);
    }

    public void btnOpos(View view) {
        Intent intent = new Intent(member.this, o_positive.class);
        startActivity(intent);
        overridePendingTransition(R.anim.move_in_from_bottom, R.anim.stand_still);
    }

    public void btnOneg(View view) {
        Intent intent = new Intent(member.this, o_negative.class);
        startActivity(intent);
        overridePendingTransition(R.anim.move_in_from_bottom, R.anim.stand_still);
    }

    public void btnABpos(View view) {
        Intent intent = new Intent(member.this, ab_positive.class);
        startActivity(intent);
        overridePendingTransition(R.anim.move_in_from_bottom, R.anim.stand_still);
    }

    public void btnABneg(View view) {
        Intent intent = new Intent(member.this, ab_negative.class);
        startActivity(intent);
        overridePendingTransition(R.anim.move_in_from_bottom, R.anim.stand_still);
    }

}
