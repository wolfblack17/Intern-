package com.example.intern_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity2 extends AppCompatActivity {

    private EditText edtEmail;
    private Button btnUpdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        getSupportActionBar().setTitle("ThanhTuongne_2050532100327_2");


        edtEmail = findViewById(R.id.edt_email);
        btnUpdate = findViewById(R.id.btn_update);

        edtEmail.setText(AppUtil.mEmail);

        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backActivity();
            }

            private void backActivity() {
                String strEmailUpdate = edtEmail.getText().toString().trim();

                AppUtil.mEmail =strEmailUpdate;
                finish();
            }
        });
    }
}