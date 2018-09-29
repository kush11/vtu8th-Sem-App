package com.example.kush.vtu8thsem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class SMS extends AppCompatActivity
{
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);

        pdfView=(PDFView)findViewById(R.id.pdfview);
        pdfView.fromAsset("sms.pdf").load();
    }
}
