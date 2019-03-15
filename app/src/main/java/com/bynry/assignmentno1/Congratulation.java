package com.bynry.assignmentno1;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.app.Dialog;


public class Congratulation extends AppCompatActivity implements View.OnClickListener {

    private Button btnCloseApp;
    private TextView txtFullName;
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_congratulation);

        btnCloseApp = findViewById(R.id.btn_closeapp);
        txtFullName = findViewById(R.id.txt_fullname);

        btnCloseApp.setOnClickListener(this);

        String name = getIntent().getStringExtra("name");
        txtFullName.setText(name);
    }

    public void onClick(View v) {
        if (v == btnCloseApp) {
            showAlertDialog();
        }
    }

    private void showAlertDialog() {
        final Dialog dialog = new Dialog(Congratulation.this);
        //dialog.setContentView(R.layout.custom_alert_box);

        final LayoutInflater layoutInflater = this.getLayoutInflater();
        final View vCustom = layoutInflater.inflate(R.layout.custom_alert_box, null, false);
        dialog.setContentView(vCustom);

        Button dialogButtonYes = vCustom.findViewById(R.id.btn_yes);
        Button dialogButtonNo = vCustom.findViewById(R.id.btn_no);

        dialogButtonYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        dialogButtonNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }
}
