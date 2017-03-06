package tracyyang.flooring;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    public static final int RESULT = 1;
    EditText widthEditText;
    EditText lengthEditText;
    Button showResultsButton;
    TextView resultTextView;

    Double width;
    Double length;
    String results;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        widthEditText = (EditText) findViewById(R.id.editTextWidth);
        lengthEditText = (EditText) findViewById(R.id.editTextLength);
        showResultsButton = (Button) findViewById(R.id.buttonShowResults);
        resultTextView = (TextView) findViewById(R.id.textViewResults);
    }

    public void showResults(View view){
        //calling the second activity
        Intent intent = new Intent(this, SecondActivity.class);
        //get string data from input
        String widthS = widthEditText.getText().toString();
        String lengthS = lengthEditText.getText().toString();
        //convert string to double
        width = Double.parseDouble(widthS);
        length = Double.parseDouble(lengthS);
        //calculate the result
        results = String.format("%.2f", width*length);
        //put variables to intent
        intent.putExtra("result", results);
        intent.putExtra("width", widthS);
        intent.putExtra("length", lengthS);
        //start
        startActivity(intent);
        //startActivityForResult(intent,RESULT);

        //display result on mainActivity
        //resultTextView.setText("Width is " + widthS + " and length is " + lengthS + " and flooring needed is " + results + ".");
    }//end of showResults method

    /*protected void onActivityResult(int requrestCode, int resultCode, Intent data){
        super.onActivityResult(requrestCode, resultCode, data);
        if(resultCode == RESULT_OK && requrestCode == RESULT){
            resultTextView.setText("Width is " + width + " and length is " + length + " and flooring needed is " + results + ".");

        }
    }*/
}
