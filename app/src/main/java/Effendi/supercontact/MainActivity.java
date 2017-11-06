package Effendi.supercontact;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    KontakAdapter adapter;
    List<KontakModel> kontakModels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView)findViewById(R.id.rv);
        adapter = new KontakAdapter(this, kontakModels);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        isiData();
    }
    private void isiData(){
        KontakModel model = new KontakModel("Ozi Syahputra", "roziqincapcus@gmail.com", "085875865758");
        kontakModels.add(model);

        model = new KontakModel("Thomas", "thomas@gmail.com", "0852145288");
        kontakModels.add(model);

        model = new KontakModel("Irvan", "irvan@gmail.com", "087897765123");
        kontakModels.add(model);

        adapter.notifyDataSetChanged();
    }
}
