package com.example.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ItemAdapter extends ArrayAdapter<Item> {

    public ItemAdapter(Context context, ArrayList<Item> arrayAdapter) {
        super(context, 0, arrayAdapter);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listView = convertView;
        if (listView == null) {
            listView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item_list, parent, false);
        }

        Item item = getItem(position);

        TextView textView_name = listView.findViewById(R.id.place_name);
        textView_name.setText(item.getPlaceName());

        TextView textView_detail = listView.findViewById(R.id.place_details);
        textView_detail.setText(item.getPlacedetails());

        ImageView imageView = listView.findViewById(R.id.place_img);
        if (item.hasImage()) {
            imageView.setVisibility(View.VISIBLE);
            imageView.setImageResource(item.getPlaceImageId());
        } else {
            imageView.setVisibility(View.GONE);

        }

        return listView;
    }
}
