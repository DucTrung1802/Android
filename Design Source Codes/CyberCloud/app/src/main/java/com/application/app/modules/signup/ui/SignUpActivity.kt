package com.application.app.modules.signup.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivitySignUpBinding
import com.application.app.modules.signin.ui.SignInActivity
import com.application.app.modules.signup.`data`.model.SignUp1RowModel
import com.application.app.modules.signup.`data`.viewmodel.SignUpVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class SignUpActivity : BaseActivity<ActivitySignUpBinding>(R.layout.activity_sign_up) {
  private val viewModel: SignUpVM by viewModels<SignUpVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val recyclerSignUpAdapter =
    RecyclerSignUpAdapter(viewModel.recyclerSignUpList.value?:mutableListOf())
    binding.recyclerSignUp.adapter = recyclerSignUpAdapter
    recyclerSignUpAdapter.setOnItemClickListener(
    object : RecyclerSignUpAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : SignUp1RowModel) {
        onClickRecyclerSignUp(view, position, item)
      }
    }
    )
    viewModel.recyclerSignUpList.observe(this) {
      recyclerSignUpAdapter.updateData(it)
    }
    binding.signUpVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.btnRegister.setOnClickListener {
      val destIntent = SignInActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public fun onClickRecyclerSignUp(
    view: View,
    position: Int,
    item: SignUp1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "SIGN_UP_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SignUpActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
