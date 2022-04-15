package com.application.app.modules.appnavigation.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.appnavigation.`data`.model.AppNavigationModel
import org.koin.core.KoinComponent

public class AppNavigationVM : ViewModel(), KoinComponent {
  public val appNavigationModel: MutableLiveData<AppNavigationModel> =
      MutableLiveData(AppNavigationModel())

  public var navArguments: Bundle? = null
}
