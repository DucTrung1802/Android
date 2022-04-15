package com.application.app.modules.monthlyweather.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityMonthlyWeatherBinding
import com.application.app.modules.dailyweather.ui.DailyWeatherActivity
import com.application.app.modules.groundwaterlevel.ui.GroundWaterLevelActivity
import com.application.app.modules.landingpage.ui.LandingPageActivity
import com.application.app.modules.monthlyweather.`data`.model.MonthlyWeather1RowModel
import com.application.app.modules.monthlyweather.`data`.model.MonthlyWeather2RowModel
import com.application.app.modules.monthlyweather.`data`.viewmodel.MonthlyWeatherVM
import com.application.app.modules.radar.ui.RadarActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class MonthlyWeatherActivity :
    BaseActivity<ActivityMonthlyWeatherBinding>(R.layout.activity_monthly_weather) {
  private val viewModel: MonthlyWeatherVM by viewModels<MonthlyWeatherVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val recyclerGroup880Adapter =
    RecyclerGroup880Adapter(viewModel.recyclerGroup880List.value?:mutableListOf())
    binding.recyclerGroup880.adapter = recyclerGroup880Adapter
    recyclerGroup880Adapter.setOnItemClickListener(
    object : RecyclerGroup880Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : MonthlyWeather1RowModel) {
        onClickRecyclerGroup880(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup880List.observe(this) {
      recyclerGroup880Adapter.updateData(it)
    }
    val recyclerGroup879Adapter =
    RecyclerGroup879Adapter(viewModel.recyclerGroup879List.value?:mutableListOf())
    binding.recyclerGroup879.adapter = recyclerGroup879Adapter
    recyclerGroup879Adapter.setOnItemClickListener(
    object : RecyclerGroup879Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : MonthlyWeather2RowModel) {
        onClickRecyclerGroup879(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup879List.observe(this) {
      recyclerGroup879Adapter.updateData(it)
    }
    binding.monthlyWeatherVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.txtBYDAY.setOnClickListener {
      val destIntent = DailyWeatherActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageWaterlevel.setOnClickListener {
      val destIntent = GroundWaterLevelActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageHut1.setOnClickListener {
      val destIntent = LandingPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRadar.setOnClickListener {
      val destIntent = RadarActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageCalendar11.setOnClickListener {
      val destIntent = DailyWeatherActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public fun onClickRecyclerGroup880(
    view: View,
    position: Int,
    item: MonthlyWeather1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public fun onClickRecyclerGroup879(
    view: View,
    position: Int,
    item: MonthlyWeather2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "MONTHLY_WEATHER_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MonthlyWeatherActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
