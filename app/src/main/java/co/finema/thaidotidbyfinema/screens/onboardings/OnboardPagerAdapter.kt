package co.finema.thaidotidbyfinema.screens.onboardings

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import co.finema.thaidotidbyfinema.R

class OnboardPagerAdapter(private val items: List<TipsData>) :
    RecyclerView.Adapter<OnboardPagerAdapter.ViewHolder>() {

  inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val textView: TextView = itemView.findViewById(R.id.textView3)
  }

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    val view =
        LayoutInflater.from(parent.context).inflate(R.layout.onboard_pager_item, parent, false)
    return ViewHolder(view)
  }

  override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    holder.textView.text = holder.itemView.context.getString(items[position].head)
  }

  override fun getItemCount() = items.size
}
