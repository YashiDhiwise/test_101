package com.test_.app.modules.account.`data`.model

import com.test_.app.R
import com.test_.app.appcomponents.di.MyApp
import kotlin.String

public data class AccountRowModel(
  /**
   * TODO Replace with dynamic value
   */
  public val txtProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)

)
