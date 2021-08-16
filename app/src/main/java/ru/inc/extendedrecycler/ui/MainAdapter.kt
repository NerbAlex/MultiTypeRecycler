package ru.inc.extendedrecycler.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.inc.extendedrecycler.databinding.ItemSomeCardBinding
import ru.inc.extendedrecycler.databinding.ItemSomeListBinding
import ru.inc.extendedrecycler.databinding.ItemTitleHeadBinding
import ru.inc.extendedrecycler.models.MainItemContainer
import ru.inc.extendedrecycler.models.MainItemContainer.Companion.CARD_TYPE
import ru.inc.extendedrecycler.models.MainItemContainer.Companion.ID_TYPE
import ru.inc.extendedrecycler.models.MainItemContainer.Companion.TITLE_TYPE
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
        LayoutInflater.from(parent.context).let {
            return when (viewType) {
                TITLE_TYPE -> TitleViewHolder(ItemTitleHeadBinding.inflate(it, parent, false))
                CARD_TYPE -> CardViewHolder(ItemSomeCardBinding.inflate(it, parent, false))
                ID_TYPE -> IdViewHolder(ItemSomeListBinding.inflate(it, parent, false))
                else -> throw IllegalArgumentException("Unknown type $viewType")
            }
        }
    }

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) = holder.bind(list[position])

    override fun getItemViewType(position: Int) = list[position].getType()

    override fun getItemCount() = list.size
}