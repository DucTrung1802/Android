package com.application.app.modules.aboutus.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.aboutus.`data`.model.AboutUsModel
import org.koin.core.KoinComponent

public class AboutUsVM : ViewModel(), KoinComponent {
  public val aboutUsModel: MutableLiveData<AboutUsModel> = MutableLiveData(AboutUsModel())

  public var navArguments: Bundle? = null
}
