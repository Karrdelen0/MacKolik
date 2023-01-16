package com.example.sondeneme1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MaclarActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    ArrayList<Mac> Mac = new ArrayList<>();
    Context context =this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maclar);
        recyclerView = findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        layoutManager.scrollToPosition(0);
        recyclerView.setLayoutManager(layoutManager);
       recyclerView.setHasFixedSize(true);
        Mac.add(new Mac("21.11.2021- 19.00","Şükrü Saraçoğlu Stadyumu",R.drawable.fenerbahce,R.drawable.galatasaray));
        Mac.add(new Mac("07.11.2021- 19.00","Vodafone Park Stadyumu",R.drawable.besiktas,R.drawable.trabzonspor));
        Mac.add(new Mac("01.08.2021- 17.00","Kazım Karabekir Stadyumu",R.drawable.konyaspor,R.drawable.antalyaspor));
        Mac.add(new Mac("10.10.2021- 16.00","Bornova Aziz Kocaoğlu Stadyumu",R.drawable.altay,R.drawable.sivasspor));
        Mac.add(new Mac("18.12.2021- 19.00","Alanya Oba Stadyumu",R.drawable.alanyaspor,R.drawable.adanademirspor));
        Mac.add(new Mac("19.12.2021- 12.30","Rize Stadyumu",R.drawable.caykurrizespor,R.drawable.yenimalatyaspor));
        Mac.add(new Mac("03.02.2019- 13.30","11 Nisan Stadyumu",R.drawable.elazigspor,R.drawable.giresunspor));
        Mac.add(new Mac("22.11.2021- 20.00","Kadir Has Şehir Stadyumu",R.drawable.goztepespor,R.drawable.kayserispor));
        Mac.add(new Mac("24.01.2019- 13.00","Antakya Atatürk Stadyumu",R.drawable.basaksehir,R.drawable.hatayspor));
        Custom1Adapter custom1Adapter = new Custom1Adapter(Mac,context);
        recyclerView.setAdapter(custom1Adapter);
    }
}