package com.example.nishant.bootcamplocator.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nishant.bootcamplocator.R;
import com.example.nishant.bootcamplocator.holder.LocationsViewHolder;
import com.example.nishant.bootcamplocator.model.Devslopes;

import java.util.ArrayList;

/**
 * Created by nishant on 5/23/17.
 */

public class LocationAdapters extends RecyclerView.Adapter<LocationsViewHolder> {


    private ArrayList<Devslopes> locations;

    public LocationAdapters(ArrayList<Devslopes> locations) {
        this.locations  = locations;
    }

    @Override
    public void onBindViewHolder(LocationsViewHolder holder, int position) {

        final Devslopes location = locations.get(position);
        holder.updateUI(location);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //load details page
            }
        });
    }


    @Override
    public int getItemCount() {
        return locations.size();
    }


    @Override
    public LocationsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View card = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_location, parent, false);
        return new LocationsViewHolder(card);
    }
}
