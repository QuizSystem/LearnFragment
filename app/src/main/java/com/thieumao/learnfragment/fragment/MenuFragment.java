package com.thieumao.learnfragment.fragment;

//import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.thieumao.learnfragment.R;
import com.thieumao.learnfragment.activity.DetailActivity;

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
                showDetail("You clicked menu 1");
            }
        });
        btnMenu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDetail("You clicked menu 2");
            }
        });
        btnMenu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDetail("You clicked menu 3");
            }
        });
        return fragmentView;
    }

    private void showDetail(String msg) {
        DetailFragment frgDetail = (DetailFragment) getFragmentManager().findFragmentById(R.id.frgDetail);
        String message;
        if (frgDetail == null || !frgDetail.isInLayout()) {
            message = "Could not found the fragment";
            Intent intent = new Intent(getActivity(), DetailActivity.class);
            intent.putExtra("msg", msg);
            startActivity(intent);
        } else {
            message = "FOUND IT!";
            frgDetail.showInformation(msg);
        }
        Log.i("MenuFragment", message);
//        Toast.makeText(getActivity(), message, Toast.LENGTH_SHORT).show();
    }
}
