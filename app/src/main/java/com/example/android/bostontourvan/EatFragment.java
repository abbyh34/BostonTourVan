package com.example.android.bostontourvan;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class EatFragment extends Fragment {

    public EatFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final ArrayList<Item> items = new ArrayList<>();
        final View rootView = inflater.inflate(R.layout.list, container, false);

        //Info from TripAdvisor.com
        items.add(new Item(getString(R.string.taco), getString(R.string.taco_address), getString(R.string.taco_phone), getString(R.string.taco_website), R.drawable.taco, getString(R.string.taco_info)));
        items.add(new Item(getString(R.string.lifealive), getString(R.string.lifealive_address), getString(R.string.lifealive_phone), getString(R.string.lifealive_website), R.drawable.lifealive, getString(R.string.lifealive_info)));
        items.add(new Item(getString(R.string.wholeheart), getString(R.string.wholeheart_address), getString(R.string.wholeheart_phone), getString(R.string.wholeheart_website), R.drawable.wholeheart, getString(R.string.wholeheart_info)));

        ItemAdapter adapter = new ItemAdapter(getActivity(), items);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}