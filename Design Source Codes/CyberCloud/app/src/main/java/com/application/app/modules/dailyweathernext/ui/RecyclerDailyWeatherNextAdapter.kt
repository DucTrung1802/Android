package com.application.app.modules.dailyweathernext.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowDailyWeatherNext1Binding
import com.application.app.modules.dailyweathernext.`data`.model.DailyWeatherNext1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerDailyWeatherNextAdapter(
  public var list: List<DailyWeatherNext1RowModel>
) : RecyclerView.Adapter<RecyclerDailyWeatherNextAdapter.RowDailyWeatherNext1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowDailyWeatherNext1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_daily_weather_next1,parent,false)
    return RowDailyWeatherNext1VH(view)
  }

  public override fun onBindViewHolder(holder: RowDailyWeatherNext1VH, position: Int): Unit {
    val dailyWeatherNext1RowModel = DailyWeatherNext1RowModel()
    // TODO uncomment following line after integration with data source
    // val dailyWeatherNext1RowModel = list[position]
    holder.binding.dailyWeatherNext1RowModel = dailyWeatherNext1RowModel
  }

  public override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<DailyWeatherNext1RowModel>): Unit {
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
      item: DailyWeatherNext1RowModel
    ): Unit {
    }
  }

  public inner class RowDailyWeatherNext1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowDailyWeatherNext1Binding = RowDailyWeatherNext1Binding.bind(itemView)
  }
}
