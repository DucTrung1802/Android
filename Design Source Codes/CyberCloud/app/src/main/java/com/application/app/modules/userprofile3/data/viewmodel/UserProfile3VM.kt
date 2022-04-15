package com.application.app.modules.userprofile3.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.userprofile3.`data`.model.UserProfile3Model
import com.application.app.modules.userprofile3.`data`.model.UserProfile4RowModel
import com.application.app.modules.userprofile3.`data`.model.UserProfile5RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

public class UserProfile3VM : ViewModel(), KoinComponent {
  public val userProfile3Model: MutableLiveData<UserProfile3Model> =
      MutableLiveData(UserProfile3Model())

  public var navArguments: Bundle? = null

  public val recyclerGroup1291List: MutableLiveData<MutableList<UserProfile4RowModel>> =
      MutableLiveData(mutableListOf())

  public val recyclerGroup1292List: MutableLiveData<MutableList<UserProfile5RowModel>> =
      MutableLiveData(mutableListOf())
}
