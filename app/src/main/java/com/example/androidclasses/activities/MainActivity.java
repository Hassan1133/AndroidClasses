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

        User one = new User();
        one.setName("Hassan");
        one.setMsg("Hello");

        User two = new User();
        two.setName("Majid");
        two.setMsg("hy");

        User three = new User();
        three.setName("Hassan");
        three.setMsg("Hello");

        User four = new User();
        four.setName("Majid");
        four.setMsg("hy");

        User five = new User();
        five.setName("Hassan");
        five.setMsg("Hello");

        User six = new User();
        six.setName("Majid");
        six.setMsg("hy");

        User eight = new User();
        eight.setName("Hassan");
        eight.setMsg("Hello");

        User nine = new User();
        nine.setName("Majid");
        nine.setMsg("hy");

        User o = new User();
        o.setName("Majid");
        o.setMsg("hy");

        User u = new User();
        u.setName("Hassan");
        u.setMsg("Hello");

        User i = new User();
        i.setName("Majid");
        i.setMsg("hy");

        ArrayList<User> userList = new ArrayList<>();
        userList.add(hassan);
        userList.add(majid);
        userList.add(one);
        userList.add(two);
        userList.add(three);
        userList.add(four);
        userList.add(five);
        userList.add(six);
        userList.add(eight);
        userList.add(nine);
        userList.add(o);
        userList.add(u);
        userList.add(i);

        recyclerView = findViewById(R.id.recycler);
        adp = new RecyclerAdp(this, userList);
        recyclerView.setAdapter(adp);

    }
}