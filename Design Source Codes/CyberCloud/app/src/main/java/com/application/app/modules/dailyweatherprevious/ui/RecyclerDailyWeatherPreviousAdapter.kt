package com.application.app.modules.dailyweatherprevious.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowDailyWeatherPrevious1Binding
import com.application.app.modules.dailyweatherprevious.`data`.model.DailyWeatherPrevious1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerDailyWeatherPreviousAdapter(
  public var list: List<DailyWeatherPrevious1RowModel>
) : RecyclerView.Adapter<RecyclerDailyWeatherPreviousAdapter.RowDailyWeatherPrevious1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowDailyWeatherPrevious1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_daily_weather_previous1,parent,false)
    return RowDailyWeatherPrevious1VH(view)
  }

  public override fun onBindViewHolder(holder: RowDailyWeatherPrevious1VH, position: Int): Unit {
    val dailyWeatherPrevious1RowModel = DailyWeatherPrevious1RowModel()
    // TODO uncomment following line after integration with data source
    // val dailyWeatherPrevious1RowModel = list[position]
    holder.binding.dailyWeatherPrevious1RowModel = dailyWeatherPrevious1RowModel
  }

  public override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<DailyWeatherPrevious1RowModel>): Unit {
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
      item: DailyWeatherPrevious1RowModel
    ): Unit {
    }
  }

  public inner class RowDailyWeatherPrevious1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowDailyWeatherPrevious1Binding =
        RowDailyWeatherPrevious1Binding.bind(itemView)
  }
}
