package com.example.yura.simpletodo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class EditActivity extends AppCompatActivity {

    EditText etNewContent;

    int pos;
    String posValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        etNewContent = (EditText) findViewById((R.id.etNewContent));

        Intent i = getIntent();
        pos = i.getExtras().getInt("itemposition");
        posValue = i.getExtras().getString("itemvalue");

        etNewContent.setText(posValue);

    }

    public void onSaveItem(View v){
        Intent data = new Intent();
        data.putExtra("newitemvalue", etNewContent.getText().toString());
        data.putExtra("pos", pos);
        setResult(100, data);
        finish();
    }
}
