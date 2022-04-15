package com.application.app.modules.evacuationareas.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowEvacuationAreas1Binding
import com.application.app.modules.evacuationareas.`data`.model.EvacuationAreas1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGroup412Adapter(
  public var list: List<EvacuationAreas1RowModel>
) : RecyclerView.Adapter<RecyclerGroup412Adapter.RowEvacuationAreas1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowEvacuationAreas1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_evacuation_areas1,parent,false)
    return RowEvacuationAreas1VH(view)
  }

  public override fun onBindViewHolder(holder: RowEvacuationAreas1VH, position: Int): Unit {
    val evacuationAreas1RowModel = EvacuationAreas1RowModel()
    // TODO uncomment following line after integration with data source
    // val evacuationAreas1RowModel = list[position]
    holder.binding.evacuationAreas1RowModel = evacuationAreas1RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<EvacuationAreas1RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: EvacuationAreas1RowModel
    ): Unit {
    }
  }

  public inner class RowEvacuationAreas1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowEvacuationAreas1Binding = RowEvacuationAreas1Binding.bind(itemView)
  }
}
