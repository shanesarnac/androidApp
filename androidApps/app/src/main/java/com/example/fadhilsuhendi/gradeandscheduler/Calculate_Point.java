package com.example.fadhilsuhendi.gradeandscheduler;


import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * Created by fadhilsuhendi on 10/19/14.
 * this is where all of the calculation for grade begins
 */
public class Calculate_Point extends ActionBarActivity {

    private Button calculateButton = null;
    private EditText pointEarn = null;
    private EditText classPerc = null;
    private EditText totalPoint = null;
    private TextView result = null;


    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.calculate_grade_layout);


        result = (TextView) findViewById(R.id.result_text);
        pointEarn = (EditText) findViewById(R.id.point_earned);
        classPerc = (EditText) findViewById(R.id.class_perc);
        totalPoint = (EditText) findViewById(R.id.total_points);

        calculateButton = (Button) findViewById(R.id.calculateButton);
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                double resultVal,pt_earned,cl_perc,tot_point;


                pt_earned = Double.parseDouble(pointEarn.getText().toString());
                cl_perc = Double.parseDouble(classPerc.getText().toString());
                tot_point = Double.parseDouble(totalPoint.getText().toString());



                resultVal = pt_earned + cl_perc + tot_point;

                result.setText(resultVal + ""); // easy way to convert string






            }
        });


    }

    /*public void calculation() {




    }*/
}
