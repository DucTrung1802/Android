package com.application.app.modules.dailyweather.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class DailyWeatherModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtWeather: String? = MyApp.getInstance().resources.getString(R.string.lbl_weather)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMarch: String? = MyApp.getInstance().resources.getString(R.string.lbl_march)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtBYDAY: String? = MyApp.getInstance().resources.getString(R.string.lbl_by_day)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtBYMONTH: String? = MyApp.getInstance().resources.getString(R.string.lbl_by_month)
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
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtHistory: String? = MyApp.getInstance().resources.getString(R.string.lbl_history)

)
