package com.application.app.modules.dailyweathernext.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityDailyWeatherNextBinding
import com.application.app.modules.dailyweathernext.`data`.model.DailyWeatherNext1RowModel
import com.application.app.modules.dailyweathernext.`data`.viewmodel.DailyWeatherNextVM
import com.application.app.modules.landingpage1.ui.LandingPage1Activity
import com.application.app.modules.radar1.ui.Radar1Activity
import com.application.app.modules.tips1.ui.Tips1Activity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class DailyWeatherNextActivity :
    BaseActivity<ActivityDailyWeatherNextBinding>(R.layout.activity_daily_weather_next) {
  private val viewModel: DailyWeatherNextVM by viewModels<DailyWeatherNextVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val recyclerDailyWeatherNextAdapter =
    RecyclerDailyWeatherNextAdapter(viewModel.recyclerDailyWeatherNextList.value?:mutableListOf())
    binding.recyclerDailyWeatherNext.adapter = recyclerDailyWeatherNextAdapter
    recyclerDailyWeatherNextAdapter.setOnItemClickListener(
    object : RecyclerDailyWeatherNextAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : DailyWeatherNext1RowModel) {
        onClickRecyclerDailyWeatherNext(view, position, item)
      }
    }
    )
    viewModel.recyclerDailyWeatherNextList.observe(this) {
      recyclerDailyWeatherNextAdapter.updateData(it)
    }
    binding.dailyWeatherNextVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.imageRadar.setOnClickListener {
      val destIntent = Radar1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageEmergencycall.setOnClickListener {
      val destIntent = Tips1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageHut1.setOnClickListener {
      val destIntent = LandingPage1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public fun onClickRecyclerDailyWeatherNext(
    view: View,
    position: Int,
    item: DailyWeatherNext1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "DAILY_WEATHER_NEXT_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DailyWeatherNextActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
