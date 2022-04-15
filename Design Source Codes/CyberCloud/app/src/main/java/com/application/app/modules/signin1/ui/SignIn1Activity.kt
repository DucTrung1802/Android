package com.application.app.modules.signin1.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivitySignIn1Binding
import com.application.app.modules.landingpage1.ui.LandingPage1Activity
import com.application.app.modules.signin1.`data`.viewmodel.SignIn1VM
import com.application.app.modules.signup2.ui.SignUp2Activity
import kotlin.String
import kotlin.Unit

public class SignIn1Activity : BaseActivity<ActivitySignIn1Binding>(R.layout.activity_sign_in1) {
  private val viewModel: SignIn1VM by viewModels<SignIn1VM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signIn1VM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.txtSignUp.setOnClickListener {
      val destIntent = SignUp2Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnSignIn.setOnClickListener {
      val destIntent = LandingPage1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "SIGN_IN1ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SignIn1Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
