package com.test_.app.modules.explore.`data`.model

import com.test_.app.R
import com.test_.app.appcomponents.di.MyApp
import kotlin.String

public data class ExploreModel(
  /**
   * TODO Replace with dynamic value
   */
  public val txtWomanFashion: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_woman_fashion)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etSearchProductValue: String? = null
)
