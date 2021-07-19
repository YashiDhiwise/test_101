package com.test_.app.modules.orderdetails.`data`.viewmodel

import androidx.lifecycle.ViewModel
import com.test_.app.modules.orderdetails.`data`.model.OrderDetailsModel
import com.test_.app.modules.orderdetailstotalprice.`data`.model.OrderDetailsTotalPriceModel

public class OrderDetailsVM : ViewModel() {
  public val orderDetailsModel: OrderDetailsModel? = null

  public var includedModel: OrderDetailsTotalPriceModel? = null
}
