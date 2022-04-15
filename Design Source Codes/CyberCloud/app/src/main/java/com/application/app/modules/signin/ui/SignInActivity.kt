package com.application.app.modules.signin.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivitySignInBinding
import com.application.app.modules.landingpage.ui.LandingPageActivity
import com.application.app.modules.signin.`data`.viewmodel.SignInVM
import com.application.app.modules.signup.ui.SignUpActivity
import kotlin.String
import kotlin.Unit

public class SignInActivity : BaseActivity<ActivitySignInBinding>(R.layout.activity_sign_in) {
  private val viewModel: SignInVM by viewModels<SignInVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signInVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.btnSignIn.setOnClickListener {
      val destIntent = LandingPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtSignUp.setOnClickListener {
      val destIntent = SignUpActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "SIGN_IN_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SignInActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
