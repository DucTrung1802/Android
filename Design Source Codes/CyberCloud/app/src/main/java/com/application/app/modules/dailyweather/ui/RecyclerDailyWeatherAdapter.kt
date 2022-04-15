package com.application.app.modules.dailyweather.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowDailyWeather1Binding
import com.application.app.modules.dailyweather.`data`.model.DailyWeather1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerDailyWeatherAdapter(
  public var list: List<DailyWeather1RowModel>
) : RecyclerView.Adapter<RecyclerDailyWeatherAdapter.RowDailyWeather1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowDailyWeather1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_daily_weather1,parent,false)
    return RowDailyWeather1VH(view)
  }

  public override fun onBindViewHolder(holder: RowDailyWeather1VH, position: Int): Unit {
    val dailyWeather1RowModel = DailyWeather1RowModel()
    // TODO uncomment following line after integration with data source
    // val dailyWeather1RowModel = list[position]
    holder.binding.dailyWeather1RowModel = dailyWeather1RowModel
  }

  public override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<DailyWeather1RowModel>): Unit {
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
      item: DailyWeather1RowModel
    ): Unit {
    }
  }

  public inner class RowDailyWeather1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowDailyWeather1Binding = RowDailyWeather1Binding.bind(itemView)
  }
}
