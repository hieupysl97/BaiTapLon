package com.example.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Item> listData = new ArrayList<>();
    ListView danhsachdiadiem ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView recyclerView = findViewById(R.id.listView);
        loadData();
        AdapterItem adapterItem = new AdapterItem(listData,this);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapterItem);
    }
    private void loadData() {
        Item a = new Item(R.drawable.cmt8_tram_1  ,"Đường Cách Mạng Tháng 8","Đường Cách mạng tháng 8 - TP.Thái Nguyên",21.564502,105.854722 );
        Item b = new Item(R.drawable.cmt8_tram_2,"Đường Cách mạng tháng 8"," Đường Cách mạng tháng 8 - TP.Thái Nguyên",21.594065,105.840854);
        Item c = new Item(R.drawable.dt265,"Đường 265 ","Đường 265  - Thái Nguyên",21.639963,105.845426);
        Item e = new Item(R.drawable.duong_hoang_van_thu1,"Đường Hoàng Văn Thụ","Đường Hoàng Văn Thụ - TP.Thái Nguyên",21.588382,105.828246);
        Item f = new Item(R.drawable.duong_hoang_van_thu2,"Đường Hoàng Văn Thụ","Đường Hoàng Văn Thụ - TP.Thái Nguyên",21.589036,105.829466);
        Item g = new Item(R.drawable.duong_hoang_van_thu3,"Đường Hoàng Văn Thụ","Đường Hoàng Văn Thụ - TP.Thái Nguyên",21.591952,105.833026);
        Item h = new Item(R.drawable.duong_hoang_van_thu4,"Đường Hoàng Văn Thụ","Đường Hoàng Văn Thụ - TP.Thái Nguyên",21.592691,105.834243);
        Item i = new Item(R.drawable.duong_phan_dinh_phung,"Đường Phan Đình Phùng","Đường Phan Đình Phùng - TP.Thái Nguyên",21.587031,105.841328);
        Item j = new Item(R.drawable.dz115,"Đường Z115","Đường Z115 - Thái Nguyên",21.586965,105.799544);
        Item k = new Item(R.drawable.dz115_tram_2,"Đường Z115","Đường Z115 - TP.Thái Nguyên",21.583868,105.807175);
        Item l = new Item(R.drawable.dz115_tram_3,"Đường Z115","Đường Z115 - TP.Thái Nguyên",21.587241,105.794814);
        Item m = new Item(R.drawable.luong_ngoc_quyen1,"Đường Lương Ngọc Quyến","Đường Lương Ngọc Quyến - TP.Thái Nguyên",21.586079,105.832418);
        Item n = new Item(R.drawable.luong_ngoc_quyen2,"Đường Lương Ngọc Quyến","Đường Lương Ngọc Quyến - TP.Thái Nguyên",21.590995,105.826113);
        Item o = new Item(R.drawable.luong_ngoc_quyen3,"Đường Lương Ngọc Quyến","Đường Lương Ngọc Quyến - TP.Thái Nguyên",21.592423,105.825810);
        Item p = new Item(R.drawable.luong_ngoc_quyen4,"Đường Lương Ngọc Quyến","Đường Lương Ngọc Quyến - TP.Thái Nguyên",21.596240,105.824515);
        Item q = new Item(R.drawable.luong_ngoc_quyen5,"Đường Lương Ngọc Quyến","Đường Lương Ngọc Quyến - Tp.Thái Nguyên",21.597162,105.824409);
        Item r = new Item(R.drawable.luong_ngoc_quyen6,"Đường Lương Ngọc Quyến","Đường Lương Ngọc Quyến - TP.Thái Nguyên",21.599120,105.824112);
        Item s = new Item(R.drawable.luu_nhan_chu1,"Đường Lưu Nhân Chú","Đường Lưu Nhân Chú - TP.Thái Nguyên",21.540055,105.876646);
        Item t = new Item(R.drawable.luu_nhan_chu2,"Đường Lưu Nhân Chú","Đường Lưu Nhân Chú - TP.Thái Nguyên",21.537338,105.870031);
        Item u = new Item(R.drawable.ql37,"Quốc lộ 37","Quốc lộ 37 - Thái Nguyên",21.596593,105.837959);
        Item v = new Item(R.drawable.quang_trung,"Đường Quang Trung","Đường Quang Trung - Thái Nguyên",21.568548,105.810237);
        Item w = new Item(R.drawable.quang_trung2,"Đường Quang Trung","Đường Quang Trung - Thái Nguyên",21.573680,105.812454);
        Item x = new Item(R.drawable.thinh_duc,"Đường Thịnh Đức","Đường Thịnh Đức - TP.Thái Nguyên",21.532817,105.804176);
        Item y = new Item(R.drawable.thinh_duc2,"Đường Thịnh Đức","Đường Thịnh Đức - TP.Thái Nguyên",21.542319,105.798611);
        Item z = new Item(R.drawable.to_huu,"Đường Quang Trung","Đường Tố Hữu - TP.Thái Nguyên",21.581027,105.792334);

        listData.add(a);
        listData.add(b);
        listData.add(c);
        listData.add(e);
        listData.add(f);
        listData.add(g);
        listData.add(h);
        listData.add(i);
        listData.add(j);
        listData.add(k);
        listData.add(l);
        listData.add(m);
        listData.add(n);
        listData.add(o);
        listData.add(p);
        listData.add(q);
        listData.add(r);
        listData.add(s);
        listData.add(t);
        listData.add(u);
        listData.add(v);
        listData.add(w);
        listData.add(x);
        listData.add(y);
        listData.add(z);
    }




}
