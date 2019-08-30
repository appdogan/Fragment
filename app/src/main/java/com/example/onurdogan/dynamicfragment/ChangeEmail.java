package com.example.onurdogan.dynamicfragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class ChangeEmail extends Fragment {

   private Button buttonGo;

   public MainActivity mainActivity;


    public ChangeEmail() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v =inflater.inflate(R.layout.fragment_change_email, container, false);


        mainActivity = (MainActivity) getActivity();

        buttonGo = (Button) v.findViewById(R.id.button);

        buttonGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ChangePassword changePassword = new ChangePassword();

    mainActivity.fragmentManager = getFragmentManager();
    mainActivity.fragmentTransaction = mainActivity.fragmentManager.beginTransaction();

    mainActivity.fragmentTransaction.replace(R.id.lineer_main_layout,changePassword);

    mainActivity.fragmentTransaction.commit();




            }
        });


        return v;
    }

}
