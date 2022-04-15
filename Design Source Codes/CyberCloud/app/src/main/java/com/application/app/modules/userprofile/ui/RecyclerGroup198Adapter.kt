package com.application.app.modules.userprofile.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowUserProfile2Binding
import com.application.app.modules.userprofile.`data`.model.UserProfile2RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGroup198Adapter(
  public var list: List<UserProfile2RowModel>
) : RecyclerView.Adapter<RecyclerGroup198Adapter.RowUserProfile2VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowUserProfile2VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_user_profile2,parent,false)
    return RowUserProfile2VH(view)
  }

  public override fun onBindViewHolder(holder: RowUserProfile2VH, position: Int): Unit {
    val userProfile2RowModel = UserProfile2RowModel()
    // TODO uncomment following line after integration with data source
    // val userProfile2RowModel = list[position]
    holder.binding.userProfile2RowModel = userProfile2RowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<UserProfile2RowModel>): Unit {
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
      item: UserProfile2RowModel
    ): Unit {
    }
  }

  public inner class RowUserProfile2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowUserProfile2Binding = RowUserProfile2Binding.bind(itemView)
  }
}
