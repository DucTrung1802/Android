package com.application.app.modules.dailyweather.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityDailyWeatherBinding
import com.application.app.modules.dailyweather.`data`.model.DailyWeather1RowModel
import com.application.app.modules.dailyweather.`data`.viewmodel.DailyWeatherVM
import com.application.app.modules.groundwaterlevel.ui.GroundWaterLevelActivity
import com.application.app.modules.landingpage.ui.LandingPageActivity
import com.application.app.modules.monthlyweather.ui.MonthlyWeatherActivity
import com.application.app.modules.radar.ui.RadarActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class DailyWeatherActivity :
    BaseActivity<ActivityDailyWeatherBinding>(R.layout.activity_daily_weather) {
  private val viewModel: DailyWeatherVM by viewModels<DailyWeatherVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val recyclerDailyWeatherAdapter =
    RecyclerDailyWeatherAdapter(viewModel.recyclerDailyWeatherList.value?:mutableListOf())
    binding.recyclerDailyWeather.adapter = recyclerDailyWeatherAdapter
    recyclerDailyWeatherAdapter.setOnItemClickListener(
    object : RecyclerDailyWeatherAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : DailyWeather1RowModel) {
        onClickRecyclerDailyWeather(view, position, item)
      }
    }
    )
    viewModel.recyclerDailyWeatherList.observe(this) {
      recyclerDailyWeatherAdapter.updateData(it)
    }
    binding.dailyWeatherVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.imageHut1.setOnClickListener {
      val destIntent = LandingPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageWaterlevel.setOnClickListener {
      val destIntent = GroundWaterLevelActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRadar.setOnClickListener {
      val destIntent = RadarActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtBYMONTH.setOnClickListener {
      val destIntent = MonthlyWeatherActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageSignin.setOnClickListener {
      val destIntent = MonthlyWeatherActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public fun onClickRecyclerDailyWeather(
    view: View,
    position: Int,
    item: DailyWeather1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "DAILY_WEATHER_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DailyWeatherActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
