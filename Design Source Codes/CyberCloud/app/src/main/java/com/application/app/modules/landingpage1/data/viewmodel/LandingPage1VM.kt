package com.application.app.modules.landingpage1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.landingpage1.`data`.model.LandingPage1Model
import org.koin.core.KoinComponent

public class LandingPage1VM : ViewModel(), KoinComponent {
  public val landingPage1Model: MutableLiveData<LandingPage1Model> =
      MutableLiveData(LandingPage1Model())

  public var navArguments: Bundle? = null
}
