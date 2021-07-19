package com.test_.app.modules.creditcardanddebit.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.test_.app.R
import com.test_.app.databinding.ComponentCreditCardAndDebitBinding
import com.test_.app.modules.creditcardanddebit.`data`.model.CreditCardAndDebitModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public val list: List<CreditCardAndDebitModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.ComponentCreditCardAndDebitVH>() {
  private var clickListener: OnItemClickListener? = null

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      ComponentCreditCardAndDebitVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.component_credit_card_and_debit,parent,false)
    return ComponentCreditCardAndDebitVH(view)
  }

  public override fun onBindViewHolder(holder: ComponentCreditCardAndDebitVH, position: Int): Unit {
    val creditCardAndDebitModel = CreditCardAndDebitModel()
    // TODO uncomment following line after integration with data source
    // val creditCardAndDebitModel = list[position]
    holder.binding.creditCardAndDebitModel = creditCardAndDebitModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: CreditCardAndDebitModel
    ): Unit {
    }
  }

  public inner class ComponentCreditCardAndDebitVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: ComponentCreditCardAndDebitBinding =
        ComponentCreditCardAndDebitBinding.bind(itemView)
    init {
      binding.linear.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, CreditCardAndDebitModel())
      }
    }
  }
}
