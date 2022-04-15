package com.application.app.modules.splashscreen1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.splashscreen1.`data`.model.SplashScreen1Model
import org.koin.core.KoinComponent

public class SplashScreen1VM : ViewModel(), KoinComponent {
  public val splashScreen1Model: MutableLiveData<SplashScreen1Model> =
      MutableLiveData(SplashScreen1Model())

  public var navArguments: Bundle? = null
}
