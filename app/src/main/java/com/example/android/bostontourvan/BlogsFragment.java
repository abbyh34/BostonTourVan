package com.example.android.bostontourvan;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class BlogsFragment extends Fragment {

    public BlogsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final ArrayList<Item> items = new ArrayList<>();
        final View rootView = inflater.inflate(R.layout.list, container, false);

        //Info from TripAdvisor.com
        items.add(new Item(getString(R.string.vanyaland), getString(R.string.vanyaland_address), getString(R.string.vanyaland_phone), getString(R.string.vanyaland_website), R.drawable.vanyaland, getString(R.string.vanyaland_info)));
        items.add(new Item(getString(R.string.hassle), getString(R.string.hassle_address), getString(R.string.hassle_phone), getString(R.string.hassle_website), R.drawable.hassle, getString(R.string.hassle_info)));
        items.add(new Item(getString(R.string.pudding), getString(R.string.pudding_address), getString(R.string.pudding_phone), getString(R.string.pudding_website), R.drawable.pudding, getString(R.string.pudding_info)));

        ItemAdapter adapter = new ItemAdapter(getActivity(), items);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}