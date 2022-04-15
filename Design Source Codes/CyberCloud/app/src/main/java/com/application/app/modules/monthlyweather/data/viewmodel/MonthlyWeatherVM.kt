package com.application.app.modules.monthlyweather.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.monthlyweather.`data`.model.MonthlyWeather1RowModel
import com.application.app.modules.monthlyweather.`data`.model.MonthlyWeather2RowModel
import com.application.app.modules.monthlyweather.`data`.model.MonthlyWeatherModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

public class MonthlyWeatherVM : ViewModel(), KoinComponent {
  public val monthlyWeatherModel: MutableLiveData<MonthlyWeatherModel> =
      MutableLiveData(MonthlyWeatherModel())

  public var navArguments: Bundle? = null

  public val recyclerGroup880List: MutableLiveData<MutableList<MonthlyWeather1RowModel>> =
      MutableLiveData(mutableListOf())

  public val recyclerGroup879List: MutableLiveData<MutableList<MonthlyWeather2RowModel>> =
      MutableLiveData(mutableListOf())
}
