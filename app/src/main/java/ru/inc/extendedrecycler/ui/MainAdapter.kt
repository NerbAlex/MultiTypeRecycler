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

    companion object {
        const val TYPE_TITLE = 0
        const val TYPE_CARD = 1
        const val TYPE_ID = 2
    }

    var list: List<MainItemContainer> = mutableListOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return when (viewType) {
            TYPE_TITLE -> TitleViewHolder(ItemTitleHeadBinding.inflate(inflater, parent, false))
            TYPE_CARD -> CardViewHolder(ItemSomeCardBinding.inflate(inflater, parent, false))
            TYPE_ID -> IdViewHolder(ItemSomeListBinding.inflate(inflater, parent, false))
            else -> throw IllegalArgumentException("Unknown type")
        }
    }

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) = holder.bind(list[position])

    override fun getItemCount() = list.size

    override fun getItemViewType(position: Int): Int =
        when {
            list[position].titleHead != null -> TYPE_TITLE
            list[position].someCard != null -> TYPE_CARD
            list[position].someListItem != null -> TYPE_ID
            else -> throw IllegalArgumentException("unknown position")
        }
}