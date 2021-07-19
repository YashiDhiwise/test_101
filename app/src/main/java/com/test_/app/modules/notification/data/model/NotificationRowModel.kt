package com.test_.app.modules.notification.`data`.model

import com.test_.app.R
import com.test_.app.appcomponents.di.MyApp
import kotlin.String

public data class NotificationRowModel(
  /**
   * TODO Replace with dynamic value
   */
  public val txtOffer: String? = MyApp.getInstance().resources.getString(R.string.lbl_offer)

)
