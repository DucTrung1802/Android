package com.application.app.modules.aboutus.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class AboutUsModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtWhoAreWe: String? = MyApp.getInstance().resources.getString(R.string.lbl_who_are_we)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCyberCloudApp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_cybercloud_app)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMission: String? = MyApp.getInstance().resources.getString(R.string.lbl_mission)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtToInstantlyAc: String? =
      MyApp.getInstance().resources.getString(R.string.msg_to_instantly_ac)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtVision: String? = MyApp.getInstance().resources.getString(R.string.lbl_vision)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtWeSeeAWorld: String? =
      MyApp.getInstance().resources.getString(R.string.msg_we_see_a_world)

)
