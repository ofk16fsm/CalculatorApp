package se.hig.student.ofk16fsm.mycalc;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MyCalc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_calc);


        Button about_button = (Button) findViewById(R.id.about_button);
        if (about_button != null) {
            about_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    displayAlertDialog();
                    displayToast();
                }
            });
        }
    }

    public void startCalc(View view) {
        Intent intent = new Intent(this, CalculatorActivity.class);
        startActivity(intent);
    }


    public void displayAlertDialog() {
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(MyCalc.this);
        dialogBuilder.setTitle("About Calculator");
        dialogBuilder.setMessage(R.string.about_button_text);
        dialogBuilder.setCancelable(false);
        dialogBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        dialogBuilder.show();
    }

    public void displayToast() {
        Toast toast = Toast.makeText(this, "This is a simple calculator", Toast.LENGTH_LONG);
        toast.show();
    }
}
