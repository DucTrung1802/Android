package com.application.app.modules.userprofile3.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class UserProfile5RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtShareTheApp: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_share_the_app)

)
