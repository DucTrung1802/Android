package com.application.app.modules.landingpage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityLandingPageBinding
import com.application.app.modules.dailyweather.ui.DailyWeatherActivity
import com.application.app.modules.groundwaterlevel.ui.GroundWaterLevelActivity
import com.application.app.modules.landingpage.`data`.viewmodel.LandingPageVM
import com.application.app.modules.radar.ui.RadarActivity
import kotlin.String
import kotlin.Unit

public class LandingPageActivity :
    BaseActivity<ActivityLandingPageBinding>(R.layout.activity_landing_page) {
  private val viewModel: LandingPageVM by viewModels<LandingPageVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.landingPageVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.imageCalendar.setOnClickListener {
      val destIntent = DailyWeatherActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageWaterlevel.setOnClickListener {
      val destIntent = GroundWaterLevelActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRadar.setOnClickListener {
      val destIntent = RadarActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "LANDING_PAGE_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LandingPageActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
