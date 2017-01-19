package com.example.yuantao.basic_ui_and_event;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButton();
    }

    public void addListenerOnButton(){
        button = (Button) findViewById(R.id.button1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openNewActivity = new Intent(getApplicationContext(),LinearActivity.class);

                Intent broswerIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com.au"));
                startActivity(openNewActivity);
            }
        });
    }
}
