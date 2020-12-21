package com.projectpb.infocovid19.Tampilan;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.projectpb.infocovid19.R;

public class gejala extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_gejala);

        TextView textView = findViewById(R.id.article_subheading);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}

