package com.sprint.gina.constraintlayoutfuns2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

// skeleton icon credit:
// <div>Icons made by <a href="https://www.freepik.com" title="Freepik">Freepik</a> from <a href="https://www.flaticon.com/" title="Flaticon">www.flaticon.com</a></div>

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onButtonClick(View v) {
        Button b = (Button) v;
//        String text = b.getText().toString();
        String text = b.getTag().toString();
        Toast.makeText(this, "Hello from button " + text, Toast.LENGTH_SHORT).show();
    }
}