package com.application.app.modules.dailyweatherprevious.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class DailyWeatherPreviousModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtWeather: String? = MyApp.getInstance().resources.getString(R.string.lbl_weather)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPrevious5Days: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_previous_5_days)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtFORECAST: String? = MyApp.getInstance().resources.getString(R.string.lbl_forecast)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtHISTORY: String? = MyApp.getInstance().resources.getString(R.string.lbl_history2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt32: String? = MyApp.getInstance().resources.getString(R.string.lbl_32)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt02: String? = MyApp.getInstance().resources.getString(R.string.lbl_02)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMON: String? = MyApp.getInstance().resources.getString(R.string.lbl_mon)

)
