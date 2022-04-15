package com.application.app.modules.userprofile3.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class UserProfile3Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtPatrickBacalso: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_patrick_bacalso)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSetProfilePho: String? =
      MyApp.getInstance().resources.getString(R.string.msg_set_profile_pho)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtpatrickbacals: String? =
      MyApp.getInstance().resources.getString(R.string.msg_patrick_bacals)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtBioAddAFewW: String? =
      MyApp.getInstance().resources.getString(R.string.msg_bio_add_a_few_w)

)
