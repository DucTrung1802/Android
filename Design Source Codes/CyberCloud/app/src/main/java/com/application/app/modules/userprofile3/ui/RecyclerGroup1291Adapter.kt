package com.application.app.modules.userprofile3.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowUserProfile4Binding
import com.application.app.modules.userprofile3.`data`.model.UserProfile4RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGroup1291Adapter(
  public var list: List<UserProfile4RowModel>
) : RecyclerView.Adapter<RecyclerGroup1291Adapter.RowUserProfile4VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowUserProfile4VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_user_profile4,parent,false)
    return RowUserProfile4VH(view)
  }

  public override fun onBindViewHolder(holder: RowUserProfile4VH, position: Int): Unit {
    val userProfile4RowModel = UserProfile4RowModel()
    // TODO uncomment following line after integration with data source
    // val userProfile4RowModel = list[position]
    holder.binding.userProfile4RowModel = userProfile4RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<UserProfile4RowModel>): Unit {
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
      item: UserProfile4RowModel
    ): Unit {
    }
  }

  public inner class RowUserProfile4VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowUserProfile4Binding = RowUserProfile4Binding.bind(itemView)
  }
}
