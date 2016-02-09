package com.mycompany.loginapplication;

        import android.animation.Animator;
        import android.animation.AnimatorListenerAdapter;
        import android.annotation.TargetApi;
        import android.app.Activity;
        import android.content.Intent;
        import android.content.SharedPreferences;
        import android.content.pm.PackageManager;
        import android.support.annotation.NonNull;
        import android.support.design.widget.Snackbar;
        import android.support.v7.app.AppCompatActivity;
        import android.app.LoaderManager.LoaderCallbacks;

        import android.content.CursorLoader;
        import android.content.Loader;
        import android.database.Cursor;
        import android.net.Uri;
        import android.os.AsyncTask;

        import android.os.Build;
        import android.os.Bundle;
        import android.provider.ContactsContract;
        import android.support.v7.widget.ThemedSpinnerAdapter;
        import android.text.TextUtils;
        import android.view.KeyEvent;
        import android.view.View;
        import android.view.View.OnClickListener;
        import android.view.inputmethod.EditorInfo;
        import android.widget.ArrayAdapter;
        import android.widget.AutoCompleteTextView;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;
        import android.widget.Toast;

        import java.util.ArrayList;
        import java.util.List;

        import static android.Manifest.permission.READ_CONTACTS;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends Activity implements OnClickListener {

    Button sup;
    EditText eemail, epass;
    TextView newreg;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        eemail = (EditText) findViewById(R.id.editemail);
        epass = (EditText) findViewById(R.id.editpass);
        sup = (Button) findViewById(R.id.signin);
        newreg =(TextView)findViewById(R.id.newregister);

        sup.setOnClickListener(this);
        newreg.setOnClickListener(this);
    }
//    private static final String[] DUMMY_CREDENTIALS = new String[]{
//            "k@:pinky", "pinky@:k"
//    };
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.signin:
                String email = eemail.getText().toString();
                String pass = epass.getText().toString();

                SharedPreferences sharedPreferences = getSharedPreferences("prefs", 0);
                String password = sharedPreferences.getString("pass", "none");
                String emailid = sharedPreferences.getString("email","none");

                if (email.equals(emailid)) {
                    if (pass.equals(password)) {
                        Intent in = new Intent(LoginActivity.this, HomeActivity.class);
                        in.putExtra("eemail", email);
                        startActivity(in);
                    }
                    else
                    {
                        Toast.makeText(this,"Invalid password!",Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(this,LoginActivity.class);
                        startActivity(i);
                    }

                } else {
                    Toast.makeText(this, "Invalid username!", Toast.LENGTH_SHORT).show();
                    Intent t = new Intent(this, LoginActivity.class);
                    startActivity(t);
                }




                break;
            case R.id.newregister:

                Intent intent = new Intent(LoginActivity.this, RegistrationActivity.class);
                startActivity(intent);
                break;
        }

    }

}





