package com.application.app.modules.evacuationareas.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowEvacuationAreas2Binding
import com.application.app.modules.evacuationareas.`data`.model.EvacuationAreas2RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGroup413Adapter(
  public var list: List<EvacuationAreas2RowModel>
) : RecyclerView.Adapter<RecyclerGroup413Adapter.RowEvacuationAreas2VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowEvacuationAreas2VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_evacuation_areas2,parent,false)
    return RowEvacuationAreas2VH(view)
  }

  public override fun onBindViewHolder(holder: RowEvacuationAreas2VH, position: Int): Unit {
    val evacuationAreas2RowModel = EvacuationAreas2RowModel()
    // TODO uncomment following line after integration with data source
    // val evacuationAreas2RowModel = list[position]
    holder.binding.evacuationAreas2RowModel = evacuationAreas2RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<EvacuationAreas2RowModel>): Unit {
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
      item: EvacuationAreas2RowModel
    ): Unit {
    }
  }

  public inner class RowEvacuationAreas2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowEvacuationAreas2Binding = RowEvacuationAreas2Binding.bind(itemView)
  }
}
