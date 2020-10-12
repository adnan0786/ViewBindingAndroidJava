package com.example.viewbinding;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.viewbinding.databinding.FragmentBlankBinding;


public class BlankFragment extends Fragment {

    private FragmentBlankBinding blankBinding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        blankBinding = FragmentBlankBinding.inflate(inflater, container, false);

        blankBinding.btnFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Fragment button is clicked", Toast.LENGTH_SHORT).show();
            }
        });
        return blankBinding.getRoot();
    }
}