package com.happycity.project.happy_shipper.ui.activity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.happycity.project.happy_shipper.R;

import java.util.Objects;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity{

    AutoCompleteTextView edittextEmail;
    EditText edtPassword;
    Button mEmailSignInButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initView();

        mEmailSignInButton.setOnClickListener(new OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View view) {
                attemptLogin();
            }
        });

    }

    private void initView() {
        mEmailSignInButton = findViewById(R.id.email_sign_in_button);
        edittextEmail = findViewById(R.id.emailLogin);
        edtPassword = findViewById(R.id.password);
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    private void attemptLogin() {
        if (Objects.equals(edittextEmail.getText().toString(), "admin") &&
                Objects.equals(edtPassword.getText().toString(), "admin")){
            Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
            startActivity(intent);
        }else{
            Toast.makeText(this, "Your email or password error", Toast.LENGTH_SHORT).show();
        }
    }

}

