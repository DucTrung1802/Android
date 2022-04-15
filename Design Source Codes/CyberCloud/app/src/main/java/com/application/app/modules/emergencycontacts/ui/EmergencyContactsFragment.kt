package com.application.app.modules.emergencycontacts.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseFragment
import com.application.app.databinding.FragmentEmergencyContactsBinding
import com.application.app.modules.emergencycontacts.`data`.model.EmergencyContacts1RowModel
import com.application.app.modules.emergencycontacts.`data`.viewmodel.EmergencyContactsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class EmergencyContactsFragment :
    BaseFragment<FragmentEmergencyContactsBinding>(R.layout.fragment_emergency_contacts) {
  private val viewModel: EmergencyContactsVM by viewModels<EmergencyContactsVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val recyclerEmergencyContactsAdapter =
    RecyclerEmergencyContactsAdapter(viewModel.recyclerEmergencyContactsList.value?:mutableListOf())
    binding.recyclerEmergencyContacts.adapter = recyclerEmergencyContactsAdapter
    recyclerEmergencyContactsAdapter.setOnItemClickListener(
    object : RecyclerEmergencyContactsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : EmergencyContacts1RowModel) {
        onClickRecyclerEmergencyContacts(view, position, item)
      }
    }
    )
    viewModel.recyclerEmergencyContactsList.observe(requireActivity()) {
      recyclerEmergencyContactsAdapter.updateData(it)
    }
    binding.emergencyContactsVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerEmergencyContacts(
    view: View,
    position: Int,
    item: EmergencyContacts1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "EMERGENCY_CONTACTS_FRAGMENT"
  }
}
