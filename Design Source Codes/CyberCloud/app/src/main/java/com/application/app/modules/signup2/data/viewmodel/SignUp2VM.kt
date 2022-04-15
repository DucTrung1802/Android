package com.application.app.modules.signup2.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.signup2.`data`.model.SignUp2Model
import com.application.app.modules.signup2.`data`.model.SignUp3RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

public class SignUp2VM : ViewModel(), KoinComponent {
  public val signUp2Model: MutableLiveData<SignUp2Model> = MutableLiveData(SignUp2Model())

  public var navArguments: Bundle? = null

  public val recyclerSignUpList: MutableLiveData<MutableList<SignUp3RowModel>> =
      MutableLiveData(mutableListOf())
}
