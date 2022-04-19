package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<ContactModel> arrContacts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView =  findViewById(R.id.recyclerContact);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        arrContacts.add(new ContactModel(R.drawable.cute_girl,"cute girl","1234"));
        arrContacts.add(new ContactModel(R.drawable.cute_girl,"cute girl","1234"));
        arrContacts.add(new ContactModel(R.drawable.cute_girl,"cute girl","1234"));
        arrContacts.add(new ContactModel(R.drawable.cute_girl,"cute girl","1234"));
        arrContacts.add(new ContactModel(R.drawable.diya,"Diya","1234"));
        arrContacts.add(new ContactModel(R.drawable.diya,"Diya","1234"));
        arrContacts.add(new ContactModel(R.drawable.diya,"Diya","1234"));
        arrContacts.add(new ContactModel(R.drawable.diya,"Diya","1234"));
        arrContacts.add(new ContactModel(R.drawable.ananya,"Ananya","1234"));
        arrContacts.add(new ContactModel(R.drawable.ananya,"Ananya","1234"));
        arrContacts.add(new ContactModel(R.drawable.ananya,"Ananya","1234"));
        arrContacts.add(new ContactModel(R.drawable.ananya,"Ananya","1234"));
        arrContacts.add(new ContactModel(R.drawable.riya,"Riya","1234"));
        arrContacts.add(new ContactModel(R.drawable.riya,"Riya","1234"));
        arrContacts.add(new ContactModel(R.drawable.riya,"Riya","1234"));
        arrContacts.add(new ContactModel(R.drawable.riya,"Riya","1234"));
        RecyclerContactAdapter adapter = new RecyclerContactAdapter(this,arrContacts);
        recyclerView.setAdapter(adapter);
    }
}