package com.test_.app.modules.offerscreen1.`data`.viewmodel

import androidx.lifecycle.ViewModel
import com.test_.app.modules.offerscreen.`data`.model.OfferScreenModel
import com.test_.app.modules.offerscreen1.`data`.model.OfferScreen1Model
import com.test_.app.modules.offerscreenbottombar.`data`.model.OfferScreenBottombarModel

public class OfferScreen1VM : ViewModel() {
  public val offerScreen1Model: OfferScreen1Model? = null

  public var includedModel: OfferScreenModel? = null

  public var included1Model: OfferScreenBottombarModel? = null
}
