package com.example.nav;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;


/**
 * A simple {@link Fragment} subclass.
 */
public class ACCOUNT extends Fragment {

    Button button,button2;


    public ACCOUNT() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View view= inflater.inflate(R.layout.account, container, false);
        button= view.findViewById(R.id.btn);
        button2= view.findViewById(R.id.btn2);


        //ACTIVITY INTENT
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(getActivity(),TWO.class);
                startActivity(intent);

            }
        });

        //FRAGMENT TO FRAGMENT
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LOAN loan=new LOAN();
                FragmentTransaction transaction=getFragmentManager().beginTransaction();
                transaction.replace(R.id.container,loan);
                transaction.commit();

            }
        });
        return view;
    }

}
