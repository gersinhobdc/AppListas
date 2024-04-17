package br.com.myskout.bottomnavigationbar;

import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MyActivity extends MainActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.idRecyclerInsta);

        // Melhora a performance se o tamanho do layout for fixo
        mRecyclerView.setHasFixedSize(true);

        // Usa um layout manager linear
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // Especifica o adaptador
        String[] myDataset = {"Data 1", "Data 2", "Data 3"};
        mAdapter = new AdapterInsta(myDataset);
        mRecyclerView.setAdapter(mAdapter);
    }
}
