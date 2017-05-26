package com.example.nishant.bootcamplocator.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nishant.bootcamplocator.R;
import com.example.nishant.bootcamplocator.model.Devslopes;

/**
 * Created by nishant on 5/23/17.
 */

public class LocationsViewHolder extends RecyclerView.ViewHolder{

    private ImageView locationImage;
    private TextView locationTitile;
    private TextView locationAddress;

    public LocationsViewHolder(View itemView) {
        super(itemView);


        locationImage = (ImageView)itemView.findViewById(R.id.location_image);
        locationTitile = (TextView)itemView.findViewById(R.id.location_title);
        locationAddress = (TextView)itemView.findViewById(R.id.location_title);

    }


    public void updateUI(Devslopes location)
    {
        String uri = location.getImageUrl();
        int resource = locationImage.getResources().getIdentifier(uri,null,locationImage.getContext().getPackageName());
        locationImage.setImageResource(resource);
        locationTitile.setText(location.getLocationTitle());
        locationAddress.setText(location.getLocationAddress());
    }
}
