package com.example.fadhilsuhendi.gradeandscheduler;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
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
    private Button addCategoryButton = null;
    private ListView categoryList = null;
    private ArrayAdapter arrayAdapter2 = null;



    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.category_layout);



        // creating category list
        categoryList = (ListView) findViewById(R.id.addCategoryList);
        arrayAdapter2 = new ArrayAdapter(this,android.R.layout.simple_list_item_1,categoryListView){

        };

        categoryList.setAdapter(arrayAdapter2);

        // to add category
        addCategoryButton = (Button) findViewById(R.id.addCategory);
        addCategoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alert = new AlertDialog.Builder(Category.this);
                alert.setTitle("Add New Category");
                final EditText input1 = new EditText(Category.this);
                alert.setView(input1);
                alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        String result = input1.getText().toString();
                        Toast.makeText(Category.this, result, Toast.LENGTH_LONG).show();
                        categoryListView.add(result);
                        categoryList.invalidate(); // get new information
                        arrayAdapter2.notifyDataSetChanged();
                    }
                });
                alert.show();


            }
        });


        categoryList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i == 0) {
                    Intent int0 = new Intent(Category.this,Calculate_Point.class); // method?
                    startActivity(int0);
                }
                else {
                    Intent int0 = new Intent(Category.this,Calculate_Point.class); // method?
                    startActivity(int0);
                }

            }
        });



    }
}

/*
final ArrayList<String> list = new ArrayList<>();
list.add("Math");
 list.add("Science");
 ListView lv = new ListView(this);
 ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1) {
  @Override public View getView(int position, View convertView, ViewGroup parent)
   { View view; if (convertView == null) {
    LayoutInflater li = LayoutInflater.from(MapsActivity.this);
     view = li.inflate(android.R.layout.simple_list_item_1, null);
     } else { view = convertView; } ((TextView) view.findViewById(android.R.id.text1)).setText(list.get(position)); if (something) { view.setTag(new Intent(MapsActivity.this, Activity1.class)); } else { view.setTag(new Intent(MapsActivity.this, Activity2.class)); } return view; } }; lv.setOnItemClickListener(new AdapterView.OnItemClickListener() { @Override public void onItemClick(AdapterView<?> parent, View view, int position, long id) { view.getTag(); } });
 */