package com.application.app.modules.userprofile3.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowUserProfile5Binding
import com.application.app.modules.userprofile3.`data`.model.UserProfile5RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGroup1292Adapter(
  public var list: List<UserProfile5RowModel>
) : RecyclerView.Adapter<RecyclerGroup1292Adapter.RowUserProfile5VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowUserProfile5VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_user_profile5,parent,false)
    return RowUserProfile5VH(view)
  }

  public override fun onBindViewHolder(holder: RowUserProfile5VH, position: Int): Unit {
    val userProfile5RowModel = UserProfile5RowModel()
    // TODO uncomment following line after integration with data source
    // val userProfile5RowModel = list[position]
    holder.binding.userProfile5RowModel = userProfile5RowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<UserProfile5RowModel>): Unit {
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
      item: UserProfile5RowModel
    ): Unit {
    }
  }

  public inner class RowUserProfile5VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowUserProfile5Binding = RowUserProfile5Binding.bind(itemView)
  }
}
