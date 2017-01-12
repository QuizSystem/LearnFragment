package com.thieumao.learnfragment.fragment;

//import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.thieumao.learnfragment.R;

/**
 * Created by nguyen.van.thieub on 1/12/17.
 */

public class MenuFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.fragment_menu, container, true);
        Button btnMenu1 = (Button) fragmentView.findViewById(R.id.btnMenu1);
        Button btnMenu2 = (Button) fragmentView.findViewById(R.id.btnMenu2);
        Button btnMenu3 = (Button) fragmentView.findViewById(R.id.btnMenu3);
        btnMenu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DetailFragment frgDetail = (DetailFragment) getFragmentManager().findFragmentById(R.id.frgDetail);
                String message;
                if (frgDetail == null || !frgDetail.isInLayout()) {
                    message = "Could not found the fragment";
                } else {
                    message = "FOUND IT!";
                }
                Toast.makeText(getActivity(), message, Toast.LENGTH_SHORT).show();
            }
        });
        btnMenu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Helo, you clicked button 2", Toast.LENGTH_SHORT).show();
            }
        });
        btnMenu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Helo, you clicked button 3", Toast.LENGTH_SHORT).show();
            }
        });
        return fragmentView;
    }
}
