package com.example.tourguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class HurghadaFragment extends Fragment {

    public HurghadaFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_view, container, false);

        ArrayList<Item> arrayList = new ArrayList<>();
        arrayList.add(new Item(getResources().getString(R.string.hurghada_place_1), getResources().getString(R.string.hurghada_detail_1)));
        arrayList.add(new Item(getResources().getString(R.string.hurghada_place_2), getResources().getString(R.string.hurghada_detail_2)));

        ItemAdapter itemAdapter = new ItemAdapter(getActivity(), arrayList);

        ListView listView = rootView.findViewById(R.id.listView);

        listView.setAdapter(itemAdapter);

        return rootView;
    }


}

