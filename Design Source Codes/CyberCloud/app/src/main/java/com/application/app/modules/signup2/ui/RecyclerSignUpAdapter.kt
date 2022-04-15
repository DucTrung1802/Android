package com.application.app.modules.signup2.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowSignUp3Binding
import com.application.app.modules.signup2.`data`.model.SignUp3RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerSignUpAdapter(
  public var list: List<SignUp3RowModel>
) : RecyclerView.Adapter<RecyclerSignUpAdapter.RowSignUp3VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSignUp3VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_sign_up3,parent,false)
    return RowSignUp3VH(view)
  }

  public override fun onBindViewHolder(holder: RowSignUp3VH, position: Int): Unit {
    val signUp3RowModel = SignUp3RowModel()
    // TODO uncomment following line after integration with data source
    // val signUp3RowModel = list[position]
    holder.binding.signUp3RowModel = signUp3RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<SignUp3RowModel>): Unit {
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
      item: SignUp3RowModel
    ): Unit {
    }
  }

  public inner class RowSignUp3VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowSignUp3Binding = RowSignUp3Binding.bind(itemView)
  }
}
