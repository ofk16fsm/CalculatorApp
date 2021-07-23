package se.hig.student.ofk16fsm.mycalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class CalculatorActivity extends AppCompatActivity {


    EditText input1;
    EditText input2;
    EditText result;
    Button button;
    Button add_button;
    Button det_button;
    Button mult_button;
    Button div_button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);


        input1 = (EditText) findViewById(R.id.input1);
        input2 = (EditText) findViewById(R.id.input2);
        result = (EditText) findViewById(R.id.result);
        add_button = (Button) findViewById(R.id.add_button);
        det_button = (Button) findViewById(R.id.det_button);
        mult_button = (Button) findViewById(R.id.mult_button);
        div_button = (Button) findViewById(R.id.div_button);
        button = (Button) findViewById(R.id.button);


        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double input1Double = 0.0;
                double input2Double = 0.0;
                input1Double = Double.parseDouble(input1.getText().toString());
                input2Double = Double.parseDouble(input2.getText().toString());
                double sum = input1Double + input2Double;
                result.setText(String.valueOf(sum));
            }
        });

        det_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double input1Double = 0.0;
                double input2Double = 0.0;
                input1Double = Double.parseDouble(input1.getText().toString());
                input2Double = Double.parseDouble(input2.getText().toString());
                double sum = input1Double - input2Double;
                result.setText(String.valueOf(sum));
            }
        });

        mult_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double input1Double = 0.0;
                double input2Double = 0.0;
                input1Double = Double.parseDouble(input1.getText().toString());
                input2Double = Double.parseDouble(input2.getText().toString());
                double sum = input1Double * input2Double;
                result.setText(String.valueOf(sum));
            }
        });

        div_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double input1Double = 0.0;
                double input2Double = 0.0;
                input1Double = Double.parseDouble(input1.getText().toString());
                input2Double = Double.parseDouble(input2.getText().toString());
                double sum = input1Double / input2Double;
                result.setText(String.valueOf(sum));
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input1.setText("");
                input2.setText("");
                result.setText("");
            }
        });

    }
}