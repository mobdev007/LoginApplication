package com.mycompany.loginapplication;

        import android.animation.Animator;
        import android.animation.AnimatorListenerAdapter;
        import android.annotation.TargetApi;
        import android.content.Intent;
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

        import java.util.ArrayList;
        import java.util.List;

        import static android.Manifest.permission.READ_CONTACTS;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity implements OnClickListener {
    Button signup;
    EditText lemail, lepass;
    TextView newregister;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        lemail = (EditText) findViewById(R.id.lemail);
        lepass = (EditText) findViewById(R.id.lepass);
        signup = (Button) findViewById(R.id.signup);
        newregister =(TextView)findViewById(R.id.newregister);

        signup.setOnClickListener(this);
        newregister.setOnClickListener(this);
    }
//    private static final String[] DUMMY_CREDENTIALS = new String[]{
//            "kiran@:pinky", "pinky@:kiran"
//    };
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.signup:
                Intent in = new Intent(LoginActivity.this, HomeActivity.class);
                startActivity(in);

                break;
            case R.id.newregister:

                Intent intent = new Intent(LoginActivity.this, RegistrationActivity.class);
                startActivity(intent);
                //attemptLogin();
                break;
        }

    }

            }





