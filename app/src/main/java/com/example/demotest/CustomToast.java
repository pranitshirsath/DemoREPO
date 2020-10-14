package com.example.demotest;

import android.content.Context;
import android.widget.Toast;

public class CustomToast {

    public static void print(Context c, String SS){

        Toast.makeText(c, SS, Toast.LENGTH_SHORT).show();
    }
}
