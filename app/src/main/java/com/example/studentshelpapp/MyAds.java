package com.example.studentshelpapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;


public class MyAds extends AppCompatActivity {
//    private List<String> ItemNameList;
//    private List<String> ItemPriceList;
//    private List<String> ItemImageList;
//    private RecyclerView MyAdsView;
//    private Ad_Item_Adapter ad_item_adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_ads);
        Toolbar toolbar=findViewById(R.id.toolbar);
        toolbar.setTitle(" Your ads");
        setSupportActionBar(toolbar);
//        ItemNameList=new ArrayList<>();
//        ItemPriceList=new ArrayList<>();
//        ItemImageList=new ArrayList<>();
//        MyAdsView=findViewById(R.id.MyAdsView);
//        ad_item_adapter=new Ad_Item_Adapter(ItemPriceList,ItemNameList,ItemImageList);
//        //Recycler View
//        MyAdsView.setLayoutManager(new LinearLayoutManager(this));
//        MyAdsView.setHasFixedSize(true);
//        MyAdsView.setAdapter(ad_item_adapter);
//        ItemNameList.add("Example Item 1");
//        ItemNameList.add("Example Item 2");
//        ItemPriceList.add("Example price 1");
//        ItemPriceList.add("Example price 2");
//
//        ad_item_adapter.notifyDataSetChanged();



    }
}