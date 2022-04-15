package com.application.app.modules.evacuationareas.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class EvacuationAreas2RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtLabangonEleme: String? =
      MyApp.getInstance().resources.getString(R.string.msg_labangon_eleme)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtElementaryScho: String? =
      MyApp.getInstance().resources.getString(R.string.msg_elementary_scho)

)
