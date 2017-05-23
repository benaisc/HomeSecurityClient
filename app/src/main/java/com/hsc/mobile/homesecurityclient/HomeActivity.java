package com.hsc.mobile.homesecurityclient;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    private static final int CODE_MON_ACTIVITE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void loginBtn(View v) {
        //Toast.makeText(this, "Log In btn clicked", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, LoginActivity.class);
        startActivityForResult(intent, CODE_MON_ACTIVITE);
    }



    /*
    private static final int CODE_MON_ACTIVITE = 1;

    Intent intent = new Intent(this, ClassSousActivite.class);
    //représente l'identifiant de la requête qui sera utilisé pour
    //identifier l'activité renvoyant la valeur de retour
    startActivityForResult(intent, CODE_MON_ACTIVITE);

    _________________________________________________________________

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.button1:
                setResult(RESULT_OK);
                finish();
                break;
            case R.id.button2:
                setResult(RESULT_CANCELED);
                finish();
            break;
        }
    }
     */
}
