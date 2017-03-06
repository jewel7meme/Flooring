package tracyyang.flooring;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView resultsTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        resultsTextView = (TextView) findViewById(R.id.textViewResults);
        Intent intent = getIntent();
        String width2 = intent.getExtras().getString("width");
        String length2 = intent.getExtras().getString("length");
        String result2 = intent.getExtras().getString("result");
        resultsTextView.setText("Width is " + width2 + " and length is " + length2 + " and flooring needed is " + result2 + ".");

    }


}
