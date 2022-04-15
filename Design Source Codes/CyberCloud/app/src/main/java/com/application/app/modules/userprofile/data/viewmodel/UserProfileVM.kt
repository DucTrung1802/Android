package com.application.app.modules.userprofile.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.userprofile.`data`.model.UserProfile1RowModel
import com.application.app.modules.userprofile.`data`.model.UserProfile2RowModel
import com.application.app.modules.userprofile.`data`.model.UserProfileModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

public class UserProfileVM : ViewModel(), KoinComponent {
  public val userProfileModel: MutableLiveData<UserProfileModel> =
      MutableLiveData(UserProfileModel())

  public var navArguments: Bundle? = null

  public val recyclerGroup197List: MutableLiveData<MutableList<UserProfile1RowModel>> =
      MutableLiveData(mutableListOf())

  public val recyclerGroup198List: MutableLiveData<MutableList<UserProfile2RowModel>> =
      MutableLiveData(mutableListOf())
}
