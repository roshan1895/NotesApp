package com.example.myapplication.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.adapters.OptionMenuAdapter;
import com.example.myapplication.model.OptionItem;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import java.util.ArrayList;
import java.util.List;

public class OptionMenuDialog extends BottomSheetDialogFragment implements OptionMenuAdapter.OnItemClickListener {
    RecyclerView rv_menu,rv_color;
    OptionMenuAdapter adapter;
    List<OptionItem> optionItems;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(STYLE_NORMAL, R.style.BottomSheetDialog);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       return  inflater.inflate(R.layout.option_dialog,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        optionItems=new ArrayList<>();
        rv_menu=getView().findViewById(R.id.rv_menus);
        rv_color=getView().findViewById(R.id.rv_color);
        rv_menu.hasFixedSize();
        rv_menu.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter=new OptionMenuAdapter(getActivity(),optionItems,OptionMenuDialog.this);
       rv_menu.setAdapter(adapter);
        loadMenus();
    }
   void loadMenus()
   {
           OptionItem optionItem=new OptionItem(R.drawable.ic_baseline_delete_outline_24,"Delete");
           optionItems.add(optionItem);
           optionItem=new OptionItem(R.drawable.ic_baseline_share_24,"Share");
           optionItems.add(optionItem);
           optionItem=new OptionItem(R.drawable.ic_outline_label_24,"Label");
           optionItems.add(optionItem);
           adapter.notifyDataSetChanged();
   }
    @Override
    public void OnMenuClicked(int pos) {

    }
}
