package com.projectpb.infocovid19.Tampilan;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.projectpb.infocovid19.Model.Indonesia;
import com.projectpb.infocovid19.R;

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class InfoActivity extends AppCompatActivity {
    private TextView sembuh;
    private TextView rawat;
    private TextView meninggal;
    private TextView positif;
    private TextView negara;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        rawat = findViewById(R.id.txtrawat);
        rawat.setText(Indonesia.dirawat);

        sembuh = findViewById(R.id.txtSembuh);
        sembuh.setText(Indonesia.sembuh);

        meninggal = findViewById(R.id.txtmeninggal);
        meninggal.setText(Indonesia.meninggal);

        positif = findViewById(R.id.txtTotal);
        positif.setText(Indonesia.positif);

        negara = findViewById(R.id.txtnegara);
        negara.setText("Kasus di " + Indonesia.name);

        CardView tblarticovid = findViewById(R.id.tblarticovid);
        tblarticovid.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), articovid.class);
                startActivity(intent);


            }
        });

        CardView tblgejala = findViewById(R.id.tblgejala);
        tblgejala.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), gejala.class);
                startActivity(intent);


            }
        });


        CardView tblprotokol = findViewById(R.id.tblprotokol);
        tblprotokol.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), protokol.class);
                startActivity(intent);


            }
        });

        Calendar c1 = Calendar.getInstance();
        SimpleDateFormat sdf1 = new SimpleDateFormat("d/M/yyyy h:m:s a");
        //SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");
        String strdate1 = sdf1.format(c1.getTime());
        TextView txtdate1 = (TextView) findViewById(R.id.txttanggal);
        txtdate1.setText(strdate1);
    }


    public void onResume(){
        super.onResume();
        rawat = findViewById(R.id.txtrawat);
        rawat.setText(Indonesia.dirawat);

        sembuh = findViewById(R.id.txtSembuh);
        sembuh.setText(Indonesia.sembuh);

        meninggal = findViewById(R.id.txtmeninggal);
        meninggal.setText(Indonesia.meninggal);

        positif = findViewById(R.id.txtTotal);
        positif.setText(Indonesia.positif);

        negara = findViewById(R.id.txtnegara);
        negara.setText("Kasus di " + Indonesia.name);

    }


}