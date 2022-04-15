package com.application.app.modules.tips1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.tips1.`data`.model.Tips1Model
import org.koin.core.KoinComponent

public class Tips1VM : ViewModel(), KoinComponent {
  public val tips1Model: MutableLiveData<Tips1Model> = MutableLiveData(Tips1Model())

  public var navArguments: Bundle? = null
}
