package com.example.botui;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.CustomViewHolder>
{
    class CustomViewHolder extends RecyclerView.ViewHolder
    {
        TextView txtMsg;
        public CustomViewHolder(@NonNull View itemView)
        {
            super(itemView);
            txtMsg = itemView.findViewById(R.id.textMessage);
        }
    }

    List<ResponseMessage> responseMessageList;

    public MessageAdapter(List<ResponseMessage> responseMessageList)
    {
        this.responseMessageList = responseMessageList;
    }

    @Override
    public int getItemViewType(int position)
    {
        if(responseMessageList.get(position).getMe())
        {
            return R.layout.me_bubble;
        }
        return R.layout.bot_bubble;
    }

    @NonNull
    @Override
    public MessageAdapter.CustomViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i)
    {
        return new CustomViewHolder( LayoutInflater.from(viewGroup.getContext()).inflate(i,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MessageAdapter.CustomViewHolder customViewHolder, int i)
    {
        customViewHolder.txtMsg.setText(responseMessageList.get(i).getTextMsg());

    }

    @Override
    public int getItemCount() {
        return responseMessageList.size();
    }
}
