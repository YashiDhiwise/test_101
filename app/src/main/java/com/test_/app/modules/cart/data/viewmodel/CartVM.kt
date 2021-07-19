package com.test_.app.modules.cart.`data`.viewmodel

import androidx.lifecycle.ViewModel
import com.test_.app.modules.cart.`data`.model.CartModel
import com.test_.app.modules.offerscreenbottombar.`data`.model.OfferScreenBottombarModel
import com.test_.app.modules.orderdetailstotalprice.`data`.model.OrderDetailsTotalPriceModel

public class CartVM : ViewModel() {
  public val cartModel: CartModel? = null

  public var includedModel: OrderDetailsTotalPriceModel? = null

  public var included1Model: OfferScreenBottombarModel? = null
}
