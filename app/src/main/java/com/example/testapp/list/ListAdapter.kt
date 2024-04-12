package com.example.testapp.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.testapp.R
import com.example.testapp.data.model.Expense

class ListAdapter: RecyclerView.Adapter<ListAdapter.ListViewHolder>(){

    private var list = emptyList<Expense>()

    class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val expenseTxtView: TextView = itemView.findViewById(R.id.expenseTextView)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.row_item, parent, false)
        return ListViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val currentItem = list[position]
        holder.expenseTxtView.text = currentItem.amount.toString()
    }

    override fun getItemCount(): Int {
        return list.size
    }

}