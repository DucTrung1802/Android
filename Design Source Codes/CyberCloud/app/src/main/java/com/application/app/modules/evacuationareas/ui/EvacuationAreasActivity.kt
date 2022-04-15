package com.application.app.modules.evacuationareas.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityEvacuationAreasBinding
import com.application.app.modules.evacuationareas.`data`.model.EvacuationAreas1RowModel
import com.application.app.modules.evacuationareas.`data`.model.EvacuationAreas2RowModel
import com.application.app.modules.evacuationareas.`data`.viewmodel.EvacuationAreasVM
import com.application.app.modules.radar.ui.RadarActivity
import com.application.app.modules.specificevacarea.ui.SpecificEvacAreaActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class EvacuationAreasActivity :
    BaseActivity<ActivityEvacuationAreasBinding>(R.layout.activity_evacuation_areas) {
  private val viewModel: EvacuationAreasVM by viewModels<EvacuationAreasVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val recyclerGroup412Adapter =
    RecyclerGroup412Adapter(viewModel.recyclerGroup412List.value?:mutableListOf())
    binding.recyclerGroup412.adapter = recyclerGroup412Adapter
    recyclerGroup412Adapter.setOnItemClickListener(
    object : RecyclerGroup412Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : EvacuationAreas1RowModel) {
        onClickRecyclerGroup412(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup412List.observe(this) {
      recyclerGroup412Adapter.updateData(it)
    }
    val recyclerGroup413Adapter =
    RecyclerGroup413Adapter(viewModel.recyclerGroup413List.value?:mutableListOf())
    binding.recyclerGroup413.adapter = recyclerGroup413Adapter
    recyclerGroup413Adapter.setOnItemClickListener(
    object : RecyclerGroup413Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : EvacuationAreas2RowModel) {
        onClickRecyclerGroup413(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup413List.observe(this) {
      recyclerGroup413Adapter.updateData(it)
    }
    binding.evacuationAreasVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.txtLabangonBarang.setOnClickListener {
      val destIntent = SpecificEvacAreaActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageLabangon1.setOnClickListener {
      val destIntent = SpecificEvacAreaActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearGroup395.setOnClickListener {
      val destIntent = SpecificEvacAreaActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrow1.setOnClickListener {
      val destIntent = RadarActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public fun onClickRecyclerGroup412(
    view: View,
    position: Int,
    item: EvacuationAreas1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public fun onClickRecyclerGroup413(
    view: View,
    position: Int,
    item: EvacuationAreas2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "EVACUATION_AREAS_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EvacuationAreasActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
