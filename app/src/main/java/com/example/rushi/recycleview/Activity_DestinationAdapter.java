package com.example.rushi.recycleview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

/**
 * Created by rushi on 12/16/2017.
 */

public class Activity_DestinationAdapter extends RecyclerView.Adapter<Activity_DestinationAdapter.MyViewHolder> {

    private Context mContext;
    private List<Destination_Activity> imageList;
    private RatingBar ratingBar;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name, rupee;
        public ImageView activity_image;

        public MyViewHolder(View view) {
            super(view);
            name = (TextView)view.findViewById(R.id.activity_name);
            rupee=view.findViewById(R.id.activity_rupee);
//            count = (TextView) view.findViewById(R.id.count);
            activity_image = (ImageView) view.findViewById(R.id.activityimage);
//            overflow = (ImageView) view.findViewById(R.id.overflow);
            ratingBar=view.findViewById(R.id.ratingbar);
        }
    }

    public Activity_DestinationAdapter(Context mContext,List<Destination_Activity> activityList){
        this.mContext=mContext;
        this.imageList=activityList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_destination, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        Destination_Activity destination_activity = imageList.get(position);
        holder.name.setText(destination_activity.getName());
        // holder.count.setText(album.getNumOfSongs() + " songs");
        holder.activity_image.setImageResource(destination_activity.getImage_id());

        holder.rupee.setText(destination_activity.getRupee()+"");
        // loading album cover using Glide library
        //  Glide.with(mContext).load(album.getThumbnail()).into(holder.thumbnail);

//        holder.overflow.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//               // showPopupMenu(holder.overflow);
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return imageList.size();
    }
}
