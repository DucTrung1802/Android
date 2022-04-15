package com.application.app.modules.settings1.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivitySettings1Binding
import com.application.app.modules.settings1.`data`.viewmodel.Settings1VM
import kotlin.String
import kotlin.Unit

public class Settings1Activity : BaseActivity<ActivitySettings1Binding>(R.layout.activity_settings1)
    {
  private val viewModel: Settings1VM by viewModels<Settings1VM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.settings1VM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "SETTINGS1ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Settings1Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
