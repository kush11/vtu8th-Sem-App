package com.example.kush.vtu8thsem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class SA extends AppCompatActivity
{
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s);

        pdfView=(PDFView)findViewById(R.id.pdfview);
        pdfView.fromAsset("sa.pdf").load();
    }
}
