package com.example.recyclerviewex5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewex5.adapter.UserAdapter;
import com.example.recyclerviewex5.model.User;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //1-RecyclerView
        RecyclerView recyclerView;
        recyclerView = findViewById(R.id.recyclerView);

        //2- Datasource
        List<User> itemUser;
        itemUser = new ArrayList<>();
        for (int i = 0; i <= 20; i++) {
            itemUser.add(new User(i, "Username 0" + i));
        }

        //3- Adapter
        UserAdapter userAdapter;
        userAdapter = new UserAdapter(itemUser);

        recyclerView.setAdapter(userAdapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);





    }
}