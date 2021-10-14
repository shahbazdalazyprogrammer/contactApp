package com.shahbazanwar.contactapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class ContactDetails extends AppCompatActivity implements View.OnClickListener {

    private EditText etCName,etPNumber,etWAddress,etHAddress;
    private ImageButton ibHappy,ibSad,ibNeutral;
    String name,number,web_address,home_address;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_details);
        etCName = findViewById(R.id.etCName);
        etPNumber = findViewById(R.id.etPNumber);
        etWAddress = findViewById(R.id.etWAddress);
        etHAddress = findViewById(R.id.etHAddress);
        ibHappy = findViewById(R.id.ibHappy);
        ibSad = findViewById(R.id.ibSad);
        ibNeutral = findViewById(R.id.ibNeutral);

        ibHappy.setOnClickListener(this);
        ibSad.setOnClickListener(this);
        ibNeutral.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        if(view.getId() ==  R.id.ibHappy){
            if(etCName.getText().toString().isEmpty()){
                Toast.makeText(ContactDetails.this,"Please enter a name",Toast.LENGTH_SHORT).show();
            }
            if(etPNumber.getText().toString().isEmpty()){
                Toast.makeText(ContactDetails.this,"Please enter a number",Toast.LENGTH_SHORT).show();
            }
            if(etWAddress.getText().toString().isEmpty()){
                Toast.makeText(ContactDetails.this,"Please enter a web address",Toast.LENGTH_SHORT).show();
            }
            if(etHAddress.getText().toString().isEmpty()){
                Toast.makeText(ContactDetails.this,"Please enter a home address",Toast.LENGTH_SHORT).show();
            }
            if((!etCName.getText().toString().isEmpty()) && (!etPNumber.getText().toString().isEmpty()) &&
                    (!etWAddress.getText().toString().isEmpty()) && (!etCName.getText().toString().isEmpty())){
                name = etCName.getText().toString().trim();
                number = etPNumber.getText().toString().trim();
                web_address = etWAddress.getText().toString().trim();
                home_address = etHAddress.getText().toString().trim();

                Intent intent = new Intent(ContactDetails.this,com.shahbazanwar.contactapp.SavedContact.class);
                intent.putExtra("reaction",R.id.ibHappy);
                intent.putExtra("p_number",number);
                intent.putExtra("w_address",web_address);
                intent.putExtra("h_address",home_address);
                startActivity(intent);

            }
        }

        if(view.getId() ==  R.id.ibSad){
            if(etCName.getText().toString().isEmpty()){
                Toast.makeText(ContactDetails.this,"Please enter a name",Toast.LENGTH_SHORT).show();
            }
            if(etPNumber.getText().toString().isEmpty()){
                Toast.makeText(ContactDetails.this,"Please enter a number",Toast.LENGTH_SHORT).show();
            }
            if(etWAddress.getText().toString().isEmpty()){
                Toast.makeText(ContactDetails.this,"Please enter a web address",Toast.LENGTH_SHORT).show();
            }
            if(etHAddress.getText().toString().isEmpty()){
                Toast.makeText(ContactDetails.this,"Please enter a home address",Toast.LENGTH_SHORT).show();
            }
            if((!etCName.getText().toString().isEmpty()) && (!etPNumber.getText().toString().isEmpty()) &&
                    (!etWAddress.getText().toString().isEmpty()) && (!etCName.getText().toString().isEmpty())){
                name = etCName.getText().toString().trim();
                number = etPNumber.getText().toString().trim();
                web_address = etWAddress.getText().toString().trim();
                home_address = etHAddress.getText().toString().trim();

                Intent intent = new Intent(ContactDetails.this,com.shahbazanwar.contactapp.SavedContact.class);
                intent.putExtra("reaction",R.id.ibSad);
                intent.putExtra("p_number",number);
                intent.putExtra("w_address",web_address);
                intent.putExtra("h_address",home_address);
                startActivity(intent);

            }

        }

        if(view.getId() ==  R.id.ibNeutral) {
            if(etCName.getText().toString().isEmpty()){
                Toast.makeText(ContactDetails.this,"Please enter a name",Toast.LENGTH_SHORT).show();
            }
            if(etPNumber.getText().toString().isEmpty()){
                Toast.makeText(ContactDetails.this,"Please enter a number",Toast.LENGTH_SHORT).show();
            }
            if(etWAddress.getText().toString().isEmpty()){
                Toast.makeText(ContactDetails.this,"Please enter a web address",Toast.LENGTH_SHORT).show();
            }
            if(etHAddress.getText().toString().isEmpty()){
                Toast.makeText(ContactDetails.this,"Please enter a home address",Toast.LENGTH_SHORT).show();
            }
            if((!etCName.getText().toString().isEmpty()) && (!etPNumber.getText().toString().isEmpty()) &&
                    (!etWAddress.getText().toString().isEmpty()) && (!etCName.getText().toString().isEmpty())){
                name = etCName.getText().toString().trim();
                number = etPNumber.getText().toString().trim();
                web_address = etWAddress.getText().toString().trim();
                home_address = etHAddress.getText().toString().trim();

                Intent intent = new Intent(ContactDetails.this,com.shahbazanwar.contactapp.SavedContact.class);
                intent.putExtra("reaction",R.id.ibNeutral);
                intent.putExtra("p_number",number);
                intent.putExtra("w_address",web_address);
                intent.putExtra("h_address",home_address);
                startActivity(intent);

            }
        }
    }
}