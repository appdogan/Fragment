package com.example.onurdogan.dynamicfragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class ChangePassword extends Fragment {

    Button btnGo;

    public MainActivity mainActivity;


    public ChangePassword() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this



        View v = inflater.inflate(R.layout.fragment_change_password, container, false);

        btnGo = v.findViewById(R.id.button2);

        mainActivity = (MainActivity) getActivity();

        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ChangeEmail changeEmail = new ChangeEmail();

                mainActivity.fragmentManager = getFragmentManager();
                mainActivity.fragmentTransaction = mainActivity.fragmentManager.beginTransaction();
                mainActivity.fragmentTransaction.replace(R.id.lineer_main_layout,changeEmail);
                mainActivity.fragmentTransaction.commit();


            }
        });

        return v;
    }

}
