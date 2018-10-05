package com.codingblocks.whatsapplayout;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import java.util.ArrayList;




public class WhatsAppAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private ArrayList<Imageclass> arrayList;
    private AppCompatActivity appCompatActivity;
    private Context ctx;

    public WhatsAppAdapter(ArrayList<Imageclass> arrayList, AppCompatActivity appCompatActivity) {
        this.arrayList = arrayList;
        this.appCompatActivity = appCompatActivity;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        ctx = parent.getContext();
        LayoutInflater li = LayoutInflater.from(parent.getContext());
        View inflatedView = li.inflate(R.layout.fragment_a, parent, false);
        return new ImageHolder(inflatedView);
    }



    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {



        final Imageclass currentImage = arrayList.get(position);
        ImageHolder imageHolder = (ImageHolder) holder;
        Picasso.get()
                .load(currentImage.getImage())
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .into(imageHolder.imageView);

        imageHolder.lastmessege.setText(currentImage.getLastmessege());
        imageHolder.name.setText(currentImage.getName());


    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class ImageHolder extends RecyclerView.ViewHolder {
        TextView name, lastmessege;
        ImageView imageView;

        public ImageHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image);
            name= itemView.findViewById(R.id.name);
            lastmessege = itemView.findViewById(R.id.lastmessege);


        }
    }

}


