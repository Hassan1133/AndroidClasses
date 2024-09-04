package com.example.androidclasses.activities;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidclasses.R;
import com.example.androidclasses.adapter.RecyclerAdp;
import com.example.androidclasses.model.User;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerAdp adp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init()
    {
        User hassan = new User();
        hassan.setName("Hassan");
        hassan.setMsg("Hello");

        User majid = new User();
        majid.setName("Majid");
        majid.setMsg("hy");

        ArrayList<User> userList = new ArrayList<>();
        userList.add(hassan);
        userList.add(majid);

        recyclerView = findViewById(R.id.recycler);
        adp = new RecyclerAdp(this, userList);
        recyclerView.setAdapter(adp);

    }
}