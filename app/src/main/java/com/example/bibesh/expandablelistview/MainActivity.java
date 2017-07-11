package com.example.bibesh.expandablelistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ExpandableListView expandableList;
    ExpandableListAdapter adapter ;
    private List<String> listDataheader;
    private HashMap<String,List<String>> listhash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intData();
        expandableList = (ExpandableListView) findViewById(R.id.expandableList);
        adapter = new com.example.bibesh.expandablelistview.ExpandableListAdapter(this,listDataheader,listhash);
        expandableList.setAdapter(adapter);
    }

    void intData(){
        listDataheader = new ArrayList<>();
        listDataheader.add("Heading 1");
        listDataheader.add("Heading 2");
        listDataheader.add("Heading 3");
        listDataheader.add("Heading 4");

        List<String> heading1 = new ArrayList<>();
        heading1.add("H1");

        List<String> heading2 = new ArrayList<>();
        heading1.add("H2");

        List<String> heading3 = new ArrayList<>();
        heading1.add("H3");

        List<String> heading4 = new ArrayList<>();
        heading1.add("H4");

        listhash = new HashMap<>();
        listhash.put(listDataheader.get(0),heading1);
        listhash.put(listDataheader.get(1),heading1);
        listhash.put(listDataheader.get(2),heading1);
        listhash.put(listDataheader.get(3),heading1);

    }


}
