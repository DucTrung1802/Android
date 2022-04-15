package com.application.app.modules.specificevacarea.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class SpecificEvacAreaModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtDirection: String? = MyApp.getInstance().resources.getString(R.string.lbl_direction)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCall: String? = MyApp.getInstance().resources.getString(R.string.lbl_call)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSave: String? = MyApp.getInstance().resources.getString(R.string.lbl_save)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtBrngyPuntaPr: String? =
      MyApp.getInstance().resources.getString(R.string.msg_brngy_punta_pr)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt03234525432: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_032_3452_5432)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtQuestionsAndA: String? =
      MyApp.getInstance().resources.getString(R.string.msg_questions_and_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAskTheCommuni: String? =
      MyApp.getInstance().resources.getString(R.string.msg_ask_the_communi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSeeQuestions: String? =
      MyApp.getInstance().resources.getString(R.string.msg_see_questions)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etLabangonBarangValue: String? = null
)
