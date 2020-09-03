package com.samyanmar.shared.adapters

import androidx.recyclerview.widget.RecyclerView
import com.samyanmar.shared.views.viewholder.BaseViewHolder

abstract class BaseRecyclerAdapter<T: BaseViewHolder<W>, W>
    : RecyclerView.Adapter<T>() {

    private var mData: List<W> = listOf()

    override fun onBindViewHolder(holder: T, position: Int) {
        holder.bindData(mData[position])
    }

    override fun getItemCount(): Int {
        return mData.size
    }

    fun setNewData(data: List<W>) {
        mData = data
        notifyDataSetChanged()
    }
}