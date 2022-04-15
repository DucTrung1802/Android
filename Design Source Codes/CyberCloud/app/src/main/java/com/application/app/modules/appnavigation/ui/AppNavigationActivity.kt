package com.application.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityAppNavigationBinding
import com.application.app.modules.aboutus.ui.AboutUsActivity
import com.application.app.modules.aboutus1.ui.AboutUs1Activity
import com.application.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.application.app.modules.contactus.ui.ContactUsActivity
import com.application.app.modules.contactus1.ui.ContactUs1Activity
import com.application.app.modules.dailyweather.ui.DailyWeatherActivity
import com.application.app.modules.dailyweathernext.ui.DailyWeatherNextActivity
import com.application.app.modules.dailyweatherprevious.ui.DailyWeatherPreviousActivity
import com.application.app.modules.emergencycontacts2.ui.EmergencyContacts2Activity
import com.application.app.modules.evacuationareas.ui.EvacuationAreasActivity
import com.application.app.modules.groundwaterlevel.ui.GroundWaterLevelActivity
import com.application.app.modules.landingpage.ui.LandingPageActivity
import com.application.app.modules.landingpage1.ui.LandingPage1Activity
import com.application.app.modules.monthlyweather.ui.MonthlyWeatherActivity
import com.application.app.modules.radar.ui.RadarActivity
import com.application.app.modules.radar1.ui.Radar1Activity
import com.application.app.modules.settings.ui.SettingsActivity
import com.application.app.modules.settings1.ui.Settings1Activity
import com.application.app.modules.signin.ui.SignInActivity
import com.application.app.modules.signin1.ui.SignIn1Activity
import com.application.app.modules.signup.ui.SignUpActivity
import com.application.app.modules.signup2.ui.SignUp2Activity
import com.application.app.modules.specificevacarea.ui.SpecificEvacAreaActivity
import com.application.app.modules.splashscreen.ui.SplashScreenActivity
import com.application.app.modules.splashscreen1.ui.SplashScreen1Activity
import com.application.app.modules.tips.ui.TipsActivity
import com.application.app.modules.tips1.ui.Tips1Activity
import com.application.app.modules.userprofile.ui.UserProfileActivity
import com.application.app.modules.userprofile3.ui.UserProfile3Activity
import kotlin.String
import kotlin.Unit

public class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.appNavigationVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.linearDailyWeatherPrevious.setOnClickListener {
      val destIntent = DailyWeatherPreviousActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearGroundwaterLevel.setOnClickListener {
      val destIntent = GroundWaterLevelActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearEvacuationAreas.setOnClickListener {
      val destIntent = EvacuationAreasActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearDailyWeatherNext.setOnClickListener {
      val destIntent = DailyWeatherNextActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearMonthlyWeather.setOnClickListener {
      val destIntent = MonthlyWeatherActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSignUp.setOnClickListener {
      val destIntent = SignUpActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRadar.setOnClickListener {
      val destIntent = RadarActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSignUp1.setOnClickListener {
      val destIntent = SignUp2Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearAboutUs.setOnClickListener {
      val destIntent = AboutUsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearContactUs1.setOnClickListener {
      val destIntent = ContactUs1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearUserProfile.setOnClickListener {
      val destIntent = UserProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearTips1.setOnClickListener {
      val destIntent = Tips1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRadar1.setOnClickListener {
      val destIntent = Radar1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearContactUs.setOnClickListener {
      val destIntent = ContactUsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSettings.setOnClickListener {
      val destIntent = SettingsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearDailyWeather.setOnClickListener {
      val destIntent = DailyWeatherActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSplashScreen1.setOnClickListener {
      val destIntent = SplashScreen1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSignIn.setOnClickListener {
      val destIntent = SignInActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearUserProfile1.setOnClickListener {
      val destIntent = UserProfile3Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSignIn1.setOnClickListener {
      val destIntent = SignIn1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearLandingPage1.setOnClickListener {
      val destIntent = LandingPage1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSpecificEvacArea.setOnClickListener {
      val destIntent = SpecificEvacAreaActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearLandingPage.setOnClickListener {
      val destIntent = LandingPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearAboutUs1.setOnClickListener {
      val destIntent = AboutUs1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSplashScreen.setOnClickListener {
      val destIntent = SplashScreenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSettings1.setOnClickListener {
      val destIntent = Settings1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearEmergencyContacts.setOnClickListener {
      val destIntent = EmergencyContacts2Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearTips.setOnClickListener {
      val destIntent = TipsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "APP_NAVIGATION_ACTIVITY"
  }
}
