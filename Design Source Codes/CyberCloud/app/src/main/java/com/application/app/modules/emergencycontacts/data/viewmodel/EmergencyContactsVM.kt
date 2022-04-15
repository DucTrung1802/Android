package com.application.app.modules.emergencycontacts.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.emergencycontacts.`data`.model.EmergencyContacts1RowModel
import com.application.app.modules.emergencycontacts.`data`.model.EmergencyContactsModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

public class EmergencyContactsVM : ViewModel(), KoinComponent {
  public val emergencyContactsModel: MutableLiveData<EmergencyContactsModel> =
      MutableLiveData(EmergencyContactsModel())

  public var navArguments: Bundle? = null

  public val recyclerEmergencyContactsList: MutableLiveData<MutableList<EmergencyContacts1RowModel>>
      = MutableLiveData(mutableListOf())
}
