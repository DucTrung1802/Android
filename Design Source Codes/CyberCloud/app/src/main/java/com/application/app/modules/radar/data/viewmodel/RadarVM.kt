package com.application.app.modules.radar.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.radar.`data`.model.RadarModel
import org.koin.core.KoinComponent

public class RadarVM : ViewModel(), KoinComponent {
  public val radarModel: MutableLiveData<RadarModel> = MutableLiveData(RadarModel())

  public var navArguments: Bundle? = null
}
