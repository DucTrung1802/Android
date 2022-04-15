package com.application.app.modules.groundwaterlevel.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityGroundWaterLevelBinding
import com.application.app.modules.dailyweather.ui.DailyWeatherActivity
import com.application.app.modules.groundwaterlevel.`data`.viewmodel.GroundWaterLevelVM
import com.application.app.modules.landingpage.ui.LandingPageActivity
import com.application.app.modules.radar.ui.RadarActivity
import kotlin.String
import kotlin.Unit

public class GroundWaterLevelActivity :
    BaseActivity<ActivityGroundWaterLevelBinding>(R.layout.activity_ground_water_level) {
  private val viewModel: GroundWaterLevelVM by viewModels<GroundWaterLevelVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.groundWaterLevelVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.imageHut1.setOnClickListener {
      val destIntent = LandingPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageCalendar.setOnClickListener {
      val destIntent = DailyWeatherActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRadar.setOnClickListener {
      val destIntent = RadarActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "GROUND_WATER_LEVEL_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, GroundWaterLevelActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
