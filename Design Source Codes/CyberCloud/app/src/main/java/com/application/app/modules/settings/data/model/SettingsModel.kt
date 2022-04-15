package com.application.app.modules.settings.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class SettingsModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtSettings: String? = MyApp.getInstance().resources.getString(R.string.lbl_settings)

)
