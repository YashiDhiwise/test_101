package com.test_.app.modules.searchresult.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.test_.app.R
import com.test_.app.databinding.ActivitySearchResultBinding
import com.test_.app.modules.filter.ui.FilterActivity
import com.test_.app.modules.offerscreenproduct01.`data`.model.OfferScreenProduct01Model
import com.test_.app.modules.searchresult.`data`.viewmodel.SearchResultVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class SearchResultActivity : AppCompatActivity() {
  private lateinit var binding: ActivitySearchResultBinding

  private val viewModel: SearchResultVM by viewModels<SearchResultVM>()

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: OfferScreenProduct01Model
  ): Unit {
    when(view.id) {
    }
  }

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_search_result)
    val recyclerViewAdapter = RecyclerViewAdapter(arrayListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
                object : RecyclerViewAdapter.OnItemClickListener {
                    override fun onItemClick(view:View, position:Int, item :
        OfferScreenProduct01Model)
            {
                        onClickRecyclerView(view, position, item)
                    }
                }
                )
    binding.lifecycleOwner = this
    binding.searchResultVM = viewModel
    binding.image.setOnClickListener {
    }
    binding.image1.setOnClickListener {
      val destIntent = FilterActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "SEARCH_RESULT_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SearchResultActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
