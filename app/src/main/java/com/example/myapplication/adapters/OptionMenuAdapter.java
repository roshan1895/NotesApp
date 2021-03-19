package com.example.myapplication.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.model.OptionItem;

import java.util.List;

public class OptionMenuAdapter  extends RecyclerView.Adapter<OptionMenuAdapter.MyViewHolder> {
    Context context;
    List<OptionItem> list;
    public interface OnItemClickListener{
        public void OnMenuClicked(int pos);
    }
    OnItemClickListener onItemClickListener;
    public  OptionMenuAdapter(Context context,List<OptionItem> list,OnItemClickListener onItemClickListener)
    {this.context=context;
    this.list=list;
    this.onItemClickListener=onItemClickListener;

    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(context).inflate(R.layout.option_menu_layout,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
     holder.imageView.setImageResource(list.get(position).getMenu_img());
     holder.textView.setText(list.get(position).getMenu_name());
     holder.itemView.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             onItemClickListener.OnMenuClicked(position);
         }
     });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.menu_img);
            textView=itemView.findViewById(R.id.menu_txt);
        }
    }
}
