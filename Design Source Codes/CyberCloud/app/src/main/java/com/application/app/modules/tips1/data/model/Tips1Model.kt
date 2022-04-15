package com.application.app.modules.tips1.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Tips1Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtAdvisory: String? = MyApp.getInstance().resources.getString(R.string.lbl_advisory)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTipsAndAdviso: String? =
      MyApp.getInstance().resources.getString(R.string.msg_tips_and_adviso)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAdvisory1: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_advisory_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTheCenterOfS: String? =
      MyApp.getInstance().resources.getString(R.string.msg_the_center_of_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAdvisory2: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_advisory_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAt400PMMax: String? =
      MyApp.getInstance().resources.getString(R.string.msg_at_4_00_pm_max)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAdvisory3: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_advisory_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAt1000PMMa: String? =
      MyApp.getInstance().resources.getString(R.string.msg_at_10_00_pm_ma)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLoadMore: String? = MyApp.getInstance().resources.getString(R.string.lbl_load_more)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTip1: String? = MyApp.getInstance().resources.getString(R.string.lbl_tip_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtStayInsideAs: String? =
      MyApp.getInstance().resources.getString(R.string.msg_stay_inside_as)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTips: String? = MyApp.getInstance().resources.getString(R.string.lbl_tips2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTip2: String? = MyApp.getInstance().resources.getString(R.string.lbl_tip_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLoremIpsu: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol)

)
