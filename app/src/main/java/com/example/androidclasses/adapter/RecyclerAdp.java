package com.example.androidclasses.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidclasses.R;
import com.example.androidclasses.model.User;

import java.util.List;

public class RecyclerAdp extends RecyclerView.Adapter<RecyclerAdp.Holder>{

    private Context context;
    private List<User> list;

    public RecyclerAdp(Context context, List<User> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycler_design,parent,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {

        User user = list.get(position);

        holder.userName.setText(user.getName());
        holder.userMsg.setText(user.getMsg());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class Holder extends RecyclerView.ViewHolder
    {
        TextView userName, userMsg;

        public Holder(@NonNull View itemView) {
            super(itemView);

            userName = itemView.findViewById(R.id.userName);
            userMsg = itemView.findViewById(R.id.userMsg);
        }
    }
}
