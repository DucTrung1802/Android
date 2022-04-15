package com.application.app.modules.historyweather2.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.historyweather2.`data`.model.HistoryWeather2Model
import com.application.app.modules.historyweather2.`data`.model.HistoryWeather3RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

public class HistoryWeather2VM : ViewModel(), KoinComponent {
  public val historyWeather2Model: MutableLiveData<HistoryWeather2Model> =
      MutableLiveData(HistoryWeather2Model())

  public var navArguments: Bundle? = null

  public val recyclerGroup753List: MutableLiveData<MutableList<HistoryWeather3RowModel>> =
      MutableLiveData(mutableListOf())
}
