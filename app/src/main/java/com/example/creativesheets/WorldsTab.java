package com.example.creativesheets;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class WorldsTab extends Fragment {
    private TextView createWorlds;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.worldstab, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        createWorlds = (TextView) view.findViewById(R.id.createWorld);
        float currentTextSize = createWorlds.getTextSize();
        while (createWorlds.getLineCount() > 1) {
            createWorlds.setTextSize(currentTextSize - 1f);
        }
    }
}
