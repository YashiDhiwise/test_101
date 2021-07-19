package com.test_.app.modules.cart.`data`.model

import com.test_.app.R
import com.test_.app.appcomponents.di.MyApp
import kotlin.String

public data class CartModel(
  /**
   * TODO Replace with dynamic value
   */
  public val txtApply: String? = MyApp.getInstance().resources.getString(R.string.lbl_apply)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etEnterCuponCodValue: String? = null
)
