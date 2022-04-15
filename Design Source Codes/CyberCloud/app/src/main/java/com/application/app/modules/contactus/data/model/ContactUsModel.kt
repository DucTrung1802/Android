package com.application.app.modules.contactus.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class ContactUsModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtNameCyberCloud: String? =
      MyApp.getInstance().resources.getString(R.string.msg_name_cybercloud)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLocationNBacl: String? =
      MyApp.getInstance().resources.getString(R.string.msg_location_n_bacl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtEmailcyberclou: String? =
      MyApp.getInstance().resources.getString(R.string.msg_email_cyberclou)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPhone0325643: String? =
      MyApp.getInstance().resources.getString(R.string.msg_phone_032_5643)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSendAMessage: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_send_a_message)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtWriteYourMess: String? =
      MyApp.getInstance().resources.getString(R.string.msg_write_your_mess)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etYourNameValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etYourEmailValue: String? = null
)
