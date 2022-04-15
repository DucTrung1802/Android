package com.application.app.modules.aboutus1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.aboutus1.`data`.model.AboutUs1Model
import org.koin.core.KoinComponent

public class AboutUs1VM : ViewModel(), KoinComponent {
  public val aboutUs1Model: MutableLiveData<AboutUs1Model> = MutableLiveData(AboutUs1Model())

  public var navArguments: Bundle? = null
}
