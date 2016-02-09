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
import android.widget.Toast;

/**
 * Created by mine on 12/17/2015.
 */
public class RegistrationActivity extends Activity implements View.OnClickListener {

    Button submit;
    EditText efn, eln, reun, repas, ecpas, eeml;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);

        efn = (EditText) findViewById(R.id.efname);
        eln = (EditText) findViewById(R.id.elname);
        reun = (EditText) findViewById(R.id.reuname);
        repas = (EditText) findViewById(R.id.repass);
        ecpas = (EditText) findViewById(R.id.ecpass);
        eeml = (EditText) findViewById(R.id.eemail);

        submit = (Button) findViewById(R.id.submit);
//        cancel = (Button) findViewById(R.id.cancel);

        submit.setOnClickListener(this);
//        cancel.setOnClickListener(this);

    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.submit:

                SharedPreferences sp = getSharedPreferences("prefs", 0);
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("fastname", efn.getText().toString());
                editor.putString("lastname", eln.getText().toString());
                editor.putString("username", reun.getText().toString());
                editor.putString("email", eeml.getText().toString());
                editor.putString("pass", repas.getText().toString());
                editor.commit();
                //match the password and conform password
                String pas = repas.getText().toString();
                String cpas = ecpas.getText().toString();

                if (!pas.equals(cpas)) {
                    Toast.makeText(this, "Password not match", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(RegistrationActivity.this, RegistrationActivity.class);
                    startActivity(intent);
                }
                else {

                    if (pas.equals((cpas))){
                    Intent i = new Intent(RegistrationActivity.this, HomeActivity.class);
                    startActivity(i);
                }
        }
    }
}
}


