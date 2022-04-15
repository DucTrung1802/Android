package com.application.app.modules.signin.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.signin.`data`.model.SignInModel
import org.koin.core.KoinComponent

public class SignInVM : ViewModel(), KoinComponent {
  public val signInModel: MutableLiveData<SignInModel> = MutableLiveData(SignInModel())

  public var navArguments: Bundle? = null
}
