package com.test_.app.modules.explore.`data`.model

import com.test_.app.R
import com.test_.app.appcomponents.di.MyApp
import kotlin.String

public data class ExploreRowModel(
  /**
   * TODO Replace with dynamic value
   */
  public val txtManShirt: String? = MyApp.getInstance().resources.getString(R.string.lbl_man_shirt)

)
