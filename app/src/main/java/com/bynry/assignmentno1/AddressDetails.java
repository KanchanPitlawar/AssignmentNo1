package com.bynry.assignmentno1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddressDetails extends AppCompatActivity implements View.OnClickListener {

    private Button btnBack, btnNext;
    private EditText edtTempAddress, edtPerAddress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.address_details);

        btnBack = findViewById(R.id.btn_back);
        btnNext = findViewById(R.id.btn_next);
        edtTempAddress = findViewById(R.id.edt_temp_address);
        edtPerAddress = findViewById(R.id.edt_per_address);

        btnBack.setOnClickListener(this);
        btnNext.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v == btnBack)
        {
            Intent intent = new Intent(AddressDetails.this, FirstDetailPage.class);
            startActivity(intent);
        }

        if(v == btnNext)
        {

            if (TextUtils.isEmpty(edtTempAddress.getText())) {

                edtTempAddress.setError("Temporary Address is required!");

            }

            if (TextUtils.isEmpty(edtPerAddress.getText())) {

                edtPerAddress.setError("Permanent Address is required!");

            }

            else {
                Intent intent = new Intent(AddressDetails.this, HobbiesDetails.class);
                startActivity(intent);
            }
        }
    }
}
