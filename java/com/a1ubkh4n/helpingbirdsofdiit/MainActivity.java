package com.a1ubkh4n.helpingbirdsofdiit;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crash.FirebaseCrash;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private FirebaseAnalytics mFirebaseAnalytics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Load an ad into the AdMob banner view.
        AdView adView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .setRequestAgent("android_studio:ad_template").build();
        adView.loadAd(adRequest);

        FirebaseCrash.log("Crash Reported");
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.about_developer) {
            Intent intent = new Intent(MainActivity.this, about_developer.class);
            startActivity(intent);
            overridePendingTransition(R.anim.move_in_from_bottom, R.anim.stand_still);
        }
        else if (id == R.id.join_fb_group) {
            String urlgroup = "https://www.facebook.com/groups/HelpingBirdsofDIIT/";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(urlgroup));
            startActivity(i);
        }
        else if (id == R.id.like_fb) {
            String urlpage = "https://www.facebook.com/helpingbirds/";
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(urlpage));
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

    public void btnMem(View view) {
        Intent i = new Intent(MainActivity.this, member.class);
        startActivity(i);
        overridePendingTransition(R.anim.move_in_from_bottom, R.anim.stand_still);
    }

    public void btnPreface(View view) {
        Intent intent = new Intent(MainActivity.this, preface.class);
        startActivity(intent);
        overridePendingTransition(R.anim.move_in_from_bottom, R.anim.stand_still);
    }

    public void btnRelevant(View view) {
        Intent intent = new Intent(MainActivity.this, relevant_info.class);
        startActivity(intent);
        overridePendingTransition(R.anim.move_in_from_bottom, R.anim.stand_still);
    }

    public void btnpanel(View view) {
        Intent intent = new Intent(MainActivity.this, admin_panel.class);
        startActivity(intent);
        overridePendingTransition(R.anim.move_in_from_bottom, R.anim.stand_still);
    }

    public void btnemergency(View view) {
        Intent intent = new Intent(MainActivity.this, emergency_contact.class);
        startActivity(intent);
        overridePendingTransition(R.anim.move_in_from_bottom, R.anim.stand_still);
    }

    public void btnabout(View view) {
        Intent intent = new Intent(MainActivity.this, about.class);
        startActivity(intent);
        overridePendingTransition(R.anim.move_in_from_bottom, R.anim.stand_still);
    }
}
