package com.application.app.modules.signin1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.signin1.`data`.model.SignIn1Model
import org.koin.core.KoinComponent

public class SignIn1VM : ViewModel(), KoinComponent {
  public val signIn1Model: MutableLiveData<SignIn1Model> = MutableLiveData(SignIn1Model())

  public var navArguments: Bundle? = null
}
