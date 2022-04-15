package com.application.app.modules.historyweather.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.historyweather.`data`.model.HistoryWeather1RowModel
import com.application.app.modules.historyweather.`data`.model.HistoryWeatherModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

public class HistoryWeatherVM : ViewModel(), KoinComponent {
  public val historyWeatherModel: MutableLiveData<HistoryWeatherModel> =
      MutableLiveData(HistoryWeatherModel())

  public var navArguments: Bundle? = null

  public val recyclerHistoryWeatherList: MutableLiveData<MutableList<HistoryWeather1RowModel>> =
      MutableLiveData(mutableListOf())
}
