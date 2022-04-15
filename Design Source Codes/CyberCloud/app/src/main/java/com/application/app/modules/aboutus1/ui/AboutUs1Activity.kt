package com.application.app.modules.aboutus1.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityAboutUs1Binding
import com.application.app.modules.aboutus1.`data`.viewmodel.AboutUs1VM
import kotlin.String
import kotlin.Unit

public class AboutUs1Activity : BaseActivity<ActivityAboutUs1Binding>(R.layout.activity_about_us1) {
  private val viewModel: AboutUs1VM by viewModels<AboutUs1VM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.aboutUs1VM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "ABOUT_US1ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AboutUs1Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
