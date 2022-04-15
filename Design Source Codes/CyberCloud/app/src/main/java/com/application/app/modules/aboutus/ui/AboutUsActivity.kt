package com.application.app.modules.aboutus.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityAboutUsBinding
import com.application.app.modules.aboutus.`data`.viewmodel.AboutUsVM
import com.application.app.modules.userprofile.ui.UserProfileActivity
import kotlin.String
import kotlin.Unit

public class AboutUsActivity : BaseActivity<ActivityAboutUsBinding>(R.layout.activity_about_us) {
  private val viewModel: AboutUsVM by viewModels<AboutUsVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.aboutUsVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.imageArrow1.setOnClickListener {
      val destIntent = UserProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "ABOUT_US_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AboutUsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
