package com.application.app.modules.userprofile3.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class UserProfile4RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtAboutUs: String? = MyApp.getInstance().resources.getString(R.string.lbl_about_us)

)
