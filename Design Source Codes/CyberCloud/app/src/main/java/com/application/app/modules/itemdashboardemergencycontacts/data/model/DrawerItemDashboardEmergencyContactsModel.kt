package com.application.app.modules.itemdashboardemergencycontacts.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class DrawerItemDashboardEmergencyContactsModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtPatrickBacalso: String? =
      MyApp.getInstance().resources.getString(R.string.msg_patrick_bacalso)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtWeather: String? = MyApp.getInstance().resources.getString(R.string.lbl_weather)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCF: String? = MyApp.getInstance().resources.getString(R.string.lbl_c_f)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAddToHomeScr: String? =
      MyApp.getInstance().resources.getString(R.string.msg_add_to_home_scr)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtEditProfile: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_edit_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCustomizeWidge: String? =
      MyApp.getInstance().resources.getString(R.string.msg_customize_widge)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSettings: String? = MyApp.getInstance().resources.getString(R.string.lbl_settings)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSendFeedback: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_send_feedback)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtHelp: String? = MyApp.getInstance().resources.getString(R.string.lbl_help)

)
