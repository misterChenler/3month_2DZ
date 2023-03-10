package com.example.hw2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class FirstFragment extends Fragment {
    private TextView textView;
    private Button plus;
    private Button minus;
    private int klik;
    private Button button_klik;
    private Button buttonPanel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textView=requireActivity().findViewById(R.id.zero);
        plus=requireActivity().findViewById(R.id.button_plus);
        minus=requireActivity().findViewById(R.id.button_minus);
        button_klik=requireActivity().findViewById(R.id.button_plus);
        buttonPanel=requireActivity().findViewById(R.id.button_panel);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(toString().valueOf(klik));
                klik++;
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(toString().valueOf(klik));
                klik--;

            }
        });
        button_klik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(toString().valueOf(klik));
                klik++;
            }
        });
        buttonPanel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle=new Bundle();
                bundle.putString("com",textView.getText().toString());
                SeckondFragment fragment=new SeckondFragment();
                fragment.setArguments(bundle);
                    requireActivity().getSupportFragmentManager().beginTransaction().addToBackStack(null).replace(R.id.container,fragment).commit();
            }
        });

    }
}