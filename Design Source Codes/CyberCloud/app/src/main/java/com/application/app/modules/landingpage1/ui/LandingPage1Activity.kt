package com.application.app.modules.landingpage1.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityLandingPage1Binding
import com.application.app.modules.dailyweathernext.ui.DailyWeatherNextActivity
import com.application.app.modules.landingpage1.`data`.viewmodel.LandingPage1VM
import com.application.app.modules.radar1.ui.Radar1Activity
import com.application.app.modules.tips1.ui.Tips1Activity
import kotlin.String
import kotlin.Unit

public class LandingPage1Activity :
    BaseActivity<ActivityLandingPage1Binding>(R.layout.activity_landing_page1) {
  private val viewModel: LandingPage1VM by viewModels<LandingPage1VM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.landingPage1VM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.imageRadar.setOnClickListener {
      val destIntent = Radar1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageCalendar.setOnClickListener {
      val destIntent = DailyWeatherNextActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageEmergencycall.setOnClickListener {
      val destIntent = Tips1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "LANDING_PAGE1ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LandingPage1Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
