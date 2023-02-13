package com.example.demo_1;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rcvUser;
    private UserAdapter mUserAdapter;
    @Override
    protected void onCreate (Bundle saveInstanceState){
        super.onCreate (saveInstanceState);
        setContentView(R.layout.activity_main);
        rcvUser = findViewById(R.id.rcv_user);
        mUserAdapter = new UserAdapter(this );

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,3);
        rcvUser.setLayoutManager(gridLayoutManager);

        mUserAdapter.setData(getLisUser());
        rcvUser.setAdapter(mUserAdapter);
    }

    private List<User> getLisUser(){
        List<User> list = new ArrayList<>();
        list.add(new User(R.drawable.img_1,"Store"));
        list.add(new User(R.drawable.img_2,"Pharmacy"));
        list.add(new User(R.drawable.img_3,"Note"));
        list.add(new User(R.drawable.img_4,"Clothing"));
        list.add(new User(R.drawable.img_5,"Shoe"));
        list.add(new User(R.drawable.img_6,"Home"));
        list.add(new User(R.drawable.img_7,"Baby"));
        list.add(new User(R.drawable.img_8,"Grow"));

        list.add(new User(R.drawable.img_1,"Store"));
        list.add(new User(R.drawable.img_2,"Pharmacy"));
        list.add(new User(R.drawable.img_3,"Note"));
        list.add(new User(R.drawable.img_4,"Clothing"));
        list.add(new User(R.drawable.img_5,"Shoe"));
        list.add(new User(R.drawable.img_6,"Home"));
        list.add(new User(R.drawable.img_7,"Baby"));
        list.add(new User(R.drawable.img_8,"Grow"));

        return list;
    }
}
