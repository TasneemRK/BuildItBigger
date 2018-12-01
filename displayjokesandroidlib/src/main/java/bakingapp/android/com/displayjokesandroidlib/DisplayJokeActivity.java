package bakingapp.android.com.displayjokesandroidlib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayJokeActivity extends AppCompatActivity {

    public static String INTENT_JOKE = "JOKE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_jokes);

        TextView textView = findViewById(R.id.joke_text);

        String joke = getIntent().getStringExtra(INTENT_JOKE);
        if (joke != null){
            textView.setText(joke);
        }


    }
}
