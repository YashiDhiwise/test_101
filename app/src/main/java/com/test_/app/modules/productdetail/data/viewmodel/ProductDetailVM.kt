package com.test_.app.modules.productdetail.`data`.viewmodel

import androidx.lifecycle.ViewModel
import com.test_.app.modules.productdetail.`data`.model.ProductDetailModel
import com.test_.app.modules.reviewproductreiview01.`data`.model.ReviewProductReiview01Model

public class ProductDetailVM : ViewModel() {
  public val productDetailModel: ProductDetailModel? = null

  public var includedModel: ReviewProductReiview01Model? = null
}
