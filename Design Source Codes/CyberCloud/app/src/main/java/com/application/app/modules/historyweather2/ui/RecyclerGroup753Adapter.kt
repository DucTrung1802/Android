package com.application.app.modules.historyweather2.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowHistoryWeather3Binding
import com.application.app.modules.historyweather2.`data`.model.HistoryWeather3RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGroup753Adapter(
  public var list: List<HistoryWeather3RowModel>
) : RecyclerView.Adapter<RecyclerGroup753Adapter.RowHistoryWeather3VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowHistoryWeather3VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_history_weather_3,parent,false)
    return RowHistoryWeather3VH(view)
  }

  public override fun onBindViewHolder(holder: RowHistoryWeather3VH, position: Int): Unit {
    val historyWeather3RowModel = HistoryWeather3RowModel()
    // TODO uncomment following line after integration with data source
    // val historyWeather3RowModel = list[position]
    holder.binding.historyWeather3RowModel = historyWeather3RowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<HistoryWeather3RowModel>): Unit {
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
      item: HistoryWeather3RowModel
    ): Unit {
    }
  }

  public inner class RowHistoryWeather3VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowHistoryWeather3Binding = RowHistoryWeather3Binding.bind(itemView)
  }
}
