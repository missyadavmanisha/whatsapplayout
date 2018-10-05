package com.codingblocks.whatsapplayout;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class FragmentA extends Fragment {
    ArrayList<Imageclass> arrayList=new ArrayList<>();
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        arrayList.add(new Imageclass("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT6ZbFrkvXXxTaqA_9ecgSbgWKdaq8htjrEjQmIiSAVMiYJaY57", "Lavisha", "yes"));


        arrayList.add(new Imageclass("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT6ZbFrkvXXxTaqA_9ecgSbgWKdaq8htjrEjQmIiSAVMiYJaY57","Lavisha","yes"));
        arrayList.add(new Imageclass("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT6ZbFrkvXXxTaqA_9ecgSbgWKdaq8htjrEjQmIiSAVMiYJaY57","Lavisha","yes"));
        arrayList.add(new Imageclass("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT6ZbFrkvXXxTaqA_9ecgSbgWKdaq8htjrEjQmIiSAVMiYJaY57","Lavisha","yes"));
        arrayList.add(new Imageclass("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT6ZbFrkvXXxTaqA_9ecgSbgWKdaq8htjrEjQmIiSAVMiYJaY57","Lavisha","yes"));
        arrayList.add(new Imageclass("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT6ZbFrkvXXxTaqA_9ecgSbgWKdaq8htjrEjQmIiSAVMiYJaY57","Lavisha","yes"));
        arrayList.add(new Imageclass("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT6ZbFrkvXXxTaqA_9ecgSbgWKdaq8htjrEjQmIiSAVMiYJaY57","Lavisha","yes"));
        arrayList.add(new Imageclass("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT6ZbFrkvXXxTaqA_9ecgSbgWKdaq8htjrEjQmIiSAVMiYJaY57","Lavisha","yes"));
        arrayList.add(new Imageclass("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT6ZbFrkvXXxTaqA_9ecgSbgWKdaq8htjrEjQmIiSAVMiYJaY57","Lavisha","yes"));
        arrayList.add(new Imageclass("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT6ZbFrkvXXxTaqA_9ecgSbgWKdaq8htjrEjQmIiSAVMiYJaY57","Lavisha","yes"));

    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.layout_row, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView=view.findViewById(R.id.recyclerrview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        WhatsAppAdapter whatsAppAdapter=new WhatsAppAdapter(arrayList, (AppCompatActivity)getActivity());
        recyclerView.setAdapter(whatsAppAdapter);

    }
}