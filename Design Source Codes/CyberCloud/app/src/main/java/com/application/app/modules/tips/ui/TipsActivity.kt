package com.application.app.modules.tips.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityTipsBinding
import com.application.app.modules.dailyweather.ui.DailyWeatherActivity
import com.application.app.modules.groundwaterlevel.ui.GroundWaterLevelActivity
import com.application.app.modules.landingpage.ui.LandingPageActivity
import com.application.app.modules.radar.ui.RadarActivity
import com.application.app.modules.tips.`data`.viewmodel.TipsVM
import kotlin.String
import kotlin.Unit

public class TipsActivity : BaseActivity<ActivityTipsBinding>(R.layout.activity_tips) {
  private val viewModel: TipsVM by viewModels<TipsVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.tipsVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.imageRadar.setOnClickListener {
      val destIntent = RadarActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageCalendar.setOnClickListener {
      val destIntent = DailyWeatherActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageHut1.setOnClickListener {
      val destIntent = LandingPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageFloods21.setOnClickListener {
      val destIntent = GroundWaterLevelActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "TIPS_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TipsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
