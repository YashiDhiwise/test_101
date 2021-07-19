package com.test_.app.modules.listcategory.`data`.model

import com.test_.app.R
import com.test_.app.appcomponents.di.MyApp
import kotlin.String

public data class ListCategoryRowModel(
  /**
   * TODO Replace with dynamic value
   */
  public val txtShirt: String? = MyApp.getInstance().resources.getString(R.string.lbl_shirt)

)
