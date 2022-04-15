package com.application.app.modules.historyweather2.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseBottomsheetDialogFragment
import com.application.app.databinding.BottomsheetHistoryWeather2Binding
import com.application.app.modules.dailyweather.ui.DailyWeatherActivity
import com.application.app.modules.groundwaterlevel.ui.GroundWaterLevelActivity
import com.application.app.modules.historyweather2.`data`.model.HistoryWeather3RowModel
import com.application.app.modules.historyweather2.`data`.viewmodel.HistoryWeather2VM
import com.application.app.modules.landingpage.ui.LandingPageActivity
import com.application.app.modules.monthlyweather.ui.MonthlyWeatherActivity
import com.application.app.modules.radar.ui.RadarActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class HistoryWeather2Bottomsheet :
    BaseBottomsheetDialogFragment<BottomsheetHistoryWeather2Binding>(R.layout.bottomsheet_history_weather_2)
    {
  private val viewModel: HistoryWeather2VM by viewModels<HistoryWeather2VM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val recyclerGroup753Adapter =
    RecyclerGroup753Adapter(viewModel.recyclerGroup753List.value?:mutableListOf())
    binding.recyclerGroup753.adapter = recyclerGroup753Adapter
    recyclerGroup753Adapter.setOnItemClickListener(
    object : RecyclerGroup753Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : HistoryWeather3RowModel) {
        onClickRecyclerGroup753(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup753List.observe(requireActivity()) {
      recyclerGroup753Adapter.updateData(it)
    }
    binding.historyWeather2VM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.imageRadar.setOnClickListener {
      val destIntent = RadarActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      dismiss()
    }
    binding.imageHut1.setOnClickListener {
      val destIntent = LandingPageActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      dismiss()
    }
    binding.imageCalendar11.setOnClickListener {
      val destIntent = DailyWeatherActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      dismiss()
    }
    binding.imageWaterlevel.setOnClickListener {
      val destIntent = GroundWaterLevelActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      dismiss()
    }
    binding.imageArrow1.setOnClickListener {
      val destIntent = MonthlyWeatherActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      dismiss()
    }
  }

  public fun onClickRecyclerGroup753(
    view: View,
    position: Int,
    item: HistoryWeather3RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "HISTORY_WEATHER2BOTTOMSHEET"
  }
}
