package com.test_.app.modules.login.`data`.model

import com.test_.app.R
import com.test_.app.appcomponents.di.MyApp
import kotlin.String

public data class LoginModel(
  /**
   * TODO Replace with dynamic value
   */
  public val txtDonTHaveA: String? =
      MyApp.getInstance().resources.getString(R.string.msg_don_t_have_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etYourEmailValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etPasswordValue: String? = null
)
