package com.mycompany.loginapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by mine on 12/17/2015.
 */
public class RegistrationActivity extends AppCompatActivity implements View.OnClickListener {
    Button submit, cancel;
    EditText efname, elname, reuname, repass, eemail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);

        efname = (EditText) findViewById(R.id.efname);
        elname = (EditText) findViewById(R.id.elname);
        reuname = (EditText) findViewById(R.id.reuname);
        repass = (EditText) findViewById(R.id.repass);
        eemail = (EditText) findViewById(R.id.eemail);

        submit = (Button) findViewById(R.id.submit);
        cancel = (Button) findViewById(R.id.cancel);


        submit.setOnClickListener(this);
        cancel.setOnClickListener(this);

    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.submit:
                Intent i = new Intent(RegistrationActivity.this, LoginActivity.class);
                startActivity(i);

                break;

        }
    }
}
