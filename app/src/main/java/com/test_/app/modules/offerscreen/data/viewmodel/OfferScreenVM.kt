package com.test_.app.modules.offerscreen.`data`.viewmodel

import androidx.lifecycle.ViewModel
import com.test_.app.modules.offerscreen.`data`.model.OfferScreenModel
import com.test_.app.modules.shipto.`data`.model.ShipToModel

public class OfferScreenVM : ViewModel() {
  public val offerScreenModel: OfferScreenModel? = null

  public var includedModel: ShipToModel? = null

  public var included1Model: OfferScreenModel? = null
}
