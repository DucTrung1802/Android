package com.application.app.modules.dailyweatherprevious.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.dailyweatherprevious.`data`.model.DailyWeatherPrevious1RowModel
import com.application.app.modules.dailyweatherprevious.`data`.model.DailyWeatherPreviousModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

public class DailyWeatherPreviousVM : ViewModel(), KoinComponent {
  public val dailyWeatherPreviousModel: MutableLiveData<DailyWeatherPreviousModel> =
      MutableLiveData(DailyWeatherPreviousModel())

  public var navArguments: Bundle? = null

  public val recyclerDailyWeatherPreviousList:
      MutableLiveData<MutableList<DailyWeatherPrevious1RowModel>> = MutableLiveData(mutableListOf())
}
