package com.example.basic_coviddata;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

public class cycleAdapter extends RecyclerView.Adapter<cycleAdapter.ViewHolder> {

    Context context;
    List<String> evento,regiso;

    public cycleAdapter(Context context, List<String> evento, List<String> regiso) {
        this.context = context;
        this.evento = evento;
        this.regiso = regiso;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.card,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.evento.setText(evento.get(position));
        holder.regiso.setText(regiso.get(position));
    }

    @Override
    public int getItemCount() {
        return evento.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView evento,regiso;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            evento=itemView.findViewById(R.id.evento);
            regiso=itemView.findViewById(R.id.regiso);

        }
    }
}
