package com.example.android.bostontourvan;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class VenuesFragment extends Fragment {

    public VenuesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final ArrayList<Item> items = new ArrayList<>();
        final View rootView = inflater.inflate(R.layout.list, container, false);

        //Info from TripAdvisor.com
        items.add(new Item(getString(R.string.greatscott), getString(R.string.greatscott_address), getString(R.string.greatscott_phone), getString(R.string.greatscott_website), R.drawable.greatscott, getString(R.string.greatscott_info)));
        items.add(new Item(getString(R.string.sinclair), getString(R.string.sinclair_address), getString(R.string.sinclair_phone), getString(R.string.sinclair_website), R.drawable.sinclair, getString(R.string.sinclair_info)));
        items.add(new Item(getString(R.string.paradise), getString(R.string.paradise_address), getString(R.string.paradise_phone), getString(R.string.paradise_website), R.drawable.paradise, getString(R.string.paradise_info)));

        ItemAdapter adapter = new ItemAdapter(getActivity(), items);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}