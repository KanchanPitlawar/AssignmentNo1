package com.bynry.assignmentno1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HobbiesDetails extends AppCompatActivity implements View.OnClickListener {

    private Button btnBack, btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hobbies_details);

        btnBack = findViewById(R.id.btn_back);
        btnSubmit = findViewById(R.id.btn_submit);

        btnBack.setOnClickListener(this);
        btnSubmit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v == btnBack)
        {
            Intent intent = new Intent(HobbiesDetails.this, AddressDetails.class);
            startActivity(intent);
        }

        if(v == btnSubmit)
        {
            Intent intent = new Intent(HobbiesDetails.this, MainActivity.class);
            startActivity(intent);
        }
    }
}
