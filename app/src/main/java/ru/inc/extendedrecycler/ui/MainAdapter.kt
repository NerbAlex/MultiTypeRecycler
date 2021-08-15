package ru.inc.extendedrecycler.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.inc.extendedrecycler.databinding.ItemSomeCardBinding
import ru.inc.extendedrecycler.databinding.ItemSomeListBinding
import ru.inc.extendedrecycler.databinding.ItemTitleHeadBinding
import ru.inc.extendedrecycler.models.MainItemContainer
import ru.inc.extendedrecycler.ui.viewholders.BaseViewHolder
import ru.inc.extendedrecycler.ui.viewholders.CardViewHolder
import ru.inc.extendedrecycler.ui.viewholders.IdViewHolder
import ru.inc.extendedrecycler.ui.viewholders.TitleViewHolder

class MainAdapter : RecyclerView.Adapter<BaseViewHolder>() {

    var list: List<MainItemContainer> = mutableListOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return when (viewType) {
            MainItemContainer.TITLE_TYPE -> TitleViewHolder(ItemTitleHeadBinding.inflate(inflater, parent, false))
            MainItemContainer.CARD_TYPE -> CardViewHolder(ItemSomeCardBinding.inflate(inflater, parent, false))
            MainItemContainer.ID_TYPE -> IdViewHolder(ItemSomeListBinding.inflate(inflater, parent, false))
            else -> throw IllegalArgumentException("Unknown type")
        }
    }

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) = holder.bind(list[position])

    override fun getItemCount() = list.size

    override fun getItemViewType(position: Int) = list[position].getType()
}