package com.example.yura.simpletodo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    ListView lvTodo;
    EditText etItem;
    Button btAdd;
    ArrayAdapter<String> todoAdapter;
    ArrayList<String>todoList;
    private Object writeItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvTodo = (ListView) findViewById(R.id.lvTodo);
        etItem = (EditText) findViewById(R.id.etItem);
        btAdd = (Button) findViewById(R.id.btAdd);

        readItems();
        todoAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, todoList);
        lvTodo.setAdapter(todoAdapter);

        lvTodo.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                return false;
            }
        });

    }

    private void readItems() {
        File todoFile = new File(getFilesDir(), "todo.txt");
        try {
            todoList = new ArrayList<String>(FileUtils.readLines(todoFile));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void onAdd(View v) {

        String item = etItem.getText().toString();
        todoList.add(item);
        todoAdapter.notifyDataSetChanged();
        etItem.setText("");
        writeItems();
    }

    private void writeItems() {
        File todoFile = new File(getFilesDir(), "todo.txt");
        try {
            FileUtils.writeLines(todoFile, todoList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
