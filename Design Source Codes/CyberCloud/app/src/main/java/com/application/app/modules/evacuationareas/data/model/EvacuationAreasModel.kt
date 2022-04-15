package com.application.app.modules.evacuationareas.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class EvacuationAreasModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtEvacuationArea: String? =
      MyApp.getInstance().resources.getString(R.string.msg_evacuation_area)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLabangonBarang: String? =
      MyApp.getInstance().resources.getString(R.string.msg_labangon_barang)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDistrictGovern: String? =
      MyApp.getInstance().resources.getString(R.string.msg_district_govern)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtEvacuationArea1: String? =
      MyApp.getInstance().resources.getString(R.string.msg_evacuation_area2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCITUniversit: String? =
      MyApp.getInstance().resources.getString(R.string.msg_cit_universit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPrivateUnivers: String? =
      MyApp.getInstance().resources.getString(R.string.msg_private_univers)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLabangonBaske: String? =
      MyApp.getInstance().resources.getString(R.string.msg_labangon_baske)

)
