package com.application.app.modules.signup.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowSignUp1Binding
import com.application.app.modules.signup.`data`.model.SignUp1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerSignUpAdapter(
  public var list: List<SignUp1RowModel>
) : RecyclerView.Adapter<RecyclerSignUpAdapter.RowSignUp1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSignUp1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_sign_up1,parent,false)
    return RowSignUp1VH(view)
  }

  public override fun onBindViewHolder(holder: RowSignUp1VH, position: Int): Unit {
    val signUp1RowModel = SignUp1RowModel()
    // TODO uncomment following line after integration with data source
    // val signUp1RowModel = list[position]
    holder.binding.signUp1RowModel = signUp1RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<SignUp1RowModel>): Unit {
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
      item: SignUp1RowModel
    ): Unit {
    }
  }

  public inner class RowSignUp1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowSignUp1Binding = RowSignUp1Binding.bind(itemView)
  }
}
