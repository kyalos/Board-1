package com.example.user.board;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;

public class PostFragment extends Fragment {
    View view;

    public PostFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,@Nullable ViewGroup container,@Nullable Bundle savedInstanceState){
        view = inflater.inflate(R.layout.activity_post_fragment,container,false);
        return view;
    }
}