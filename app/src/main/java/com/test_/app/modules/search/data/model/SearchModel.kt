package com.test_.app.modules.search.`data`.model

import com.test_.app.R
import com.test_.app.appcomponents.di.MyApp
import kotlin.String

public data class SearchModel(
  /**
   * TODO Replace with dynamic value
   */
  public val txtNikeAirMax27: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nike_air_max_27)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etNikeAirMaxValue: String? = null
)
