package com.application.app.modules.settings1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.settings1.`data`.model.Settings1Model
import org.koin.core.KoinComponent

public class Settings1VM : ViewModel(), KoinComponent {
  public val settings1Model: MutableLiveData<Settings1Model> = MutableLiveData(Settings1Model())

  public var navArguments: Bundle? = null
}
