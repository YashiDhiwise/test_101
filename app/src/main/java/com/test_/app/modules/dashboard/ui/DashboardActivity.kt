package com.test_.app.modules.dashboard.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.test_.app.R
import com.test_.app.databinding.ActivityDashboardBinding
import com.test_.app.modules.dashboard.`data`.viewmodel.DashboardVM
import com.test_.app.modules.dashboardproduct01.`data`.model.DashboardProduct01Model
import com.test_.app.modules.favoriteproduct.ui.FavoriteProductActivity
import com.test_.app.modules.listcategory.ui.ListCategoryActivity
import com.test_.app.modules.notification.ui.NotificationActivity
import com.test_.app.modules.offerscreen.ui.OfferScreenActivity
import com.test_.app.modules.offerscreenproduct01.`data`.model.OfferScreenProduct01Model
import com.test_.app.modules.search.ui.SearchActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class DashboardActivity : AppCompatActivity() {
  private lateinit var binding: ActivityDashboardBinding

  private val viewModel: DashboardVM by viewModels<DashboardVM>()

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: DashboardProduct01Model
  ): Unit {
    when(view.id) {
        }
  }

  public fun onClickRecyclerView1(
    view: View,
    position: Int,
    item: DashboardProduct01Model
  ): Unit {
    when(view.id) {
        }
  }

  public fun onClickRecyclerView2(
    view: View,
    position: Int,
    item: OfferScreenProduct01Model
  ): Unit {
    when(view.id) {
        }
  }

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_dashboard)
    val recyclerViewAdapter = RecyclerViewAdapter(arrayListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
                object : RecyclerViewAdapter.OnItemClickListener {
                    override fun onItemClick(view:View, position:Int, item :
        DashboardProduct01Model) {
                        onClickRecyclerView(view, position, item)
                    }
                }
                )
    val recyclerView1Adapter = RecyclerView1Adapter(arrayListOf())
    binding.recyclerView1.adapter = recyclerView1Adapter
    recyclerView1Adapter.setOnItemClickListener(
                object : RecyclerView1Adapter.OnItemClickListener {
                    override fun onItemClick(view:View, position:Int, item :
        DashboardProduct01Model) {
                        onClickRecyclerView1(view, position, item)
                    }
                }
                )
    val recyclerView2Adapter = RecyclerView2Adapter(arrayListOf())
    binding.recyclerView2.adapter = recyclerView2Adapter
    recyclerView2Adapter.setOnItemClickListener(
                object : RecyclerView2Adapter.OnItemClickListener {
                    override fun onItemClick(view:View, position:Int, item :
        OfferScreenProduct01Model)
            {
                        onClickRecyclerView2(view, position, item)
                    }
                }
                )
    binding.lifecycleOwner = this
    binding.dashboardVM = viewModel
    binding.image1.setOnClickListener {
          val destIntent = NotificationActivity.getIntent(this, null)
          startActivity(destIntent)
        }
    binding.txtSearchProduct.setOnClickListener {
          val destIntent = SearchActivity.getIntent(this, null)
          startActivity(destIntent)
        }
    binding.image.setOnClickListener {
          val destIntent = FavoriteProductActivity.getIntent(this, null)
          startActivity(destIntent)
        }
    binding.txtMoreCategory.setOnClickListener {
          val destIntent = ListCategoryActivity.getIntent(this, null)
          startActivity(destIntent)
        }
    binding.linear.setOnClickListener {
          val destIntent = OfferScreenActivity.getIntent(this, null)
          startActivity(destIntent)
        }
  }

  public companion object {
    public const val TAG: String = "DASHBOARD_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DashboardActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
