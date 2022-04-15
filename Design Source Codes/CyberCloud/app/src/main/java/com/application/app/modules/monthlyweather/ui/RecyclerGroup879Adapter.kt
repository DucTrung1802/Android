package com.application.app.modules.monthlyweather.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowMonthlyWeather2Binding
import com.application.app.modules.monthlyweather.`data`.model.MonthlyWeather2RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGroup879Adapter(
  public var list: List<MonthlyWeather2RowModel>
) : RecyclerView.Adapter<RecyclerGroup879Adapter.RowMonthlyWeather2VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowMonthlyWeather2VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_monthly_weather2,parent,false)
    return RowMonthlyWeather2VH(view)
  }

  public override fun onBindViewHolder(holder: RowMonthlyWeather2VH, position: Int): Unit {
    val monthlyWeather2RowModel = MonthlyWeather2RowModel()
    // TODO uncomment following line after integration with data source
    // val monthlyWeather2RowModel = list[position]
    holder.binding.monthlyWeather2RowModel = monthlyWeather2RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<MonthlyWeather2RowModel>): Unit {
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
      item: MonthlyWeather2RowModel
    ): Unit {
    }
  }

  public inner class RowMonthlyWeather2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowMonthlyWeather2Binding = RowMonthlyWeather2Binding.bind(itemView)
  }
}
