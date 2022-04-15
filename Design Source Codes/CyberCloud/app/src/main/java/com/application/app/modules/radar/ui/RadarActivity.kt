package com.application.app.modules.radar.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityRadarBinding
import com.application.app.modules.evacuationareas.ui.EvacuationAreasActivity
import com.application.app.modules.landingpage.ui.LandingPageActivity
import com.application.app.modules.radar.`data`.viewmodel.RadarVM
import kotlin.String
import kotlin.Unit

public class RadarActivity : BaseActivity<ActivityRadarBinding>(R.layout.activity_radar) {
  private val viewModel: RadarVM by viewModels<RadarVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.radarVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.frameGroup497.setOnClickListener {
      val destIntent = EvacuationAreasActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrow2.setOnClickListener {
      val destIntent = LandingPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "RADAR_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RadarActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
