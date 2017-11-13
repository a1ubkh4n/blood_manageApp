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

import static com.a1ubkh4n.helpingbirdsofdiit.R.id.textView;

public class a_positive extends AppCompatActivity {

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
        words.add(new list("Md.Samsuzzoha","Daffodil Institute of IT","10th batch","Not available","Yes"));
        words.add(new list("Md.Delwar Jahan Munna","Daffodil Institute of IT","10th batch","Khilgaon","Yes"));
        words.add(new list("Ummey Honey","Daffodil Institute of IT","10th batch","Tejgaon","No"));
        words.add(new list("Md.Shaidur Rahaman","Daffodil Institute of IT","10th batch","Agargaon","No"));
        words.add(new list("Md.Rana","Daffodil Institute of IT","10th batch","Raja Bazar","No"));
        words.add(new list("Abizit Saha","Daffodil Institute of IT","10th batch","Azimpur","No"));
        words.add(new list("Shahab Shams Sowad","Daffodil Institute of IT","10th batch","Agargaon","Yes"));
        words.add(new list("Shehab Mahmud Mehedi","Daffodil Institute of IT","10th batch","Karwan Bazar","Yes"));
        words.add(new list("Md.Mehedi Hassan","Daffodil Institute of IT","10th batch","Agargaon","Yes"));
        words.add(new list("Manik Miah","Daffodil Institute of IT","11th batch","Kallyanpur","Yes"));
        words.add(new list("Md.Rayhan Patwary","Daffodil Institute of IT","11th batch","Dhanmondi","Yes"));
        words.add(new list("Hasib Hossain","Daffodil Institute of IT","11th batch","Savar","Yes"));
        words.add(new list("Manashi ","Daffodil Institute of IT","11th batch","Dhanmondi","No"));
        words.add(new list("Sanjida Tonny","Daffodil Institute of IT","11th batch","Mirpur","No"));
        words.add(new list("Ayesha Akter","Daffodil Institute of IT","11th batch","Sukrabad","No"));
        words.add(new list("Leo Olee","Daffodil Institute of IT","11th batch","Dhanmondi","Yes"));
        words.add(new list("Asmita Ahad","Daffodil Institute of IT","11th batch","Cantonment","No"));
        words.add(new list("AShikur Rahman","Daffodil Institute of IT","11th batch","Green road","No"));
        words.add(new list("Rafikul Alam","Daffodil Institute of IT","11th batch","Mirpur","Yes"));
        words.add(new list("Rakib Hossain","Daffodil Institute of IT","11th batch","Banashree","No"));
        words.add(new list("Moshiur Rahaman","Daffodil Institute of IT","11th batch","Dhanmondi","No"));
        words.add(new list("SM.Saiful Islam","Daffodil Institute of IT","12th batch","Lalbag","No"));
        words.add(new list("Asif Newaz","Daffodil Institute of IT","12th batch","Mirpur","No"));
        words.add(new list("Md.Mehedi","Daffodil Institute of IT","12th batch","BDR 1no. Gate","No"));
        words.add(new list("Sayed Biplob","Daffodil Institute of IT","12th batch","Kollyanpur","No"));
        words.add(new list("Md.Tazul Islam","Daffodil Institute of IT","12th batch","Lalbag","No"));
        words.add(new list("Kawser Ahmed","Daffodil Institute of IT","12th batch","Babu Bazar","Yes"));
        words.add(new list("Sumaiya Chumky","Daffodil Institute of IT","12th batch","Nakhalpara","No"));
        words.add(new list("Md.Emtiaz Kabir","Daffodil Institute of IT","12th batch","Tejgaon","No"));
        words.add(new list("Emon Shahariar","Daffodil Institute of IT","12th batch","Dhanmondi","Yes"));
        words.add(new list("Sadia Eshrat","Daffodil Institute of IT","13th batch","Savar","No"));
        words.add(new list("Farjana Akhter","Daffodil Institute of IT","13th batch","Mohammadpur","No"));
        words.add(new list("Afrina Rahman","Daffodil Institute of IT","13th batch","Dhanmondi","No"));
        words.add(new list("Adnan Waled Aunto","Daffodil Institute of IT","13th batch","Not available","Yes"));
        words.add(new list("Mahfuzur Rahman","Daffodil Institute of IT","13th batch","Not available","No"));
        words.add(new list("Milan Karmakar","Daffodil Institute of IT","13th batch","Not available","Yes"));
        words.add(new list("Md.Ahsan Islam","Daffodil Institute of IT","13th batch","Not available","Yes"));
        words.add(new list("Md.Arafat Hossain","Daffodil Institute of IT","13th batch","Not available","Yes"));
        words.add(new list("Md.Mahabubur Rahman","Daffodil Institute of IT","13th batch","Not available","No"));
        words.add(new list("Md.Rubel Hossin","Daffodil Institute of IT","13th batch","Not available","Yes"));
        words.add(new list("Fatima Akhter","Daffodil Institute of IT","13th batch","Not available","No"));
        words.add(new list("Iqbal Hasan","Daffodil Institute of IT","14th batch","Mirpur","Yes"));
        words.add(new list("Didarul Islam","Daffodil Institute of IT","14th batch","Khilgaon","No"));
        words.add(new list("Dipabali Madok","Daffodil Institute of IT","14th batch","Not available","No"));
        words.add(new list("Kiron","Daffodil Institute of IT","14th batch","Not available","No"));
        words.add(new list("Fatima","Daffodil Institute of IT","14th batch","Not available","No"));
        words.add(new list("Md.Shaykot","Daffodil Institute of IT","14th batch","Not available","No"));
        words.add(new list("Mahabub Alom","Daffodil Institute of IT","14th batch","Not available","No"));
        words.add(new list("Md.Mehedi","Daffodil Institute of IT","14th batch","Not available","No"));
        words.add(new list("Zahidul Islam","Daffodil Institute of IT","14th batch","Rayer Bazar","No"));
        words.add(new list("Jubaida Khanom","Daffodil Institute of IT","14th batch","Azimpur","No"));
        words.add(new list("Mahmuda Akter","Daffodil Institute of IT","14th batch","Keranigonj","No"));
        words.add(new list("Sumaiya Binte","Daffodil Institute of IT","14th batch","Mirpur","No"));
        words.add(new list("Mahmudul Hasan","Daffodil Institute of IT","14th batch","Donia","No"));
        words.add(new list("Tasnim Islam","Daffodil Institute of IT","14th batch","Not available","No"));
        words.add(new list("Rukaya Islam","Daffodil Institute of IT","14th batch","Not available","No"));
        words.add(new list("Sony","Daffodil Institute of IT","Daffodil Institute of IT","Mirpur","No"));
        words.add(new list("Fatima Hossain ","Daffodil Institute of IT","14th batch","Not available","No"));
        words.add(new list("Momtazul Islam Rupom","Daffodil Institute of IT","14th batch","Azimpur","Yes"));
        words.add(new list("Md. Habib","Daffodil Institute of IT","14th batch","Rampura","No"));
        words.add(new list("Md.Ashraful","Daffodil Institute of IT","14th batch","Khilgaon","No"));
        words.add(new list("Tamanna Akter","Daffodil Institute of IT","14th batch","Moneshhor Road","No"));
        words.add(new list("Maksuda Akter","Daffodil Institute of IT","14th batch","Mirpur","Yes"));
        words.add(new list("Joy Sarker","Daffodil Institute of IT","14th batch","Demra","No"));
        words.add(new list("Mahmudul Hossain","Daffodil Institute of IT","15th batch","Jatrabari","No"));
        words.add(new list("Nadia Binte Firoj","Daffodil Institute of IT","15th batch","Shewrapara","No"));
        words.add(new list("Md.Abdul Ahad Mozumder","Daffodil Institute of IT","15th batch","Dhanmondi-32","Yes"));
        words.add(new list("Sayem Patwary","Daffodil Institute of IT","15th batch","Mohammadpur","No"));
        words.add(new list("Faisal Ahmed","Daffodil Institute of IT","15th batch","Badda","No"));
        words.add(new list("Dipak Rakhit","Daffodil Institute of IT","15th batch","Narayangonj","Yes"));
        words.add(new list("Md.Sirazul Islam Riyad","Daffodil Institute of IT","15th batch","Bangla Bazar","No"));
        words.add(new list("Mehedi Hassan","Daffodil Institute of IT","15th batch","Jurain","No"));
        words.add(new list("Nasar","Daffodil Institute of IT","15th batch","Not available","No"));
        words.add(new list("Nahian Imran","Daffodil Institute of IT","15th batch","Uttara","No"));
        words.add(new list("Anit Kumar Mondol","Daffodil Institute of IT","15th batch","Mirpur-11","No"));
        words.add(new list("Mahmudul Haque","Daffodil Institute of IT","15th batch","Narinda","No"));

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
