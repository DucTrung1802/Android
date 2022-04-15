package com.application.app.modules.landingpage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.landingpage.`data`.model.LandingPageModel
import org.koin.core.KoinComponent

public class LandingPageVM : ViewModel(), KoinComponent {
  public val landingPageModel: MutableLiveData<LandingPageModel> =
      MutableLiveData(LandingPageModel())

  public var navArguments: Bundle? = null
}
