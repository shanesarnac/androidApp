package com.example.fadhilsuhendi.gradeandscheduler;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by fadhilsuhendi on 10/19/14.
 */
public class Category extends ActionBarActivity {

    ArrayList<String> categoryListView = new ArrayList<String>(); // create arrayList for category
    private Button addCategory = null;
    private ListView categoryList = null;
    private ArrayAdapter arrayAdapter2 = null;


    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.calculate_layout);



        // creating category list
        categoryList = (ListView) findViewById(R.id.addCategoryList);
        arrayAdapter2 = new ArrayAdapter(this,android.R.layout.simple_list_item_1,categoryListView);

        // to add category
        addCategory = (Button) findViewById(R.id.addCategory);
        addCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alert = new AlertDialog.Builder(Category.this);
                alert.setTitle("Add Category");
                final EditText input = new EditText(Category.this);
                alert.setView(input);
                alert.setPositiveButton("Ok",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        String result = input.getText().toString();
                        Toast.makeText(Category.this,result,Toast.LENGTH_LONG).show();
                        categoryListView.add(result);
                        categoryList.invalidate(); // get new information
                        arrayAdapter2.notifyDataSetChanged();
                    }
                });



            }
        });

    }
}
