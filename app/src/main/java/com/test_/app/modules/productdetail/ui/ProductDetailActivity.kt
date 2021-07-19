package com.test_.app.modules.productdetail.ui

import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.test_.app.R
import com.test_.app.databinding.ActivityProductDetailBinding
import com.test_.app.modules.dashboardproduct01.`data`.model.DashboardProduct01Model
import com.test_.app.modules.productdetail.`data`.viewmodel.ProductDetailVM
import com.test_.app.modules.reviewproduct.ui.ReviewProductActivity
import com.test_.app.modules.search.ui.SearchActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class ProductDetailActivity : AppCompatActivity() {
  private lateinit var binding: ActivityProductDetailBinding

  private val viewModel: ProductDetailVM by viewModels<ProductDetailVM>()

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: DashboardProduct01Model
  ): Unit {
    when(view.id) {
    }
  }

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_product_detail)
    val recyclerViewAdapter = RecyclerViewAdapter(arrayListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
            object : RecyclerViewAdapter.OnItemClickListener {
                override fun onItemClick(view:View, position:Int, item : DashboardProduct01Model) {
                    onClickRecyclerView(view, position, item)
                }
            }
            )
    binding.lifecycleOwner = this
    binding.productDetailVM = viewModel
    binding.txtSeeMore.setOnClickListener {
      val destIntent = ReviewProductActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.image.setOnClickListener {
      val destIntent = SearchActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "PRODUCT_DETAIL_ACTIVITY"
  }
}
