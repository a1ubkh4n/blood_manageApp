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

public class o_positive extends AppCompatActivity {
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
        words.add(new list("Ibrahim","Daffodil Institute of IT","10th batch","Savar","No"));
        words.add(new list("Razib","Daffodil Institute of IT","10th batch","Dhanmondi","No"));
        words.add(new list("Nazim Khan","Daffodil Institute of IT","10th batch","Shaymoli","No"));
        words.add(new list("Swapna Biswas"," Daffodil Institute of IT","10th batch","Hazaribag","No"));
        words.add(new list("Rezaul Karim","Daffodil Institute of IT","10th batch","Narayangonj","No"));
        words.add(new list("Asad Sujon","Daffodil Institute of IT","10th batch","Agargaon","No"));
        words.add(new list("Al-Amin","Daffodil Institute of IT","10th batch","Narayangonj","No"));
        words.add(new list("Jannatul Ferdous","Daffodil Institute of IT","10th batch","Mirpur","No"));
        words.add(new list("Hasibur Rahman","Daffodil Institute of IT","10th batch","Mirpur","No"));
        words.add(new list("Asim Ayub","Daffodil Institute of IT","10th batch","Mirpur","No"));
        words.add(new list("Ayon","Daffodil Institute of IT","10th batch","Mirpur","No"));
        words.add(new list("Rinky","Daffodil Institute of IT","10th batch","Agargaon","No"));
        words.add(new list("Mishu","Daffodil Institute of IT","10th batch","Narayangonj","No"));
        words.add(new list("Mohin khan","Daffodil Institute of IT","10th batch","Dhanmondi","No"));
        words.add(new list("Parvez","Daffodil Institute of IT","10th batch","Narayanggonj","No"));
        words.add(new list("Shamim Khan","Daffodil Institute of IT","10th batch","Uttora","No"));
        words.add(new list("Zahirul Islam","Daffodil Institute of IT","11th batch","Mirpur","yes"));
        words.add(new list("Md.Songram","Daffodil Institute of IT","11th batch","Dhanmondi","No"));
        words.add(new list("Toufiqur Rahaman","Daffodil Institute of IT","11th batch","Farmgate","No"));
        words.add(new list("Israt Zahan","Daffodil Institute of IT","11th batch","Zigatola","No"));
        words.add(new list("Walid Al Nasrin","Daffodil Institute of IT","11th batch","Mohammadpur","No"));
        words.add(new list("Babu Lal","Daffodil Institute of IT","11th batch","Kollyanpur","No"));
        words.add(new list("Redwan Shikdar","Daffodil Institute of IT","11th batch","Mogbazar","No"));
        words.add(new list("Touhidur Rahaman","Daffodil Institute of IT","12th batch","B.G. press Staff Quarter","No"));
        words.add(new list("Nafisa Ahmed","Daffodil Institute of IT","12th batch","Lalbag","No"));
        words.add(new list("Md.Sumon","Daffodil Institute of IT","12th batch","Agargaon","No"));
        words.add(new list("Abu Sayem","Daffodil Institute of IT","12th batch","Narayangonj","No"));
        words.add(new list("Shahana Nargis","Daffodil Institute of IT","12th batch","Doniya","No"));
        words.add(new list("Md.Sanower","Daffodil Institute of IT","12th batch","New Market","Yes"));
        words.add(new list("Md.Farid-uz-Zaman","Daffodil Institute of IT","12th batch","Zigatola","No"));
        words.add(new list("Md.Belal Hossain","Daffodil Institute of IT","12th batch","Mirpur","No"));
        words.add(new list("Md.Shahad Hossain","Daffodil Institute of IT","12th batch","Fokirapool","No"));
        words.add(new list("Parves Mosharof","Daffodil Institute of IT","12th batch","Not Available","Yes"));
        words.add(new list("Md.Moniruzzaman","Daffodil Institute of IT","13th batch","Narayangonj","No"));
        words.add(new list("Sunjida Rahaman Era","Daffodil Institute of IT","13th batch","Damra","No"));
        words.add(new list("Imran","Daffodil Institute of IT","13th batch","Lalbag","No"));
        words.add(new list("Md. Zubayer Khan","Daffodil Institute of IT","13th batch","Not Available","Yes"));
        words.add(new list("Sobuj Chandra Das","Daffodil Institute of IT","13th batch","Not available","Yes"));
        words.add(new list("Meher Afroj Mili","Daffodil Institute of IT","13th batch","Not availabe;","No"));
        words.add(new list("Imran Khan","Daffodil Institute of IT","13th batch","Not available","No"));
        words.add(new list("Md. Real Mia","Daffodil Institute of IT","13th batch","Farmgate","No"));
        words.add(new list("Md.Al Amin","Daffodil Institute of IT","13th batch","Narayangonj","Yes"));
        words.add(new list("Tarequl Islam","Daffodil Institute of IT","13th batch","Hazaribag","No"));
        words.add(new list("Hasib Ahmed","Daffodil Institute of IT","13th batch","Mirpur","No"));
        words.add(new list("Sabrina Akhter Moni","Daffodil Institute of IT","14th batch","Not Available","No"));
        words.add(new list("Rashedul Islam","Daffodil Institute of IT","14th batch","Not available","No"));
        words.add(new list("Khan Mohammad Meraz","Daffodil Institute of IT","14th batch","Not available","No"));
        words.add(new list("Belal Hossain","Daffodil Institute of IT","14th batch","Not Available","No"));
        words.add(new list("Mousumi akhter","Daffodil Institute of IT","14th batch","Azimpur","No"));
        words.add(new list("Rabeya Sultan","Daffodil Institute of IT","14th batch","Shukrabad","No"));
        words.add(new list("Omar Faruq","Daffodil Institute of IT","14th batch","Not available","No"));
        words.add(new list("Morshadul Haque","Daffodil Institute of IT","14th batch","Not available","No"));
        words.add(new list("Md.Shium Mahmud","Daffodil Institute of IT","14th batch","Tongi","No"));
        words.add(new list("Rukhsana Sumi","Daffodil Institute of IT","14th batch","Mirpur","No"));
        words.add(new list("Tanzida Khandaker","Daffodil Institute of IT","14th batch","Azimpur","Yes"));
        words.add(new list("Supti Saha","Daffodil Institute of IT","14th batch","Shukrabad","No"));
        words.add(new list("Al-Amin Hossain","Daffodil Institute of IT","14th batch","Not available","No"));
        words.add(new list("Any Khandaker","Daffodil Institute of IT","14th batch","Elephant Road","No"));
        words.add(new list("Marufa Akhter Moly","Daffodil Institute of IT","14th batch","Sukhrabad","No"));
        words.add(new list("Md.Rahat","Daffodil Institute of IT","14th batch","Mogbazar","No"));
        words.add(new list("Md.Tusher","Daffodil Institute of IT","14th batch","Mirpur","No"));
        words.add(new list("Md.Arif","Daffodil Institute of IT","14th batch","Gulshan","Yes"));
        words.add(new list("Md.Ifrat","Daffodil Institute of IT","14th batch","Mohammadpur","Yes"));
        words.add(new list("Md.Imran Hasib","Daffodil Institute of IT","14th batch","Badda","No"));
        words.add(new list("Rajib Barai Raju","Daffodil Institute of IT","14th batch","Mohammadpur","No"));
        words.add(new list("Sujon","Daffodil Institute of IT","15th batch","Zigatola","No"));
        words.add(new list("Shamima Yeasmin","Daffodil Institute of IT","15th batch","Azimpur","No"));
        words.add(new list("Anjita Ahad","Daffodil Institute of IT","15th batch","Cantonment","No"));
        words.add(new list("Zaara Nousin","Daffodil Institute of IT","15th batch","Azimpur","No"));
        words.add(new list("Juwel Rana","Daffodil Institute of IT","15th batch","Hazaribag","No"));
        words.add(new list("Amir Hamza Ratul","Daffodil Institute of IT","15th batch","Mirpur-14","Yes"));
        words.add(new list("Md. Abdullah Al Alamin","Daffodil Institute of IT","15th batch","Mirpur-14","Yes"));
        words.add(new list("Mahadi Hassan","Daffodil Institute of IT","15th batch","Not available","No"));
        words.add(new list("Md.Nurul Islam Rabby","Daffodil Institute of IT","15th batch","Mirpur","No"));
        words.add(new list("Md.Mahfuz Khan","Daffodil Institute of IT","15th batch","Mirpur","No"));
        words.add(new list("Md.Moiury Chowdhury","Daffodil Institute of IT","15th batch","Narayangonj","No"));
        words.add(new list("Fatema Tuz Johora Annie","Daffodil Institute of IT","15th batch","Kollyanpur","No"));
        words.add(new list("Sonia Tasnim Airin","Daffodil Institute of IT","15th batch","Mirpur","No"));
        words.add(new list("Toufiqul Aziz Tousif","Daffodil Institute of IT","15th batch","Mirpur-1","No"));
        words.add(new list("Md.M.Mridul","Daffodil Institute of IT","15th batch","Mirpur","Yes"));
        words.add(new list("Emon","Daffodil Institute of IT","15th batch","Bashabo","No"));
        words.add(new list("Rajeshwary","Daffodil Institute of IT","15th batch","Narayangonj","No"));
        words.add(new list("Mukta","Daffodil Institute of IT","15th batch","Narayangonj","No"));
        words.add(new list("Swarna Das","Daffodil Institute of IT","15th batch","Narayangonj","No"));
        words.add(new list("Tasnim Haque Nowsin","Daffodil Institute of IT","15th batch","Mirpur","No"));
        words.add(new list("Shubrata Saha","Daffodil Institute of IT","15th batch","Narayangonj","Yes"));
        words.add(new list("Kamrun Nahar","Daffodil Institute of IT","15th batch","Mirpur","No"));
        words.add(new list("Musaddakul Islam Ananto","Daffodil Institute of IT","15th batch","Tali Office","No"));
        words.add(new list("Abdul Kalam Sajib","Daffodil Institute of IT","15th batch","Jatrabari","No"));
        words.add(new list("Promi Anthony Corraya","Daffodil Institute of IT","15th batch","Sutrapur","No"));
        words.add(new list("Shawon Roy","Daffodil Institute of IT","15th batch","Keranigonj","No"));
        words.add(new list("Kazi Anas","Daffodil Institute of IT","15th batch","North Badda","No"));
        words.add(new list("Md. Mahadi Hassan Raju","Daffodil Institute of IT","15th batch","Zigatola","Yes"));
        words.add(new list("Jewel Mahmud","Daffodil Institute of IT","15th batch","Farmgate","No"));
        words.add(new list("Hanif Kabir","Daffodil Institute of IT","15th batch","Jurain","No"));
        words.add(new list("Mashrafi Hasan","Daffodil Institute of IT","15th batch","Not available","No"));
        words.add(new list("Shahed","Daffodil Institute of IT","15th batch","Not available","Yes"));
        words.add(new list("Akter-uz-Zaman","Daffodil Institute of IT","15th batch","Not available","No"));
        words.add(new list("Nazmul Hoque Sajal","Daffodil Institute of IT","15th batch","Dhanmondi","No"));
        words.add(new list("Shakil Mahmud","Daffodil Institute of IT","15th batch","Mirpur","No"));
        words.add(new list("Enaan Farhan","Daffodil Institute of IT","15th batch","Mirpur-11","No"));
        words.add(new list("Adeeb","Daffodil Institute of IT","15th batch","Motijhil","Yes"));
        words.add(new list("Meraj Kazi","Daffodil Institute of IT","15th batch","Banashree","No"));
        words.add(new list("Tasfia Haque Tuly","Daffodil Institute of IT","15th batch","Mirpur-1","No"));

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
