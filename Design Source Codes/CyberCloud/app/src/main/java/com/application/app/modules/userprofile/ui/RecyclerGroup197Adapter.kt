package com.application.app.modules.userprofile.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowUserProfile1Binding
import com.application.app.modules.userprofile.`data`.model.UserProfile1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGroup197Adapter(
  public var list: List<UserProfile1RowModel>
) : RecyclerView.Adapter<RecyclerGroup197Adapter.RowUserProfile1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowUserProfile1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_user_profile1,parent,false)
    return RowUserProfile1VH(view)
  }

  public override fun onBindViewHolder(holder: RowUserProfile1VH, position: Int): Unit {
    val userProfile1RowModel = UserProfile1RowModel()
    // TODO uncomment following line after integration with data source
    // val userProfile1RowModel = list[position]
    holder.binding.userProfile1RowModel = userProfile1RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<UserProfile1RowModel>): Unit {
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
      item: UserProfile1RowModel
    ): Unit {
    }
  }

  public inner class RowUserProfile1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowUserProfile1Binding = RowUserProfile1Binding.bind(itemView)
    init {
      binding.imageRightarrow3.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, UserProfile1RowModel())
      }
      binding.linearAboutUs.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, UserProfile1RowModel())
      }
    }
  }
}
