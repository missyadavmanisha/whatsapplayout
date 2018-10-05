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

public class FragmentC extends Fragment {
    ArrayList<Imageclass> arrayList=new ArrayList<>();
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        arrayList.add(new Imageclass("https://dyn.web.whatsapp.com/pp?e=https%3A%2F%2Fpps.whatsapp.net%2Fv%2Ft61.11540-24%2F35774780_1893848784248790_3069712125447372800_n.jpg%3Foe%3D5BA9CE58%26oh%3D0b666e886662fde5a9c22c2ccff74e83&t=l&u=918010707016%40c.us&i=1531052672","Lavisha","yes"));
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