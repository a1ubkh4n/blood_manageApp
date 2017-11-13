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

public class b_positive extends AppCompatActivity {
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
        words.add(new list("Shawon","Daffodil Institute of IT","10th batch","Gandaria","No"));
        words.add(new list("Hasan Ahmed","Daffodil Institute of IT","10th batch","Segun Bagicha","No"));
        words.add(new list("Rume","Daffodil Institute of IT","10th batch","Mogbazar","No"));
        words.add(new list("Kayum Sardar","Daffodil Institute of IT","10th batch","Mirpur","No"));
        words.add(new list("Ebrahim Sarkar","Daffodil Institute of IT","10th batch","Jatrabari","No"));
        words.add(new list("Jannatul Ferdous","Daffodil Institute of IT","10th batch","Teggaon","No"));
        words.add(new list("Ali Hossain","Daffodil Institute of IT","10th batch","Mohammadpur","No"));
        words.add(new list("Mahadi Hassan","Daffodil Institute of IT","10th batch","Kalabagan","No"));
        words.add(new list("Kazi Rayhan Habib","Daffodil Institute of IT","10th batch","Hazaribag","No"));
        words.add(new list("Fouzia Rahaman","Daffodil Institute of IT","11th batch","Old Dhaka","No"));
        words.add(new list("Konika Roy","Daffodil Institute of IT","11th batch","Kallayanpur","Yes"));
        words.add(new list("Md.Nurul Islam","Daffodil Institute of IT","11th batch","Narayangonj","No"));
        words.add(new list("Sonia Akter","Daffodil Institute of IT","11th batch","Keranigonj","No"));
        words.add(new list("Md.Tomal","Daffodil Institute of IT","11th batch","Tejgaon","No"));
        words.add(new list("Sarowar Hossain","Daffodil Institute of IT","11th batch","Tejgaon","No"));
        words.add(new list("Arman Hossain","Daffodil Institute of IT","11th batch","Savar","No"));
        words.add(new list("Sonia Rahaman","Daffodil Institute of IT","11th batch","Bashundhara","No"));
        words.add(new list("Firoz Mahmud","Daffodil Institute of IT","11th batch","Keranigonj","Yes"));
        words.add(new list("Hadi-uz-Zaman","Daffodil Institute of IT","11th batch","Mirpur","Yes"));
        words.add(new list("Md.Saddam Hossain","Daffodil Institute of IT","12th batch","Kamrangir Char","Yes"));
        words.add(new list("Md.Faysal","Daffodil Institute of IT","12th batch","Dhanmondi","No"));
        words.add(new list("Jonathan Peal Paris","Daffodil Institute of IT","12th batch","Gazipur","No"));
        words.add(new list("Kazi Shahed Ahmed","Daffodil Institute of IT","12th batch","Sonirakhra","No"));
        words.add(new list("Risfat Ara","Daffodil Institute of IT","12th batch","Khigaon","No"));
        words.add(new list("Charles Nicolas Gomez","Daffodil Institute of IT","12th batch","Sadarghat","No"));
        words.add(new list("Md.Rahat","Daffodil Institute of IT","12th batch","Not available","No"));
        words.add(new list("Shahadat Hossain","Daffodil Institute of IT","12th batch","Not available","No"));
        words.add(new list("Farhad Ahmed","Daffodil Institute of IT","12th batch","Not available","No"));
        words.add(new list("Snigdha Saber Tonni","Daffodil Institute of IT","12th batch","Mirpur","No"));
        words.add(new list("Sadia Afrin","Daffodil Institute of IT","12th batch","Narayangonj","No"));
        words.add(new list("Sukanto Boral","Daffodil Institute of IT","12th batch","Lagbag","No"));
        words.add(new list("Hayatunnesa","Daffodil Institute of IT","12th batch","Keranigonj","No"));
        words.add(new list("Md.Lotifur Rahaman","Daffodil Institute of IT","12th batch","Mirpur","Yes"));
        words.add(new list("Sajid Rahaman","Daffodil Institute of IT","13th batch","Mirpur","No"));
        words.add(new list("Khadija Akter","Daffodil Institute of IT","13th batch","Not available","No"));
        words.add(new list("Farhan Razzak","Daffodil Institute of IT","13th batch","Not available","Yes"));
        words.add(new list("Nahmia Sultana","Daffodil Institute of IT","13th batch","Not available","No"));
        words.add(new list("Kazi Masud","Daffodil Institute of IT","13th batch","Zigatola","No"));
        words.add(new list("Arfan Sarkar","Daffodil Institute of IT","13th batch","Mugda","No"));
        words.add(new list("Tushar Sutradhar","Daffodil Institute of IT","13th batch","Hazaribag","No"));
        words.add(new list("Moinuddin Sarkar","Daffodil Institute of IT","13th batch","Wari","Yes"));
        words.add(new list("Abdullah-Al-Mamun","Daffodil Institute of IT","13th batch","Wari","No"));
        words.add(new list("Maruf Khan","Daffodil Institute of IT","13th batch","Khilgaon","No"));
        words.add(new list("Mazharul Islam","Daffodil Institute of IT","13th batch","Mirpur","No"));
        words.add(new list("Arifur Rahman","Daffodil Institute of IT","13th batch","Narayangonj","No"));
        words.add(new list("Taslima Akter Shanta","Daffodil Institute of IT","14th batch","Lalbag","No"));
        words.add(new list("Ayesha Siddika Airin","Daffodil Institute of IT","14th batch","Narayangonj","No"));
        words.add(new list("Basharat Rajbin Raka","Daffodil Institute of IT","14th batch","Mirpur","No"));
        words.add(new list("Md.Mokibul Rahaman","Daffodil Institute of IT","14th batch","Mirpur","No"));
        words.add(new list("Abu Sayed Rana","Daffodil Institute of IT","14th batch","Uttara","No"));
        words.add(new list("Pronab Kumar Nandi","Daffodil Institute of IT","14th batch","Not available","No"));
        words.add(new list("Md.Sohan","Daffodil Institute of IT","14th batch","Mohammadpur","No"));
        words.add(new list("Md.Sagar Dewan","Daffodil Institute of IT","14th batch","Mirpur","No"));
        words.add(new list("Md.Siam","Daffodil Institute of IT","14th batch","Mirpur","No"));
        words.add(new list("Aka Al-Magidy","Daffodil Institute of IT","14th batch","Mirpur","No"));
        words.add(new list("Md.Rafi","Daffodil Institute of IT","14th batch","Mirpur","No"));
        words.add(new list("Proma Edris","Daffodil Institute of IT","14th batch","Tejgaon","No"));
        words.add(new list("Farjana Akter Pinky","Daffodil Institute of IT","14th batch","Jatrabari","No"));
        words.add(new list("Md.Humaun Kabir","Daffodil Institute of IT","14th batch","Kalabagan","No"));
        words.add(new list("Rina Akter","Daffodil Institute of IT","14th batch","Keranigonj","No"));
        words.add(new list("Kakon Sarkar","Daffodil Institute of IT","14th batch","Keranigonj","No"));
        words.add(new list("Md.Sujon","Daffodil Institute of IT","14th batch","Zigatola","No"));
        words.add(new list("Umme Shaiba Islam","Daffodil Institute of IT","14th batch","Shukrabad","No"));
        words.add(new list("Ripon Kumar","Daffodil Institute of IT","14th batch","Sadarghat","No"));
        words.add(new list("Md.Salahuddin","Daffodil Institute of IT","14th batch","Ibrahimpur","No"));
        words.add(new list("Mahfuza Rahman","Daffodil Institute of IT","14th batch","Jatrabari","No"));
        words.add(new list("Nazir Uddin Suvo","Daffodil Institute of IT","14th batch","Mirpur","No"));
        words.add(new list("Md.Parvej Bhuiyan","Daffodil Institute of IT","14th batch","Khilgaon","No"));
        words.add(new list("Kazi Nirob","Daffodil Institute of IT","14th batch","Zigatola","Yes"));
        words.add(new list("Md.Sabbir Hossain","Daffodil Institute of IT","14th batch","Lalbag","No"));
        words.add(new list("Amanul Islam","Daffodil Institute of IT","14th batch","Doniya","Yes"));
        words.add(new list("Reazaul Karim","Daffodil Institute of IT","14th batch","Not available","No"));
        words.add(new list("Razib Khan","Daffodil Institute of IT","14th batch","Not available","No"));
        words.add(new list("Raju Ahmed","Daffodil Institute of IT","14th batch","Not available","No"));
        words.add(new list("Riaz Mahmud","Daffodil Institute of IT","14th batch","Not available","No"));
        words.add(new list("Md.Abir-ul Islam","Daffodil Institute of IT","14th batch","Not available","No"));
        words.add(new list("Jamila Ragha","Daffodil Institute of IT","14th batch","Not available","No"));
        words.add(new list("Md.Emam-uz-Zaman","Daffodil Institute of IT","14th batch","Not available","No"));
        words.add(new list("Saiful Islam Rubel","Daffodil Institute of IT","14th batch","Manik Nagar","No"));
        words.add(new list("Bably Akter","Daffodil Institute of IT","14th batch","Mirpur","No"));
        words.add(new list("Sonia Akter","Daffodil Institute of IT","14th batch","Mohakhali","No"));
        words.add(new list("Nazma Haque Eitee","Daffodil Institute of IT","14th batch","Savar","No"));
        words.add(new list("Afrin Akter","Daffodil Institute of IT","14th batch","Lalbag","No"));
        words.add(new list("A.S.M. Rokibul Hasan","Daffodil Institute of IT","14th batch","Shewrapara","Yes"));
        words.add(new list("Rumon","Daffodil Institute of IT","15th batch","Mirpur","Yes"));
        words.add(new list("Faria Afrin Chowdhury","Daffodil Institute of IT","15th batch","Agargaon","No"));
        words.add(new list("Nehal Fatin","Daffodil Institute of IT","15th batch","Uttara","Yes"));
        words.add(new list("Ashraful Alam Rifat","Daffodil Institute of IT","15th batch","Not available","No"));
        words.add(new list("Md.Sumon Hossen","Daffodil Institute of IT","15th batch","Bonshal","No"));
        words.add(new list("Md.Saifuddin Tussar","Daffodil Institute of IT","15th batch","Bonshal","Yes"));
        words.add(new list("Kazi Kaishar Ahmed Prince","Daffodil Institute of IT","15th batch","Mirpur","Yes"));
        words.add(new list("Md.Mukter Hossain","Daffodil Institute of IT","15th batch","Shonir Akhra","Yes"));
        words.add(new list("Md.Yeasin Arafat Sefat","Daffodil Institute of IT","15th batch","Rampura","No"));
        words.add(new list("Majharul Islam","Daffodil Institute of IT","15th batch","Zigatola","No"));
        words.add(new list("Rafi Wasi","Daffodil Institute of IT","15th batch","Lalbag","Yes"));
        words.add(new list("Nur Hasna Suchona","Daffodil Institute of IT","15th batch","Bashabo","No"));
        words.add(new list("Md.Nayem Ahmed","Daffodil Institute of IT","15th batch","Rampura","No"));
        words.add(new list("Mita Rahman","Daffodil Institute of IT","15th batch","Rampura","No"));
        words.add(new list("Jannatul Ferdous","Daffodil Institute of IT","15th batch","Bagla Sarak","No"));
        words.add(new list("Sahaad","Daffodil Institute of IT","15th batch","Jatrabari","No"));
        words.add(new list("Mohammad Al-Amin","Daffodil Institute of IT","15th batch","Khilgaon","No"));
        words.add(new list("Shagor Paul","Daffodil Institute of IT","15th batch","Narayangonj","No"));
        words.add(new list("Mariam Akter","Daffodil Institute of IT","15th batch","Mirpur","No"));
        words.add(new list("Ripa Saha","Daffodil Institute of IT","15th batch","Rai Sha Bazar","No"));
        words.add(new list("Md.Al-Amin","Daffodil Institute of IT","15th batch","Khilgaon","No"));
        words.add(new list("Murad","Daffodil Institute of IT","15th batch","Azimpur","Yes"));
        words.add(new list("Md.Nazrul Islam","Daffodil Institute of IT","15th batch","Mohammadpur","Yes"));
        words.add(new list("Arafat","Daffodil Institute of IT","15th batch","Mirpur","No"));
        words.add(new list("Sabrina Sultana Mithila","Daffodil Institute of IT","15th batch","Zigatola","No"));
        words.add(new list("Sabrina Sujon Nibir","Daffodil Institute of IT","15th batch","Old Dhaka","No"));
        words.add(new list("Niamur Rahman","Daffodil Institute of IT","15th batch","Jurain","No"));
        words.add(new list("Md. Shafiqul","Daffodil Institute of IT","15th batch","Jurain","No"));
        words.add(new list("Nafiul Islam Jeon","Daffodil Institute of IT","15th batch","Dhanmondi","No"));
        words.add(new list("Shazib","Daffodil Institute of IT","15th batch","Uttara","No"));
        words.add(new list("Arman Mahmud","Daffodil Institute of IT","15th batch","Kollyanpur","Yes"));
        words.add(new list("Md. Umar Faruque","Daffodil Institute of IT","15th batch","Mirpur","No"));
        words.add(new list("Tazia Rabbi","Daffodil Institute of IT","15th batch","Mirpur-02","Yes"));

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
