package com.application.app.modules.radar1.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Radar1Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtYourLocation: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_your_location)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtEvacuationArea: String? =
      MyApp.getInstance().resources.getString(R.string.msg_evacuation_area)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtConvenienceSto: String? =
      MyApp.getInstance().resources.getString(R.string.msg_convenience_sto)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPolice: String? = MyApp.getInstance().resources.getString(R.string.lbl_police2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtWaterLevelRad: String? =
      MyApp.getInstance().resources.getString(R.string.msg_water_level_rad)

)
