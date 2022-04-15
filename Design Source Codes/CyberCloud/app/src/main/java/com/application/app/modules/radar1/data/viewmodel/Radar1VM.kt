package com.application.app.modules.radar1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.radar1.`data`.model.Radar1Model
import org.koin.core.KoinComponent

public class Radar1VM : ViewModel(), KoinComponent {
  public val radar1Model: MutableLiveData<Radar1Model> = MutableLiveData(Radar1Model())

  public var navArguments: Bundle? = null
}
