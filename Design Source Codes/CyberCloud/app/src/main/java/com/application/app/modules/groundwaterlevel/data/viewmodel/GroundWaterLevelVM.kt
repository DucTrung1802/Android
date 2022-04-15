package com.application.app.modules.groundwaterlevel.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.groundwaterlevel.`data`.model.GroundWaterLevelModel
import org.koin.core.KoinComponent

public class GroundWaterLevelVM : ViewModel(), KoinComponent {
  public val groundWaterLevelModel: MutableLiveData<GroundWaterLevelModel> =
      MutableLiveData(GroundWaterLevelModel())

  public var navArguments: Bundle? = null
}
