package com.application.app.modules.contactus.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityContactUsBinding
import com.application.app.modules.contactus.`data`.viewmodel.ContactUsVM
import com.application.app.modules.userprofile.ui.UserProfileActivity
import kotlin.String
import kotlin.Unit

public class ContactUsActivity :
    BaseActivity<ActivityContactUsBinding>(R.layout.activity_contact_us) {
  private val viewModel: ContactUsVM by viewModels<ContactUsVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.contactUsVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.imageArrow1.setOnClickListener {
      val destIntent = UserProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "CONTACT_US_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ContactUsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
