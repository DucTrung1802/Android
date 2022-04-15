package com.application.app.modules.emergencycontacts.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class EmergencyContacts1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtNDRRMC: String? = MyApp.getInstance().resources.getString(R.string.lbl_ndrrmc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt03212345678: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_032_1234_5678)

)
