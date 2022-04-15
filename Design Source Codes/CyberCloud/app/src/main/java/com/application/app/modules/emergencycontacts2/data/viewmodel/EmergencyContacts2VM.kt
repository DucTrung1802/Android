package com.application.app.modules.emergencycontacts2.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.emergencycontacts2.`data`.model.EmergencyContacts2Model
import org.koin.core.KoinComponent

public class EmergencyContacts2VM : ViewModel(), KoinComponent {
  public val emergencyContacts2Model: MutableLiveData<EmergencyContacts2Model> =
      MutableLiveData(EmergencyContacts2Model())

  public var navArguments: Bundle? = null
}
