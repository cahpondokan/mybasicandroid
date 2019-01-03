package com.cahpondokan.mybasicandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListView lvHewan = findViewById(R.id.lv_hewan);
        String[] namaHewan = getResources().getStringArray(R.array.nama_hewan);
        int[] gambarHewan= {
                R.drawable.ayam,
                R.drawable.anjing,
                R.drawable.babi,
                R.drawable.bebek,
                R.drawable.burung_hantu,
                R.drawable.elang,
                R.drawable.cat,
                R.drawable.harimau,
                R.drawable.gajah,
                R.drawable.katak,
                R.drawable.kucing,
                R.drawable.domba
        };

        //instance : object cloningan dari data yang di panggil
//        HewanAdapter hewanAdapter = new HewanAdapter(namaHewan,gambarHewan,this);
    }

    private class HewanAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            //mementukan jumlah data yang mau di tampilkan
            return 0;
        }

        @Override
        public Object getItem(int position) {
            //mengambil item / data yang ada di dalam adapter
            return null;
        }

        @Override
        public long getItemId(int position) {
            //untuk mengambil id yang ada di dalam adapter
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // di gunakan untuk memasang data kedalam layoutnya
            return null;
        }
    }
}
//arary : tempat untuk menyimpan satu data atau lebih atau tipe data sejenis