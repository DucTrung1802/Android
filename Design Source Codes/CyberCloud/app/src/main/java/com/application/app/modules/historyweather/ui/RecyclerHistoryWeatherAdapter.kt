package com.application.app.modules.historyweather.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowHistoryWeather1Binding
import com.application.app.modules.historyweather.`data`.model.HistoryWeather1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerHistoryWeatherAdapter(
  public var list: List<HistoryWeather1RowModel>
) : RecyclerView.Adapter<RecyclerHistoryWeatherAdapter.RowHistoryWeather1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowHistoryWeather1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_history_weather1,parent,false)
    return RowHistoryWeather1VH(view)
  }

  public override fun onBindViewHolder(holder: RowHistoryWeather1VH, position: Int): Unit {
    val historyWeather1RowModel = HistoryWeather1RowModel()
    // TODO uncomment following line after integration with data source
    // val historyWeather1RowModel = list[position]
    holder.binding.historyWeather1RowModel = historyWeather1RowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<HistoryWeather1RowModel>): Unit {
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
      item: HistoryWeather1RowModel
    ): Unit {
    }
  }

  public inner class RowHistoryWeather1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowHistoryWeather1Binding = RowHistoryWeather1Binding.bind(itemView)
  }
}
