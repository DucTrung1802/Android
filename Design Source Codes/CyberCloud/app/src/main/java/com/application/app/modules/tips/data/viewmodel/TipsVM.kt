package com.application.app.modules.tips.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.tips.`data`.model.TipsModel
import org.koin.core.KoinComponent

public class TipsVM : ViewModel(), KoinComponent {
  public val tipsModel: MutableLiveData<TipsModel> = MutableLiveData(TipsModel())

  public var navArguments: Bundle? = null
}
