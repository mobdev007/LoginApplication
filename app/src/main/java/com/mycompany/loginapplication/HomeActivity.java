package com.mycompany.loginapplication;

    import android.app.Activity;
    import android.content.Intent;
    import android.content.SharedPreferences;
    import android.os.Bundle;
    import android.support.design.widget.FloatingActionButton;
    import android.support.design.widget.Snackbar;
    import android.support.v7.app.AppCompatActivity;
    import android.support.v7.widget.Toolbar;
    import android.view.View;
    import android.widget.Button;
    import android.widget.EditText;
    import android.widget.TextView;

public class HomeActivity extends Activity implements View.OnClickListener {
    TextView fn,ln,un,em;
    Button lg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        fn = (TextView)findViewById(R.id.fname);
        ln = (TextView)findViewById(R.id.lname);
        un = (TextView)findViewById(R.id.uname);
        em = (TextView)findViewById(R.id.email);

        lg = (Button)findViewById(R.id.logout);

        //user details will be shown here
        SharedPreferences sp = getSharedPreferences("prefs",0);
        String fnm = sp.getString("fastname", "enter first name");
        String lnm = sp.getString("lastname","enter last name");
        String unm = sp.getString("username","enter user name");
        String eml = sp.getString("email","email id");

        fn.setText(fnm);
        ln.setText(lnm);
        un.setText(unm);
        em.setText(eml);

        lg.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.logout:
                Intent it = new Intent(HomeActivity.this, LoginActivity.class);
                startActivity(it);
                break;
        }

    }
}

