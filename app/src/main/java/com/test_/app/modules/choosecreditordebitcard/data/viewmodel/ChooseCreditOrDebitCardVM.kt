package com.test_.app.modules.choosecreditordebitcard.`data`.viewmodel

import androidx.lifecycle.ViewModel
import com.test_.app.modules.choosecreditordebitcard.`data`.model.ChooseCreditOrDebitCardModel
import com.test_.app.modules.creditcardanddebit.`data`.model.CreditCardAndDebitModel
import com.test_.app.modules.shipto.`data`.model.ShipToModel

public class ChooseCreditOrDebitCardVM : ViewModel() {
  public val chooseCreditOrDebitCardModel: ChooseCreditOrDebitCardModel? = null

  public var includedModel: ShipToModel? = null

  public var included1Model: CreditCardAndDebitModel? = null
}
