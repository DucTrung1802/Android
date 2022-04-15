package com.application.app.modules.emergencycontacts2.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityEmergencyContacts2Binding
import com.application.app.modules.emergencycontacts2.`data`.viewmodel.EmergencyContacts2VM
import com.google.android.material.tabs.TabLayoutMediator
import kotlin.String
import kotlin.Unit

public class EmergencyContacts2Activity :
    BaseActivity<ActivityEmergencyContacts2Binding>(R.layout.activity_emergency_contacts2) {
  private val viewModel: EmergencyContacts2VM by viewModels<EmergencyContacts2VM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.emergencyContacts2VM = viewModel
    val adapter = EmergencyContacts2ActivityPagerAdapter(supportFragmentManager,lifecycle)
    binding.viewPagerGroup334.adapter = adapter
    TabLayoutMediator(binding.tabLayoutGroup27,binding.viewPagerGroup334) { tab, position ->
      tab.text = EmergencyContacts2ActivityPagerAdapter.title[position]
      }.attach()
    }

    public override fun setUpClicks(): Unit {
    }

    public companion object {
      public const val TAG: String = "EMERGENCY_CONTACTS2ACTIVITY"

      public fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, EmergencyContacts2Activity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
