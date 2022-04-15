package com.application.app.modules.emergencycontacts.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class EmergencyContactsModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtHOSPITAL0321: String? =
      MyApp.getInstance().resources.getString(R.string.msg_hospital_032_1)

)
