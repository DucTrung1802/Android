package com.application.app.modules.specificevacarea.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.specificevacarea.`data`.model.SpecificEvacAreaModel
import org.koin.core.KoinComponent

public class SpecificEvacAreaVM : ViewModel(), KoinComponent {
  public val specificEvacAreaModel: MutableLiveData<SpecificEvacAreaModel> =
      MutableLiveData(SpecificEvacAreaModel())

  public var navArguments: Bundle? = null
}
