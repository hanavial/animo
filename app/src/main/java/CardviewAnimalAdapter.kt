import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.animo.DetailAnimalActivity
import com.example.animo.R
import java.util.*
import kotlin.collections.ArrayList

class CardviewAnimalAdapter(private val listAnimals: ArrayList<Animal>) : RecyclerView.Adapter<CardviewAnimalAdapter.CardViewViewHolder>() {


    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): CardViewViewHolder{
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_cardview_animal, viewGroup, false)
        return CardViewViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listAnimals.size
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val animal = listAnimals[position]

        Glide.with(holder.itemView.context)
            .load(animal.photo)
            .apply(RequestOptions())
            .into(holder.imgPhoto)

        holder.tvName.text = animal.name
        holder.tvDetail.text = animal.detail

        val aContext = holder.itemView.context

        holder.itemView.setOnClickListener{
            val detailMode = Intent(aContext, DetailAnimalActivity::class.java)
            detailMode.putExtra(DetailAnimalActivity.EXTRA_NAME, animal.name)
            detailMode.putExtra(DetailAnimalActivity.EXTRA_DETAIL, animal.detail)
            detailMode.putExtra(DetailAnimalActivity.EXTRA_PHOTO, animal.photo)
            aContext.startActivity(detailMode)
        }
    }

    inner class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
    }


}


