package com.application.app.modules.dailyweathernext.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.dailyweathernext.`data`.model.DailyWeatherNext1RowModel
import com.application.app.modules.dailyweathernext.`data`.model.DailyWeatherNextModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

public class DailyWeatherNextVM : ViewModel(), KoinComponent {
  public val dailyWeatherNextModel: MutableLiveData<DailyWeatherNextModel> =
      MutableLiveData(DailyWeatherNextModel())

  public var navArguments: Bundle? = null

  public val recyclerDailyWeatherNextList: MutableLiveData<MutableList<DailyWeatherNext1RowModel>> =
      MutableLiveData(mutableListOf())
}
