package com.mycompany.loginapplication;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by mine on 12/17/2015.
 */
public class RegistrationActivity extends Activity implements View.OnClickListener {
    Button submit;
    EditText efn, eln, reun, repas, eeml;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);

        efn = (EditText) findViewById(R.id.efname);
        eln = (EditText) findViewById(R.id.elname);
        reun = (EditText) findViewById(R.id.reuname);
        repas = (EditText) findViewById(R.id.repass);
        eeml = (EditText) findViewById(R.id.eemail);

        submit = (Button) findViewById(R.id.submit);
//        cancel = (Button) findViewById(R.id.cancel);

        submit.setOnClickListener(this);
//        cancel.setOnClickListener(this);

    }
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.submit:

                SharedPreferences sp = getSharedPreferences("prefs",0);
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("fastname", efn.getText().toString());
                editor.putString("lastname",eln.getText().toString());
                editor.putString("username",reun.getText().toString());
                editor.putString("email",eeml.getText().toString());

                editor.commit();

                Intent i = new Intent(RegistrationActivity.this, LoginActivity.class);
                startActivity(i);
                break;
        }
    }
}
