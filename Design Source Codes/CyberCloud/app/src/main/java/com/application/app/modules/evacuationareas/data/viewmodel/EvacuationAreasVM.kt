package com.application.app.modules.evacuationareas.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.evacuationareas.`data`.model.EvacuationAreas1RowModel
import com.application.app.modules.evacuationareas.`data`.model.EvacuationAreas2RowModel
import com.application.app.modules.evacuationareas.`data`.model.EvacuationAreasModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

public class EvacuationAreasVM : ViewModel(), KoinComponent {
  public val evacuationAreasModel: MutableLiveData<EvacuationAreasModel> =
      MutableLiveData(EvacuationAreasModel())

  public var navArguments: Bundle? = null

  public val recyclerGroup412List: MutableLiveData<MutableList<EvacuationAreas1RowModel>> =
      MutableLiveData(mutableListOf())

  public val recyclerGroup413List: MutableLiveData<MutableList<EvacuationAreas2RowModel>> =
      MutableLiveData(mutableListOf())
}
