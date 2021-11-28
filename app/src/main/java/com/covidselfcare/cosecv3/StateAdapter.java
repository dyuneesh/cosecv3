package com.covidselfcare.cosecv3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ConcurrentModificationException;
import java.util.List;

public class StateAdapter extends RecyclerView.Adapter<StateAdapter.StateHolder>{

    private Context context;
    private List<State> stateList;

    public StateAdapter(Context context, List<State> states)
    {
        this.context = context;
        stateList = states;
    }
    @NonNull
    @Override
    public StateHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item, parent , false);
        return new StateHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StateHolder holder, int position) {
        State state =  stateList.get(position);
        holder.state_name.setText(state.getState_name());
        holder.ac.setText(state.getAc());
        holder.ti.setText(state.getTi());
        holder.rec.setText(state.getRec());
        holder.nd.setText(state.getNd());

    }

    @Override
    public int getItemCount() {
        return stateList.size() ;
    }

    public class StateHolder extends RecyclerView.ViewHolder{
        TextView state_name,ac,ti,rec,nd;
        public StateHolder(@NonNull View itemView) {
            super(itemView);

            state_name = itemView.findViewById(R.id.state);
            ac = itemView.findViewById(R.id.AC);
            ti = itemView.findViewById(R.id.TI);
            rec = itemView.findViewById(R.id.REC);
            nd = itemView.findViewById(R.id.ND);
        }
    }
}
