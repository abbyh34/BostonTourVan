package com.example.android.bostontourvan;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class FestivalsFragment extends Fragment {

    public FestivalsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final ArrayList<Item> items = new ArrayList<>();
        final View rootView = inflater.inflate(R.layout.list, container, false);

        //Info from TripAdvisor.com
        items.add(new Item(getString(R.string.hasslefest), getString(R.string.hasslefest_address), getString(R.string.hasslefest_phone), getString(R.string.hasslefest_website), R.drawable.hasslefest, getString(R.string.hasslefest_info)));
        items.add(new Item(getString(R.string.bostoncalling), getString(R.string.bostoncalling_address), getString(R.string.bostoncalling_phone), getString(R.string.bostoncalling_website), R.drawable.bostoncalling, getString(R.string.bostoncalling_info)));
        items.add(new Item(getString(R.string.roxbury), getString(R.string.roxbury_address), getString(R.string.roxbury_phone), getString(R.string.roxbury_website), R.drawable.roxbury, getString(R.string.roxbury_info)));

        ItemAdapter adapter = new ItemAdapter(getActivity(), items);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;

    }

}