package com.a1ubkh4n.helpingbirdsofdiit;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crash.FirebaseCrash;

import java.util.ArrayList;

public class ab_positive extends AppCompatActivity {

    private FirebaseAnalytics mFirebaseAnalytics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        TextView textlist = (TextView) findViewById(R.id.listtext);
        textlist.setSelected(true);
        textlist.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        textlist.setText("If you need blood/any other information, contact in Emergency Contact.");
        textlist.setSingleLine(true);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolList);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        AdView adView = (AdView) findViewById(R.id.adViewlist);
        AdRequest adRequest = new AdRequest.Builder()
                .setRequestAgent("android_studio:ad_template").build();
        adView.loadAd(adRequest);

        FirebaseCrash.log("Crash Reported");
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        final ArrayList<list> words = new ArrayList<list>();
        words.add(new list("Kazi Tania","Daffodil Institute of IT","10th batch","Dhanmondi","No"));
        words.add(new list("Md.Shakilur Rahman","Daffodil Institute of IT","11th batch","Kallayanpur","Yes"));
        words.add(new list("Md.Mohabbat","Daffodil Institute of IT","12th batch","Dhanmondi","No"));
        words.add(new list("Abdullah Al-Noman","Daffodil Institute of IT","12th batch","Azimpur","No"));
        words.add(new list("Md.Shariful Islam","Daffodil Institute of IT","12th batch","Not available","No"));
        words.add(new list("Saurav Datta","Daffodil Institute of IT","13th batch","Not available","Yes"));
        words.add(new list("Israt Jahan","Daffodil Institute of IT","13th batch","Sher-e-Bangla Nagar","No"));
        words.add(new list("Rabiul Alam","Daffodil Institute of IT","13th batch","Mirpur","No"));
        words.add(new list("Kawsar Hamid","Daffodil Institute of IT","13th batch","Nilkhet","No"));
        words.add(new list("Al Zubayer","Daffodil Institute of IT","13th batch","Azimpur","No"));
        words.add(new list("Shahidul Islam Tushar","Daffodil Institute of IT","14th batch","Malibag","No"));
        words.add(new list("Md.Raju","Daffodil Institute of IT","14th batch","Mitford","Yes"));
        words.add(new list("Dipty Saha","Daffodil Institute of IT","14th batch","Not available","No"));
        words.add(new list("Sahensah","Daffodil Institute of IT","14th batch","Not available","Yes"));
        words.add(new list("Monir Ahamed","Daffodil Institute of IT","14th batch","Mirpur","No"));
        words.add(new list("Tasmia Jannat","Daffodil Institute of IT","14th batch","Jatrabari","No"));
        words.add(new list("Rubaya Tamanna","Daffodil Institute of IT","14th batch","Mirpur","No"));
        words.add(new list("Rifat Alam","Daffodil Institute of IT","15th batch","Zinzira","No"));
        words.add(new list("Masrufa Najnin","Daffodil Institute of IT","15th batch","Central Road","No"));
        words.add(new list("Sanjay Baral Anik","Daffodil Institute of IT","15th batch","Shabag","Yes"));
        words.add(new list("Onamika Farzana","Daffodil Institute of IT","15th batch","Rampura","No"));
        words.add(new list("SK.Irteza Hossain Noor","Daffodil Institute of IT","15th batch","Shanti Nagar","No"));
        words.add(new list("Md.Ashiqur Rahman","Daffodil Institute of IT","15th batch","S.Keranigonj","No"));
        words.add(new list("Saleh Ahmed","Daffodil Institute of IT","15th batch","Shukrabad","Yes"));
        words.add(new list("Naznin","Daffodil Institute of IT","15th batch","Mirpur","No"));
        words.add(new list("Sayma Rahaman","Daffodil Institute of IT","15th batch","Motijhil","No"));
        words.add(new list("Ankon","Daffodil Institute of IT","15th batch","Savar","No"));
        words.add(new list("Ashiqur Rahaman","Daffodil Institute of IT","15th batch","Tejgaon","No"));
        words.add(new list("Kanta Biswas","Daffodil Institute of IT","15th batch","Mirpur","No"));
        words.add(new list("Muzahid","Daffodil Institute of IT","15th batch","Shamoly 02","No"));

        list_adapter adapter = new list_adapter(this, words, R.color.category_phrases);
        ListView listView = (ListView) findViewById(R.id.list);
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
