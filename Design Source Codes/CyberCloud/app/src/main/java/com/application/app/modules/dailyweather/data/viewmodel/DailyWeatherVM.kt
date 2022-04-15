package com.application.app.modules.dailyweather.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.dailyweather.`data`.model.DailyWeather1RowModel
import com.application.app.modules.dailyweather.`data`.model.DailyWeatherModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

public class DailyWeatherVM : ViewModel(), KoinComponent {
  public val dailyWeatherModel: MutableLiveData<DailyWeatherModel> =
      MutableLiveData(DailyWeatherModel())

  public var navArguments: Bundle? = null

  public val recyclerDailyWeatherList: MutableLiveData<MutableList<DailyWeather1RowModel>> =
      MutableLiveData(mutableListOf())
}
