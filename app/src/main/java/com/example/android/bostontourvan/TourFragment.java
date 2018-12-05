package com.example.android.bostontourvan;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class TourFragment extends Fragment {

    public TourFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final ArrayList<Item> items = new ArrayList<>();
        final View rootView = inflater.inflate(R.layout.list, container, false);

        //Info from TripAdvisor.com
        items.add(new Item(getString(R.string.model), getString(R.string.model_address), getString(R.string.model_phone), getString(R.string.model_website), R.drawable.model, getString(R.string.model_info)));
        items.add(new Item(getString(R.string.auto), getString(R.string.auto_address), getString(R.string.auto_phone), getString(R.string.auto_website), R.drawable.auto, getString(R.string.auto_info)));
        items.add(new Item(getString(R.string.ellum), getString(R.string.ellum_address), getString(R.string.ellum_phone), getString(R.string.ellum_website), R.drawable.ellum, getString(R.string.ellum_info)));

        ItemAdapter adapter = new ItemAdapter(getActivity(), items);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}