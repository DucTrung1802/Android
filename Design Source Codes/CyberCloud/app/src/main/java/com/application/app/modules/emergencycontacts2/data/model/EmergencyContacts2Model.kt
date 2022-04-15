package com.application.app.modules.emergencycontacts2.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class EmergencyContacts2Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtEmergencyConta: String? =
      MyApp.getInstance().resources.getString(R.string.msg_emergency_conta)

)
