package com.application.app.modules.userprofile.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityUserProfileBinding
import com.application.app.modules.aboutus.ui.AboutUsActivity
import com.application.app.modules.userprofile.`data`.model.UserProfile1RowModel
import com.application.app.modules.userprofile.`data`.model.UserProfile2RowModel
import com.application.app.modules.userprofile.`data`.viewmodel.UserProfileVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class UserProfileActivity :
    BaseActivity<ActivityUserProfileBinding>(R.layout.activity_user_profile) {
  private val viewModel: UserProfileVM by viewModels<UserProfileVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val recyclerGroup197Adapter =
    RecyclerGroup197Adapter(viewModel.recyclerGroup197List.value?:mutableListOf())
    binding.recyclerGroup197.adapter = recyclerGroup197Adapter
    recyclerGroup197Adapter.setOnItemClickListener(
    object : RecyclerGroup197Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : UserProfile1RowModel) {
        onClickRecyclerGroup197(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup197List.observe(this) {
      recyclerGroup197Adapter.updateData(it)
    }
    val recyclerGroup198Adapter =
    RecyclerGroup198Adapter(viewModel.recyclerGroup198List.value?:mutableListOf())
    binding.recyclerGroup198.adapter = recyclerGroup198Adapter
    recyclerGroup198Adapter.setOnItemClickListener(
    object : RecyclerGroup198Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : UserProfile2RowModel) {
        onClickRecyclerGroup198(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup198List.observe(this) {
      recyclerGroup198Adapter.updateData(it)
    }
    binding.userProfileVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerGroup197(
    view: View,
    position: Int,
    item: UserProfile1RowModel
  ): Unit {
    when(view.id) {
      R.id.imageRightarrow3 -> {
        val destIntent = AboutUsActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      R.id.linearAboutUs -> {
        val destIntent = AboutUsActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  public fun onClickRecyclerGroup198(
    view: View,
    position: Int,
    item: UserProfile2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "USER_PROFILE_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, UserProfileActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
