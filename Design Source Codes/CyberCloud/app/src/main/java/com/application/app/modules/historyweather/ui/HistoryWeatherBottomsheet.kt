package com.application.app.modules.historyweather.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseBottomsheetDialogFragment
import com.application.app.databinding.BottomsheetHistoryWeatherBinding
import com.application.app.modules.dailyweather.ui.DailyWeatherActivity
import com.application.app.modules.groundwaterlevel.ui.GroundWaterLevelActivity
import com.application.app.modules.historyweather.`data`.model.HistoryWeather1RowModel
import com.application.app.modules.historyweather.`data`.viewmodel.HistoryWeatherVM
import com.application.app.modules.landingpage.ui.LandingPageActivity
import com.application.app.modules.radar.ui.RadarActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class HistoryWeatherBottomsheet :
    BaseBottomsheetDialogFragment<BottomsheetHistoryWeatherBinding>(R.layout.bottomsheet_history_weather)
    {
  private val viewModel: HistoryWeatherVM by viewModels<HistoryWeatherVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val recyclerHistoryWeatherAdapter =
    RecyclerHistoryWeatherAdapter(viewModel.recyclerHistoryWeatherList.value?:mutableListOf())
    binding.recyclerHistoryWeather.adapter = recyclerHistoryWeatherAdapter
    recyclerHistoryWeatherAdapter.setOnItemClickListener(
    object : RecyclerHistoryWeatherAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : HistoryWeather1RowModel) {
        onClickRecyclerHistoryWeather(view, position, item)
      }
    }
    )
    viewModel.recyclerHistoryWeatherList.observe(requireActivity()) {
      recyclerHistoryWeatherAdapter.updateData(it)
    }
    binding.historyWeatherVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.imageHut1.setOnClickListener {
      val destIntent = LandingPageActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      dismiss()
    }
    binding.imageArrow1.setOnClickListener {
      val destIntent = DailyWeatherActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      dismiss()
    }
    binding.imageWaterlevel.setOnClickListener {
      val destIntent = GroundWaterLevelActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      dismiss()
    }
    binding.imageRadar.setOnClickListener {
      val destIntent = RadarActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      dismiss()
    }
    binding.imageCalendar11.setOnClickListener {
      val destIntent = DailyWeatherActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      dismiss()
    }
  }

  public fun onClickRecyclerHistoryWeather(
    view: View,
    position: Int,
    item: HistoryWeather1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "HISTORY_WEATHER_BOTTOMSHEET"
  }
}
