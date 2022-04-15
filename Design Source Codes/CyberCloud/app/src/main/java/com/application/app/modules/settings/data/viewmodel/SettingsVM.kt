package com.application.app.modules.settings.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.settings.`data`.model.SettingsModel
import org.koin.core.KoinComponent

public class SettingsVM : ViewModel(), KoinComponent {
  public val settingsModel: MutableLiveData<SettingsModel> = MutableLiveData(SettingsModel())

  public var navArguments: Bundle? = null
}
