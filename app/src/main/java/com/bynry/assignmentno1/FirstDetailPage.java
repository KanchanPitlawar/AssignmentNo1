package com.bynry.assignmentno1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstDetailPage extends AppCompatActivity implements View.OnClickListener {

    private Button btnBack, btnNext;
    private EditText edtFirstName, edtLastName, edtMobile, edtPassword, edtCPasswod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_detail_page);

        btnBack = findViewById(R.id.btn_back);
        btnNext = findViewById(R.id.btn_next);

        edtFirstName = findViewById(R.id.edt_firstname);
        edtLastName = findViewById(R.id.edt_lastname);
        edtMobile = findViewById(R.id.edt_mobile);
        edtPassword = findViewById(R.id.edt_password);
        edtCPasswod = findViewById(R.id.edt_cpassword);


        btnBack.setOnClickListener(this);
        btnNext.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v == btnBack) {
            Intent intent = new Intent(FirstDetailPage.this, MainActivity.class);
            startActivity(intent);
        }
        if (v == btnNext) {

            if (TextUtils.isEmpty(edtFirstName.getText())) {

                edtFirstName.setError("First name is required!");

            }

            if (TextUtils.isEmpty(edtLastName.getText())) {

                edtLastName.setError("Last name is required!");

            } else if (edtMobile.getText().toString().length() != 10) {
                edtMobile.setError("Not a valid mobile number");

            }

            if (TextUtils.isEmpty(edtPassword.getText())) {

                edtPassword.setError("Password is required!");

            } else if (!(edtPassword.getText().toString()).equals(edtCPasswod.getText().toString())) {
                Toast.makeText(FirstDetailPage.this, "Password Not matching", Toast.LENGTH_SHORT).show();


            } else {
                Intent intent = new Intent(FirstDetailPage.this, AddressDetails.class);
                startActivity(intent);
            }
        }

    }
}
