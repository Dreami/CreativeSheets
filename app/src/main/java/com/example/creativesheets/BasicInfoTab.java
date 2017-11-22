package com.example.creativesheets;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.view.ViewGroup;

/**
 * Created by maple on 11/17/2017.
 */

public class BasicInfoTab extends Fragment {
    private TextView addAttribute;
    private RelativeLayout rlayout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.basicinfotab, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        addAttribute = (TextView) view.findViewById(R.id.addAttribute);
        rlayout = (RelativeLayout) view.findViewById(R.id.rlayout);
        addAttribute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editTextField = new EditText(getContext());
                EditText editTextInput = new EditText(getContext());

                final ViewGroup.LayoutParams lparams = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                editTextField.setLayoutParams(lparams);
                editTextInput.setLayoutParams(lparams);

                rlayout.addView(editTextField);
                rlayout.addView(editTextInput);
            }
        });
    }
}
