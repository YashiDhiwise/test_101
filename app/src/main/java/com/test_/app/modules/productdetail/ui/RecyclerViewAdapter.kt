package com.test_.app.modules.productdetail.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.test_.app.R
import com.test_.app.databinding.ComponentDashboardProduct01Binding
import com.test_.app.modules.dashboardproduct01.`data`.model.DashboardProduct01Model
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public val list: List<DashboardProduct01Model>
) : RecyclerView.Adapter<RecyclerViewAdapter.ComponentDashboardProduct01VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      ComponentDashboardProduct01VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.component_dashboard_product01,parent,false)
    return ComponentDashboardProduct01VH(view)
  }

  public override fun onBindViewHolder(holder: ComponentDashboardProduct01VH, position: Int): Unit {
    val dashboardProduct01Model = DashboardProduct01Model()
    // TODO uncomment following line after integration with data source
    // val dashboardProduct01Model = list[position]
    holder.binding.dashboardProduct01Model = dashboardProduct01Model
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: DashboardProduct01Model
    ): Unit {
    }
  }

  public inner class ComponentDashboardProduct01VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: ComponentDashboardProduct01Binding =
        ComponentDashboardProduct01Binding.bind(itemView)
  }
}
