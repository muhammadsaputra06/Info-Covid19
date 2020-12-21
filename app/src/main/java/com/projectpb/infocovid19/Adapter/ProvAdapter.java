package com.projectpb.infocovid19.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.projectpb.infocovid19.R;
import com.projectpb.infocovid19.Model.Provinsi;

import java.util.List;

public class ProvAdapter extends RecyclerView.Adapter {

    List<Provinsi> webLists;
    public Context context;

    public ProvAdapter(List<Provinsi> webLists, Context context) {
        this.webLists = webLists;
        this.context = context;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder  {
        public TextView namaprov;
        public TextView positif;
        public TextView sembuh;
        public TextView meninggal;

        public ViewHolder(View itemView) {
            super(itemView);
            namaprov = (TextView) itemView.findViewById(R.id.txtprov);
            positif = (TextView) itemView.findViewById(R.id.txtPositif);
            sembuh = (TextView) itemView.findViewById(R.id.txtsembuh32);
            meninggal = (TextView) itemView.findViewById(R.id.txtmeninggal2);
        }
    }

    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.listprov, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerView.ViewHolder holder, final int position) {

        if (holder instanceof ViewHolder) {
            final Provinsi webList = webLists.get(position);

            ((ViewHolder)holder).namaprov.setText(webList.getProvinsi());
            ((ViewHolder)holder).sembuh.setText(webList.getKasus_Semb());
            ((ViewHolder)holder).meninggal.setText(webList.getKasus_Meni());
            ((ViewHolder)holder).positif.setText(webList.getKasus_Posi());
        }
    }

    @Override
    public int getItemCount() {
        return webLists.size();
    }
}