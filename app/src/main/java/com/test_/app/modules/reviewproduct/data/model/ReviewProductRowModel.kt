package com.test_.app.modules.reviewproduct.`data`.model

import com.test_.app.R
import com.test_.app.appcomponents.di.MyApp
import kotlin.String

public data class ReviewProductRowModel(
  /**
   * TODO Replace with dynamic value
   */
  public val txtLauraOctavian: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_laura_octavian)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txtThisIsReally: String? =
      MyApp.getInstance().resources.getString(R.string.msg_this_is_really)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txtDecember1020: String? =
      MyApp.getInstance().resources.getString(R.string.msg_december_10_20)

)
