package com.test_.app.modules.dashboard.`data`.model

import com.test_.app.R
import com.test_.app.appcomponents.di.MyApp
import kotlin.String

public data class DashboardModel(
  /**
   * TODO Replace with dynamic value
   */
  public val txtSearchProduct: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_search_product)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txtMoreCategory: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_more_category)

)
