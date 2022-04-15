package com.application.app.modules.contactus1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.contactus1.`data`.model.ContactUs1Model
import org.koin.core.KoinComponent

public class ContactUs1VM : ViewModel(), KoinComponent {
  public val contactUs1Model: MutableLiveData<ContactUs1Model> = MutableLiveData(ContactUs1Model())

  public var navArguments: Bundle? = null
}
