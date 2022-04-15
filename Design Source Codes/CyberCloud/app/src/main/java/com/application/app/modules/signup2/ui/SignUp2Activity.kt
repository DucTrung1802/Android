package com.application.app.modules.signup2.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivitySignUp2Binding
import com.application.app.modules.signup2.`data`.model.SignUp3RowModel
import com.application.app.modules.signup2.`data`.viewmodel.SignUp2VM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class SignUp2Activity : BaseActivity<ActivitySignUp2Binding>(R.layout.activity_sign_up2) {
  private val viewModel: SignUp2VM by viewModels<SignUp2VM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val recyclerSignUpAdapter =
    RecyclerSignUpAdapter(viewModel.recyclerSignUpList.value?:mutableListOf())
    binding.recyclerSignUp.adapter = recyclerSignUpAdapter
    recyclerSignUpAdapter.setOnItemClickListener(
    object : RecyclerSignUpAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : SignUp3RowModel) {
        onClickRecyclerSignUp(view, position, item)
      }
    }
    )
    viewModel.recyclerSignUpList.observe(this) {
      recyclerSignUpAdapter.updateData(it)
    }
    binding.signUp2VM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerSignUp(
    view: View,
    position: Int,
    item: SignUp3RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "SIGN_UP2ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SignUp2Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
