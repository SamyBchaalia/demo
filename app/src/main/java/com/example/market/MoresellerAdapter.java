package com.example.market;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;
//jdida
public class MoresellerAdapter extends RecyclerView.Adapter<MoresellerAdapter.MyViewHolder>{
    List<MoresellersList> moresellersList=new ArrayList<>();
    Context context;

    public MoresellerAdapter(List<MoresellersList>msellersList, Context Co) {
        moresellersList = msellersList;
        context = Co;
    }

    @NonNull
    @Override
    public MoresellerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater =LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.moresellers,parent,false);
        return new MoresellerAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MoresellerAdapter.MyViewHolder holder, int position) {
        MoresellersList MoresellerList=moresellersList.get(position);
        holder.moreSellname.setText(MoresellerList.getMoreSellname());
        holder.moreSelllocation.setText(MoresellerList.getMoreSelllocation());
        holder.moreSellerDesc.setText(MoresellerList.getMoreSellerDesc());
        // holder.myImage.setImageResource(StoreItem.getStoreImage());

        Picasso.get().load(moresellersList.get(position).getMoreSellerImg()).into(holder.moreSellerImg);

    }

    @Override
    public int getItemCount() {
        return moresellersList.size();
    }
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView moreSellname,moreSelllocation,moreSellerDesc;
        ImageView moreSellerImg;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            moreSellname=itemView.findViewById(R.id.moresellername);
            moreSelllocation=itemView.findViewById(R.id.mslocation);
            moreSellerDesc=itemView.findViewById(R.id.msdescription);
            moreSellerImg=itemView.findViewById(R.id.sellerImg);
        }
    }
}
