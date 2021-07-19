package com.test_.app.modules.explore.`data`.viewmodel

import androidx.lifecycle.ViewModel
import com.test_.app.modules.explore.`data`.model.ExploreModel
import com.test_.app.modules.explorebottombar.`data`.model.ExploreBottombarModel

public class ExploreVM : ViewModel() {
  public val exploreModel: ExploreModel? = null

  public var includedModel: ExploreBottombarModel? = null
}
