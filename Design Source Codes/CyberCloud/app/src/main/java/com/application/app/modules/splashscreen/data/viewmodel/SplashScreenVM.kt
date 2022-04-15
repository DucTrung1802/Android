package com.application.app.modules.splashscreen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.splashscreen.`data`.model.SplashScreenModel
import org.koin.core.KoinComponent

public class SplashScreenVM : ViewModel(), KoinComponent {
  public val splashScreenModel: MutableLiveData<SplashScreenModel> =
      MutableLiveData(SplashScreenModel())

  public var navArguments: Bundle? = null
}
