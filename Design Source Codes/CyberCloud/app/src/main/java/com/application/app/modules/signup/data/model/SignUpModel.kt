package com.application.app.modules.signup.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class SignUpModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtCreateAccount: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_create_account)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTurnOnLocatio: String? =
      MyApp.getInstance().resources.getString(R.string.msg_turn_on_locatio)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtOr: String? = MyApp.getInstance().resources.getString(R.string.lbl_or)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etEnterUsernameValue: String? = null
)
