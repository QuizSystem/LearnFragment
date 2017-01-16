package com.thieumao.learnfragment.activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.thieumao.learnfragment.R;
import com.thieumao.learnfragment.fragment.DetailFragment;

/**
 * Created by thieumao on 1/16/17.
 */

public class DetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        String msg = getIntent().getStringExtra("msg");
        if (msg == null) {
            finish();
        }
        // TODO: do something
        DetailFragment frgDetail = (DetailFragment) getSupportFragmentManager().findFragmentById(R.id.frgDetail);
        frgDetail.showInformation(msg);
    }
}
