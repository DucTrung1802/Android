package com.application.app.modules.contactus1.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityContactUs1Binding
import com.application.app.modules.contactus1.`data`.viewmodel.ContactUs1VM
import kotlin.String
import kotlin.Unit

public class ContactUs1Activity :
    BaseActivity<ActivityContactUs1Binding>(R.layout.activity_contact_us1) {
  private val viewModel: ContactUs1VM by viewModels<ContactUs1VM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.contactUs1VM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "CONTACT_US1ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ContactUs1Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
