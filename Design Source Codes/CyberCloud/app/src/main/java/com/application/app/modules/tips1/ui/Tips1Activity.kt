package com.application.app.modules.tips1.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityTips1Binding
import com.application.app.modules.dailyweathernext.ui.DailyWeatherNextActivity
import com.application.app.modules.landingpage1.ui.LandingPage1Activity
import com.application.app.modules.radar1.ui.Radar1Activity
import com.application.app.modules.tips1.`data`.viewmodel.Tips1VM
import kotlin.String
import kotlin.Unit

public class Tips1Activity : BaseActivity<ActivityTips1Binding>(R.layout.activity_tips1) {
  private val viewModel: Tips1VM by viewModels<Tips1VM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.tips1VM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.imageCalendar.setOnClickListener {
      val destIntent = DailyWeatherNextActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRadar.setOnClickListener {
      val destIntent = Radar1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageHut1.setOnClickListener {
      val destIntent = LandingPage1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "TIPS1ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Tips1Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
