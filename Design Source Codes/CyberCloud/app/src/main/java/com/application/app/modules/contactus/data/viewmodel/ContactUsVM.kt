package com.application.app.modules.contactus.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.contactus.`data`.model.ContactUsModel
import org.koin.core.KoinComponent

public class ContactUsVM : ViewModel(), KoinComponent {
  public val contactUsModel: MutableLiveData<ContactUsModel> = MutableLiveData(ContactUsModel())

  public var navArguments: Bundle? = null
}
