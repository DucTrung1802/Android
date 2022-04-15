package com.application.app.modules.specificevacarea.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivitySpecificEvacAreaBinding
import com.application.app.modules.evacuationareas.ui.EvacuationAreasActivity
import com.application.app.modules.specificevacarea.`data`.viewmodel.SpecificEvacAreaVM
import kotlin.String
import kotlin.Unit

public class SpecificEvacAreaActivity :
    BaseActivity<ActivitySpecificEvacAreaBinding>(R.layout.activity_specific_evac_area) {
  private val viewModel: SpecificEvacAreaVM by viewModels<SpecificEvacAreaVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.specificEvacAreaVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.imageArrow1.setOnClickListener {
      val destIntent = EvacuationAreasActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "SPECIFIC_EVAC_AREA_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SpecificEvacAreaActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
