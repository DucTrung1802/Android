package com.application.app.modules.emergencycontacts.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowEmergencyContacts1Binding
import com.application.app.modules.emergencycontacts.`data`.model.EmergencyContacts1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerEmergencyContactsAdapter(
  public var list: List<EmergencyContacts1RowModel>
) : RecyclerView.Adapter<RecyclerEmergencyContactsAdapter.RowEmergencyContacts1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowEmergencyContacts1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_emergency_contacts1,parent,false)
    return RowEmergencyContacts1VH(view)
  }

  public override fun onBindViewHolder(holder: RowEmergencyContacts1VH, position: Int): Unit {
    val emergencyContacts1RowModel = EmergencyContacts1RowModel()
    // TODO uncomment following line after integration with data source
    // val emergencyContacts1RowModel = list[position]
    holder.binding.emergencyContacts1RowModel = emergencyContacts1RowModel
  }

  public override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<EmergencyContacts1RowModel>): Unit {
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
      item: EmergencyContacts1RowModel
    ): Unit {
    }
  }

  public inner class RowEmergencyContacts1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowEmergencyContacts1Binding = RowEmergencyContacts1Binding.bind(itemView)
  }
}
