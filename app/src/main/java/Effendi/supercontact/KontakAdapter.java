package Effendi.supercontact;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Dimas on 11/6/2017.
 */

public class KontakAdapter extends RecyclerView.Adapter<KontakAdapter.Holders>{

    private Context C;
    private List<KontakModel>kontakModels;

    public KontakAdapter(Context c, List<KontakModel> kontakModels) {
        C = c;
        this.kontakModels = kontakModels;
    }

    @Override
    public Holders onCreateViewHolder(ViewGroup parent, int viewType) {

        View V = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout,parent,false);

        return new Holders(V);
    }

    @Override
    public void onBindViewHolder(Holders holder, int position) {

        final KontakModel model = kontakModels.get(position);
        holder.Text.setText(model.getNama());
        holder.Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent (C,Detail.class);
                I.putExtra("Nama.kontak", model.getNama());
                I.putExtra("Email.kontak", model.getEmail());
                I.putExtra("Nomor.kontak", model.getNomor());

                C.startActivity(I);

            }
        });
    }

    @Override
    public int getItemCount() {
        return kontakModels.size();
    }

    public class Holders extends RecyclerView.ViewHolder {

        TextView Text;
        LinearLayout Layout;
        public Holders(View itemView) {
            super(itemView);
            Text = (TextView)itemView.findViewById(R.id.text);
            Layout = (LinearLayout) itemView.findViewById(R.id.layout);
        }
    }
}