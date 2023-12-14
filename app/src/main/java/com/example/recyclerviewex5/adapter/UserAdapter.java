package com.example.recyclerviewex5.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewex5.R;
import com.example.recyclerviewex5.model.User;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder>{
    private List<User> itemList;

    public UserAdapter(List<User> itemList) {
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);

        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        User user = itemList.get(position);
        holder.txtId.setText(String.valueOf(user.getUserId()));
        holder.txtUserName.setText(user.getUserName());
    }

    @Override
    public int getItemCount() {
        if(itemList != null) {
            return itemList.size();
        }
        return 0;
    }

    public static class UserViewHolder extends RecyclerView.ViewHolder{
        TextView txtUserName, txtId;
        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            txtUserName = itemView.findViewById(R.id.txtUserName);
            txtId = itemView.findViewById(R.id.txtId);

        }
    }
}
