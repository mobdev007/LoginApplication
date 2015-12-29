package com.mycompany.loginapplication;

    import android.content.Intent;
    import android.os.Bundle;
    import android.support.design.widget.FloatingActionButton;
    import android.support.design.widget.Snackbar;
    import android.support.v7.app.AppCompatActivity;
    import android.support.v7.widget.Toolbar;
    import android.view.View;
    import android.widget.Button;
    import android.widget.EditText;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {
    Button logout;
    EditText efname, elname, reuname, eemail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        efname = (EditText) findViewById(R.id.efname);
        elname = (EditText) findViewById(R.id.elname);
        reuname = (EditText) findViewById(R.id.reuname);
        eemail = (EditText) findViewById(R.id.eemail);

        logout = (Button) findViewById(R.id.logout);

        logout.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.logout:
                Intent i = new Intent(HomeActivity.this, LoginActivity.class);
                startActivity(i);

                break;

        }

    }
}

