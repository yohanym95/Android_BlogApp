package com.example.yohan.blogapp;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;

public class Login extends AppCompatActivity {
    private Button btnLogin;
    private Button btnCreateAccount;
    static final int GOOGLE_SIGN = 123;
    FirebaseAuth mAuth;
    Button signInButton;
    GoogleSignInClient googleSignInClient;
    Button logout;
    ProgressDialog progressDialog1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = findViewById(R.id.btnlogin);
        btnCreateAccount = findViewById(R.id.btncreateaccount);
        signInButton = findViewById(R.id.sign_in_button);

        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken("464589277503-me1b7qmff9h4t39nucupquuvfib14j93.apps.googleusercontent.com")
                .requestEmail()
                .build();
        mAuth = FirebaseAuth.getInstance();
        // Build a GoogleSignInClient with the options specified by gso.
        googleSignInClient = GoogleSignIn.getClient(this, gso);

        progressDialog1 = new ProgressDialog(Login.this);
        progressDialog1.setTitle("Logging In");
        progressDialog1.setMessage("Please wait while we check Your credentials");


//        googleApiClient = new GoogleApiClient.Builder(this)
//                .enableAutoManage(this,this)
//                .addApi(Auth.GOOGLE_SIGN_IN_API)
//                .build();



        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SignInGoogle();
            }
        });



        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Login.this,Loginaccount.class);
                startActivity(i);
                finish();
            }
        });

        btnCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Login.this,Register.class);
                startActivity(i);
                finish();

            }
        });
    }
    void SignInGoogle(){
        Intent signIntemt = googleSignInClient.getSignInIntent();
        startActivityForResult(signIntemt,GOOGLE_SIGN);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == GOOGLE_SIGN) {
            Task<GoogleSignInAccount> task = GoogleSignIn
                    .getSignedInAccountFromIntent(data);
            // GoogleSignInResult result = Auth.GoogleSignInApi.getSignInResultFromIntent(data);
//            if(result.isSuccess()){
//                GoogleSignInAccount account = result.getSignInAccount();
//                if(account != null){
//                    String identifier = account.getId()+"";
//                    String displayName = account.getDisplayName()+"";
//

//
//                }
//            }

            try{

                GoogleSignInAccount account = task.getResult(ApiException.class);
                if (account != null)
                    progressDialog1.show();
                    firebaseAuthWithGoogle(account);

            }catch (ApiException e){
                e.printStackTrace();
            }
        }

    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser currentUser = mAuth.getCurrentUser();
        updateUI(currentUser);
    }



    private void firebaseAuthWithGoogle(GoogleSignInAccount account) {

        AuthCredential credential = GoogleAuthProvider
                .getCredential(account.getIdToken(),null);
        mAuth.signInWithCredential(credential)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if(task.isSuccessful()){
                            progressDialog1.dismiss();
                            FirebaseUser user = mAuth.getCurrentUser();
                            // googleApiClient.clearDefaultAccountAndReconnect();
                            updateUI(user);

                        }else {
                            Toast.makeText(getApplicationContext(), "SignIn Failed!",Toast.LENGTH_LONG).show();
                            updateUI(null);
                        }
                    }
                });
    }

    private void updateUI(FirebaseUser user){
        if(user != null){
            Intent startIntent = new Intent(Login.this,MainActivity.class);
            startActivity(startIntent);
            finish();
        }

    }

    @Override
    public void onBackPressed() {
//        finish();
//        super.onBackPressed();
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}
