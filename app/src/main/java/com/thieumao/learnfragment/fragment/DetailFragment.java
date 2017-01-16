package com.thieumao.learnfragment.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.thieumao.learnfragment.R;

/**
 * Created by nguyen.van.thieub on 1/12/17.
 */

public class DetailFragment extends Fragment {

    TextView txtInfo;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.fragment_detail, container, true);
        txtInfo = (TextView) fragmentView.findViewById(R.id.txtInfo);
        txtInfo.setText("You clicked nothing");
        return fragmentView;
    }

    public void showInformation(String info) {
        txtInfo.setText(info);
    }
}
