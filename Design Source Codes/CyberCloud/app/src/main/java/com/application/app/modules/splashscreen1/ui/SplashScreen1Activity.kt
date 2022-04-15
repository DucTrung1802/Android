package com.application.app.modules.splashscreen1.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivitySplashScreen1Binding
import com.application.app.modules.splashscreen1.`data`.viewmodel.SplashScreen1VM
import kotlin.String
import kotlin.Unit

public class SplashScreen1Activity :
    BaseActivity<ActivitySplashScreen1Binding>(R.layout.activity_splash_screen1) {
  private val viewModel: SplashScreen1VM by viewModels<SplashScreen1VM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.splashScreen1VM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "SPLASH_SCREEN1ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SplashScreen1Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
