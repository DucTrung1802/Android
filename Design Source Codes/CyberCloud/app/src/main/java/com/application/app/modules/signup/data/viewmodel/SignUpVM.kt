package com.application.app.modules.signup.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.signup.`data`.model.SignUp1RowModel
import com.application.app.modules.signup.`data`.model.SignUpModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

public class SignUpVM : ViewModel(), KoinComponent {
  public val signUpModel: MutableLiveData<SignUpModel> = MutableLiveData(SignUpModel())

  public var navArguments: Bundle? = null

  public val recyclerSignUpList: MutableLiveData<MutableList<SignUp1RowModel>> =
      MutableLiveData(mutableListOf())
}
