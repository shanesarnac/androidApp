package com.example.fadhilsuhendi.gradeandscheduler;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by fadhilsuhendi on 10/13/14.
 */
public class CalculateGrade extends ActionBarActivity {

    String[] courseString = new String[] {
            "CSCI 3308",
            "CALC II",
            "PHYSICS"
    };


    ArrayList<String> courseAddList = new ArrayList<String>(); // create arraylist for string(course)
    private Button backButton = null;
    private Button saveButton = null;
    private Button addCourseButton =null;
    private ListView courseList = null;
    private ArrayAdapter arrayAdapter = null;
    private Context mContext = null;


    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.calculate_layout);

        // go back button
        backButton = (Button) findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(),MyActivity.class);
                startActivity(i);


            }
        });

        // save button
        saveButton = (Button) findViewById(R.id.saveButton);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent j = new Intent(view.getContext(),)
            }
        });

        // function to listView for array adapter
        courseList = (ListView) findViewById(R.id.addCourseList);
        // this will connect from array adapter to the listview
        arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,courseAddList);

        if(courseList != null){
            courseList.setAdapter(arrayAdapter);
        }

        // add course button
        addCourseButton = (Button) findViewById(R.id.addButtonClass);
        addCourseButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                AlertDialog.Builder alert = new AlertDialog.Builder(CalculateGrade.this);
                alert.setTitle("Add New Course");
                //alert.setMessage("");
                final EditText input = new EditText(CalculateGrade.this);
                alert.setView(input);
                alert.setPositiveButton("Ok",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        String result = input.getText().toString();
                        Toast.makeText(CalculateGrade.this,result,Toast.LENGTH_LONG).show(); // simple feedback for operational
                        courseAddList.add(result);
                        courseList.invalidate(); // get new information
                        arrayAdapter.notifyDataSetChanged();

                    }
                });

                alert.show();
            }
        });

        courseList.setClickable(true);

        courseList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i == 0) {
                    Intent int0 = new Intent(CalculateGrade.this,Category.class); // method?
                    startActivity(int0);
                }
            }
        });




    }



}
