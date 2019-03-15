package com.bynry.assignmentno1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnLogin, btnSignUp;
    private EditText edtUsername, edtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btn_login);
        btnSignUp = findViewById(R.id.btn_signup);
        edtUsername = findViewById(R.id.edt_username);
        edtPassword = findViewById(R.id.edt_password);

        btnLogin.setOnClickListener(this);
        btnSignUp.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v == btnLogin) {

            if (TextUtils.isEmpty(edtUsername.getText())) {

                edtUsername.setError("Username is required!");
            }

            if (TextUtils.isEmpty(edtPassword.getText())) {

                edtPassword.setError("Password is required!");
            } else {
                Intent intent = new Intent(MainActivity.this, Congratulation.class);
                intent.putExtra("name", edtUsername.getText().toString().trim());
                startActivity(intent);
            }
        } else if (v == btnSignUp) {
            Intent intent = new Intent(MainActivity.this, FirstDetailPage.class);
            startActivity(intent);
        }
    }
}
