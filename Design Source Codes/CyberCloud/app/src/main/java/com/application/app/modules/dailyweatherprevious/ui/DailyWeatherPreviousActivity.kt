package com.application.app.modules.dailyweatherprevious.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityDailyWeatherPreviousBinding
import com.application.app.modules.dailyweatherprevious.`data`.model.DailyWeatherPrevious1RowModel
import com.application.app.modules.dailyweatherprevious.`data`.viewmodel.DailyWeatherPreviousVM
import com.application.app.modules.landingpage1.ui.LandingPage1Activity
import com.application.app.modules.radar1.ui.Radar1Activity
import com.application.app.modules.tips1.ui.Tips1Activity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class DailyWeatherPreviousActivity :
    BaseActivity<ActivityDailyWeatherPreviousBinding>(R.layout.activity_daily_weather_previous) {
  private val viewModel: DailyWeatherPreviousVM by viewModels<DailyWeatherPreviousVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val recyclerDailyWeatherPreviousAdapter =
    RecyclerDailyWeatherPreviousAdapter(viewModel.recyclerDailyWeatherPreviousList.value?:mutableListOf())
    binding.recyclerDailyWeatherPrevious.adapter = recyclerDailyWeatherPreviousAdapter
    recyclerDailyWeatherPreviousAdapter.setOnItemClickListener(
    object : RecyclerDailyWeatherPreviousAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      DailyWeatherPrevious1RowModel) {
        onClickRecyclerDailyWeatherPrevious(view, position, item)
      }
    }
    )
    viewModel.recyclerDailyWeatherPreviousList.observe(this) {
      recyclerDailyWeatherPreviousAdapter.updateData(it)
    }
    binding.dailyWeatherPreviousVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.imageEmergencycall.setOnClickListener {
      val destIntent = Tips1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageHut1.setOnClickListener {
      val destIntent = LandingPage1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRadar.setOnClickListener {
      val destIntent = Radar1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public fun onClickRecyclerDailyWeatherPrevious(
    view: View,
    position: Int,
    item: DailyWeatherPrevious1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "DAILY_WEATHER_PREVIOUS_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DailyWeatherPreviousActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
