package com.bacacoding.listview;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView lvItem;
    private String[] buah = new String[]{
            "Apel", "Anggur", "Jeruk", "Manggis", "Mangga", "Nanas", "Semangka", "Melon", "Alpukat",
            "Markisah", "Stroberi", "Duren", "Nangka", "Jambu", "Sirsak", "Kelapa","Pisang", "Buah Naga",
            "Kelengkeng", "Kurma", "Pepaya", "Leci"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Buah-Buahan Terlaris 2017");
        getSupportActionBar().setSubtitle("List Buah Tersedia:");
        lvItem = (ListView) findViewById(R.id.listview);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, android.R.id.text1,buah);
        lvItem.setAdapter(adapter);
        lvItem.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView parent, View view, int position, long id){
                Toast.makeText(MainActivity.this, "Buah Pilihan Kamu Adalah : " + buah[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}



