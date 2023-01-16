package com.example.sondeneme1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class TakimlarActivity extends AppCompatActivity {
    ListView listView1;
    Button btn;
    ArrayList<Takim> Takimlar= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_takimlar);

        listView1 =findViewById(R.id.listView1);



        Takimlar.add(new Takim("Fenerbahçe","Süper Lig",R.drawable.fenerbahce));
        Takimlar.add(new Takim("Galatasaray","Süper Lig", R.drawable.galatasaray));
        Takimlar.add(new Takim("Beşiktaş","Süper Lig",R.drawable.besiktas));
        Takimlar.add(new Takim("AntalyaSpor","Süper Lig",R.drawable.antalyaspor));
        Takimlar.add(new Takim("KonyaSpor","Süper Lig",R.drawable.konyaspor));
        Takimlar.add(new Takim("TrabzonSpor","Süper Lig",R.drawable.trabzonspor));
        Takimlar.add(new Takim("Altay SK","Süper Lig",R.drawable.altay));
        Takimlar.add(new Takim("SivasSpor","Süper Lig",R.drawable.sivasspor));
        Takimlar.add(new Takim("AlanyaSpor","Süper Lig",R.drawable.alanyaspor));
        Takimlar.add(new Takim("A.DemirSpor","Süper Lig",R.drawable.adanademirspor));
        Takimlar.add(new Takim("Elazığ","Süper Lig",R.drawable.elazigspor));
        Takimlar.add(new Takim("Ç.RizeSpor","Süper Lig",R.drawable.caykurrizespor));
        Takimlar.add(new Takim("Y.MalatyaSpor","Süper Lig",R.drawable.yenimalatyaspor));
        Takimlar.add(new Takim("Giresun","Süper Lig",R.drawable.giresunspor));
        Takimlar.add(new Takim("GöztepeSpor","Süper Lig",R.drawable.goztepespor));
        Takimlar.add(new Takim("KayseriSpor","Süper Lig",R.drawable.kayserispor));
        Takimlar.add(new Takim("HataySpor","Süper Lig",R.drawable.hatayspor));
        Takimlar.add(new Takim("Başakşehir FC","Süper Lig",R.drawable.basaksehir));


        CustomAdapter adapter = new CustomAdapter(Takimlar,this);
        listView1.setAdapter(adapter);
    }

    public void Mac(View view) {
        Intent i = new Intent(getApplicationContext(),MaclarActivity.class);
        startActivity(i);
    }
}