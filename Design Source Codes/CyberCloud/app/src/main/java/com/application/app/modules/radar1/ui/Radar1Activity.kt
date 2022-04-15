package com.application.app.modules.radar1.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityRadar1Binding
import com.application.app.modules.radar1.`data`.viewmodel.Radar1VM
import kotlin.String
import kotlin.Unit

public class Radar1Activity : BaseActivity<ActivityRadar1Binding>(R.layout.activity_radar1) {
  private val viewModel: Radar1VM by viewModels<Radar1VM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.radar1VM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "RADAR1ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Radar1Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
