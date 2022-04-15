package com.application.app.modules.userprofile3.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityUserProfile3Binding
import com.application.app.modules.userprofile3.`data`.model.UserProfile4RowModel
import com.application.app.modules.userprofile3.`data`.model.UserProfile5RowModel
import com.application.app.modules.userprofile3.`data`.viewmodel.UserProfile3VM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class UserProfile3Activity :
    BaseActivity<ActivityUserProfile3Binding>(R.layout.activity_user_profile3) {
  private val viewModel: UserProfile3VM by viewModels<UserProfile3VM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val recyclerGroup1291Adapter =
    RecyclerGroup1291Adapter(viewModel.recyclerGroup1291List.value?:mutableListOf())
    binding.recyclerGroup1291.adapter = recyclerGroup1291Adapter
    recyclerGroup1291Adapter.setOnItemClickListener(
    object : RecyclerGroup1291Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : UserProfile4RowModel) {
        onClickRecyclerGroup1291(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup1291List.observe(this) {
      recyclerGroup1291Adapter.updateData(it)
    }
    val recyclerGroup1292Adapter =
    RecyclerGroup1292Adapter(viewModel.recyclerGroup1292List.value?:mutableListOf())
    binding.recyclerGroup1292.adapter = recyclerGroup1292Adapter
    recyclerGroup1292Adapter.setOnItemClickListener(
    object : RecyclerGroup1292Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : UserProfile5RowModel) {
        onClickRecyclerGroup1292(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup1292List.observe(this) {
      recyclerGroup1292Adapter.updateData(it)
    }
    binding.userProfile3VM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerGroup1291(
    view: View,
    position: Int,
    item: UserProfile4RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public fun onClickRecyclerGroup1292(
    view: View,
    position: Int,
    item: UserProfile5RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "USER_PROFILE3ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, UserProfile3Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
