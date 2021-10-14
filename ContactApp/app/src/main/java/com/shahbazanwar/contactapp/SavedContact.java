package com.shahbazanwar.contactapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class SavedContact extends AppCompatActivity implements View.OnClickListener {

    private ImageButton ibReaction,ibDialer,ibBrowser,ibMaps;
    private Button btnCC1;
    String pn,wa,ha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saved_contact);

        ibReaction = findViewById(R.id.ibReaction);
        ibDialer = findViewById(R.id.ibDialer);
        ibBrowser = findViewById(R.id.ibBrowser);
        ibMaps = findViewById(R.id.ibMaps);
        btnCC1 = findViewById(R.id.btnCC1);

        ibDialer.setOnClickListener(this);
        ibBrowser.setOnClickListener(this);
        ibMaps.setOnClickListener(this);
        btnCC1.setOnClickListener(this);
        int a = getIntent().getIntExtra("reaction",R.id.ibHappy);
        if(a == R.id.ibHappy){
            ibReaction.setImageResource(R.drawable.happy);
        }
        int b = getIntent().getIntExtra("reaction",R.id.ibSad);
        if(b == R.id.ibSad){
            ibReaction.setImageResource(R.drawable.sad);
        }
        int c = getIntent().getIntExtra("reaction",R.id.ibNeutral);
        if(c == R.id.ibNeutral){
            ibReaction.setImageResource(R.drawable.neutral);
        }

    }

    @Override
    public void onClick(View view) {

        if(view.getId() == R.id.ibDialer){
            pn = getIntent().getStringExtra("p_number");
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: "+pn));
            startActivity(intent);
        }
        if(view.getId() == R.id.ibBrowser){
            wa = getIntent().getStringExtra("w_address");
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(wa));
            startActivity(intent);
        }
        if(view.getId() == R.id.ibMaps){
            ha = getIntent().getStringExtra("h_address");
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0, 0?q="+ha));
            startActivity(intent);
        }
        if(view.getId() == R.id.btnCC1){
            Intent intent = new Intent(SavedContact.this,com.shahbazanwar.contactapp.ContactDetails.class);
            startActivity(intent);
        }
    }
}