package com.test_.app.modules.dashboard.`data`.viewmodel

import androidx.lifecycle.ViewModel
import com.test_.app.modules.dashboard.`data`.model.DashboardModel
import com.test_.app.modules.explorebottombar.`data`.model.ExploreBottombarModel
import com.test_.app.modules.offerscreen.`data`.model.OfferScreenModel

public class DashboardVM : ViewModel() {
  public val dashboardModel: DashboardModel? = null

  public var includedModel: OfferScreenModel? = null

  public var included1Model: ExploreBottombarModel? = null
}
