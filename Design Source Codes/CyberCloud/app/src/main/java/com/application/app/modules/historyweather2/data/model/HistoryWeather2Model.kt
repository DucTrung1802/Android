package com.application.app.modules.historyweather2.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class HistoryWeather2Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtHistory: String? = MyApp.getInstance().resources.getString(R.string.lbl_history)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMonday31March: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_monday_31_march)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtHIGH: String? = MyApp.getInstance().resources.getString(R.string.lbl_high)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLOW: String? = MyApp.getInstance().resources.getString(R.string.lbl_low)

)
