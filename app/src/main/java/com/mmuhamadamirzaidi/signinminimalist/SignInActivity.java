package com.mmuhamadamirzaidi.signinminimalist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignInActivity extends AppCompatActivity {

    private Button button_account_sign_up;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        button_account_sign_up = findViewById(R.id.button_account_sign_up);

        button_account_sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signUpActivity = new Intent(SignInActivity.this, SignUpActivity.class);
                startActivity(signUpActivity);
            }
        });
    }
}
