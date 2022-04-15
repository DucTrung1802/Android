package com.application.app.modules.monthlyweather.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowMonthlyWeather1Binding
import com.application.app.modules.monthlyweather.`data`.model.MonthlyWeather1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGroup880Adapter(
  public var list: List<MonthlyWeather1RowModel>
) : RecyclerView.Adapter<RecyclerGroup880Adapter.RowMonthlyWeather1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowMonthlyWeather1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_monthly_weather1,parent,false)
    return RowMonthlyWeather1VH(view)
  }

  public override fun onBindViewHolder(holder: RowMonthlyWeather1VH, position: Int): Unit {
    val monthlyWeather1RowModel = MonthlyWeather1RowModel()
    // TODO uncomment following line after integration with data source
    // val monthlyWeather1RowModel = list[position]
    holder.binding.monthlyWeather1RowModel = monthlyWeather1RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<MonthlyWeather1RowModel>): Unit {
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
      item: MonthlyWeather1RowModel
    ): Unit {
    }
  }

  public inner class RowMonthlyWeather1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowMonthlyWeather1Binding = RowMonthlyWeather1Binding.bind(itemView)
  }
}
