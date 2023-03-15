package de.herrpaul.dz15032023

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PersonAdapter : RecyclerView.Adapter<PersonAdapter.ViewHolder> {

    private val inflater : LayoutInflater
    private val persons : List<Person>;

    constructor(context : Context, persons : List<Person>) {
        this.persons = persons
        this.inflater = LayoutInflater.from(context)
    }

    class ViewHolder : RecyclerView.ViewHolder {
        val ivPhoto : ImageView
        val tvName : TextView

        constructor(itemView: View) : super(itemView) {
            ivPhoto = itemView.findViewById(R.id.ivPhoto);
            tvName = itemView.findViewById(R.id.tvName);
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(inflater.inflate(R.layout.politiker_item, parent, false))
    }

    override fun getItemCount(): Int {
        return persons.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val p = persons[position]
        holder.tvName.text = p.name
        holder.ivPhoto.setImageResource(p.photo)
    }
}