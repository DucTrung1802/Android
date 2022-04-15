package com.application.app.modules.dailyweatherprevious.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class DailyWeatherPrevious1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txt27: String? = MyApp.getInstance().resources.getString(R.string.lbl_273)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCloudy: String? = MyApp.getInstance().resources.getString(R.string.lbl_cloudy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCebuCity: String? = MyApp.getInstance().resources.getString(R.string.lbl_cebu_city)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt30: String? = MyApp.getInstance().resources.getString(R.string.lbl_302)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMON: String? = MyApp.getInstance().resources.getString(R.string.lbl_mon)

)
