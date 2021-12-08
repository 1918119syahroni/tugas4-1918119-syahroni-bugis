package com.example.tugas4_1918119;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class List extends
        RecyclerView.Adapter<List.ContentViewHolder> {
    private ArrayList<Repo> dataList;

    public List(ArrayList<Repo> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public ContentViewHolder
    onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater =
                LayoutInflater.from(parent.getContext());
        View view =
                layoutInflater.inflate(R.layout.list_item, parent, false);
        return new ContentViewHolder(view);
    }

    public void onBindViewHolder(ContentViewHolder holder, int
            position) {
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtJenis.setText(dataList.get(position).getJenis());
        holder.txtKeterangan.setText(dataList.get(position).getKeterangan());
        holder.images_profile.setImageResource(dataList.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class ContentViewHolder extends
            RecyclerView.ViewHolder {
        private TextView txtNama, txtJenis, txtKeterangan;
        private ImageView images_profile;

        public ContentViewHolder(View itemView) {
            super(itemView);
            txtNama = (TextView)
                    itemView.findViewById(R.id.txt_nama);
            txtJenis = (TextView)
                    itemView.findViewById(R.id.txt_jenis);
            txtKeterangan = (TextView)
                    itemView.findViewById(R.id.txt_keterangan);
            images_profile=(ImageView)
                    itemView.findViewById(R.id.image);
        }
    }
}
