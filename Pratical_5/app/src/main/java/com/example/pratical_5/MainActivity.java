package com.example.pratical_5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mwebsiteEditText;
    private EditText mLocationEditText;
    private EditText mShareTextEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mwebsiteEditText = findViewById(R.id.website_edittext);
        mLocationEditText = findViewById(R.id.location_edittext);
        mShareTextEditText = findViewById(R.id.share_edittext);

        Button open_website_button = (Button) findViewById(R.id.open_website_button);
        open_website_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = mwebsiteEditText.getText().toString();
                Uri webpage = Uri.parse(url);
                Intent intent = new Intent( Intent.ACTION_VIEW, webpage);
//                startActivity(intent);
//                if (intent.resolveActivity(getPackageManager()) == null) {
//                    Log.d("ImplicitIntents", "Can't handle this intent!");
//                } else {
//                }
                startActivity(intent);
            }
        });
    }


    public void openLocation(View view) {
        String loc = mLocationEditText.getText().toString();
        Uri addressUri = Uri.parse("geo:0,0?q=" + loc);
        Intent intent = new Intent(Intent.ACTION_VIEW, addressUri);
        startActivity(intent);
//        if (intent.resolveActivity(getPackageManager()) != null) {
//            startActivity(intent);
//        } else {
//            Log.d("ImplicitIntents", "Can't handle this intent!");
//        }
    }

    public void shareText(View view) {
        String txt = mShareTextEditText.getText().toString();
        String mimeType = "text/plain";
        ShareCompat.IntentBuilder
                .from(this)
                .setType(mimeType)
                .setChooserTitle(R.string.edittext_loc)
                .setText(txt)
                .startChooser();
    }
}