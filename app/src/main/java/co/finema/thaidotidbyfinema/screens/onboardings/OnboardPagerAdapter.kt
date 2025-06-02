package co.finema.thaidotidbyfinema.screens.onboardings

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import co.finema.thaidotidbyfinema.R

class OnboardPagerAdapter(private val items: List<TipsData>) :
    RecyclerView.Adapter<OnboardPagerAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val topImageView: ImageView = itemView.findViewById<ImageView>(R.id.page_image)
        val textViewHead: TextView = itemView.findViewById<TextView>(R.id.page_head)
        val textViewBody: TextView = itemView.findViewById<TextView>(R.id.page_body)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.onboard_pager_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.topImageView.setImageResource(items[position].imageResource)
        holder.textViewHead.setText(items[position].head)
        holder.textViewBody.setText(items[position].body)
    }

    override fun getItemCount() = items.size
}
