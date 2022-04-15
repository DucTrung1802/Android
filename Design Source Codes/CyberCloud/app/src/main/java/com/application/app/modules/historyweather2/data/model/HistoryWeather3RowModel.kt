package com.application.app.modules.historyweather2.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class HistoryWeather3RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtTodaysForecas: String? =
      MyApp.getInstance().resources.getString(R.string.msg_today_s_forecas)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt30: String? = MyApp.getInstance().resources.getString(R.string.lbl_302)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt27: String? = MyApp.getInstance().resources.getString(R.string.lbl_273)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt1: String? = MyApp.getInstance().resources.getString(R.string.lbl)

)
