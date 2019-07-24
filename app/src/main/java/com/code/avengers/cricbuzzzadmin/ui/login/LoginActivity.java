package com.code.avengers.cricbuzzzadmin.ui.login;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.code.avengers.cricbuzzzadmin.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity
{
    @BindView(R.id.etxRunWicket)
    EditText etxRunWicket;

    @BindView(R.id.etxOvers)
    EditText etxOvers;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnUpdate)
    void onUpdateClick()
    {
        String runWicket = etxRunWicket.getText().toString();
        String overs = etxOvers.getText().toString();

        DatabaseReference rootOfDb = FirebaseDatabase.getInstance().getReference();

        rootOfDb.child("run_wicket").setValue(runWicket);
        rootOfDb.child("overs").setValue(overs);
    }
}
