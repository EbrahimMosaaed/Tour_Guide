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

public class CairoFragment extends Fragment {

    public CairoFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_view, container, false);

        ArrayList<Item> arrayList = new ArrayList<>();
        arrayList.add(new Item(getResources().getString(R.string.cairo_place_1), getResources().getString(R.string.cairo_detail_1), R.drawable.epyramids));
        arrayList.add(new Item(getResources().getString(R.string.cairo_place_2), getResources().getString(R.string.cairo_detail_2), R.drawable.museum));
        arrayList.add(new Item(getResources().getString(R.string.cairo_place_3), getResources().getString(R.string.cairo_detail_3)));


        ItemAdapter itemAdapter = new ItemAdapter(getActivity(), arrayList);

        ListView listView = rootView.findViewById(R.id.listView);

        listView.setAdapter(itemAdapter);

        return rootView;


    }


}
