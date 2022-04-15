package com.application.app.modules.evacuationareas.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class EvacuationAreas1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtTisaBarangayH: String? =
      MyApp.getInstance().resources.getString(R.string.msg_tisa_barangay_h)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDistrictGovern: String? =
      MyApp.getInstance().resources.getString(R.string.msg_district_govern)

)
