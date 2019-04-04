package com.example.kuang.recyclerdemo;
 
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private static final String TAG = "MyAdapter";
    private Context context;
    private int mCount;

    public MyAdapter(Context context){
        this.context=context;
        mCount = 100;
    }
 
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.d(TAG, "## onCreateViewHolder() called with viewType = [" + viewType + "]");
        View view= LayoutInflater.from(context).inflate(R.layout.item,null);
        return new ViewHolder(view);
    }

    @Override
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        Log.d(TAG, "## onAttachedToRecyclerView() called");
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        Log.d(TAG, "## onDetachedFromRecyclerView() called");
        super.onDetachedFromRecyclerView(recyclerView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Log.d(TAG, "## onBindViewHolderB() called with: holder = [" + holder.hashCode() + "], position = [" + position + "]");
        holder.tvItem.setText(String.valueOf("line:"+position));
    }

    @Override
    public void onViewRecycled(@NonNull ViewHolder holder) {
        Log.d(TAG, "## onViewRecycled() called with: holder = [" + holder.hashCode() + "]");
        super.onViewRecycled(holder);
    }

    @Override
    public int getItemCount() {
//        Log.d(TAG, "## getItemCount() called");
        return mCount;
    }

    @Override
    public void onViewAttachedToWindow(@NonNull ViewHolder holder) {
        Log.d(TAG, "## onViewAttachedToWindow() called with: holder = [" + holder.hashCode() + "]");
        super.onViewAttachedToWindow(holder);
    }

    @Override
    public void onViewDetachedFromWindow(@NonNull ViewHolder holder) {
        Log.d(TAG, "## onViewDetachedFromWindow() called with: holder = [" + holder.hashCode() + "]");
        super.onViewDetachedFromWindow(holder);
    }

    @Override
    public boolean onFailedToRecycleView(@NonNull ViewHolder holder) {
        Log.d(TAG, "## onFailedToRecycleView() called with: holder = [" + holder.hashCode() + "]");
        return super.onFailedToRecycleView(holder);
    }

    public void setCount(int count) {
        mCount = count;
    }
 
    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tvItem;
        public ViewHolder(View itemView) {
            super(itemView);
            tvItem=(TextView)itemView.findViewById(R.id.tv_item) ;
        }
    }
}
