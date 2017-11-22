package com.example.creativesheets;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by maple on 11/18/2017.
 */

public class PortraitTab extends Fragment {

    private ImageButton imgBtn;
    private ImageView imgV;
    public static final int GET_FROM_GALLERY = 3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.portraittab, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        imgV = (ImageView) view.findViewById(R.id.imageView);
        imgBtn = (ImageButton) view.findViewById(R.id.imageButton);
    }
}
