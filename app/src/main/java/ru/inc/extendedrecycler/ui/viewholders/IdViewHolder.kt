package ru.inc.extendedrecycler.ui.viewholders

import ru.inc.extendedrecycler.databinding.ItemSomeListBinding
import ru.inc.extendedrecycler.models.MainItemContainer

class IdViewHolder(private val view: ItemSomeListBinding) : BaseViewHolder(view.root) {
    override fun bind(mainItemContainer: MainItemContainer) {

        view.id.text = mainItemContainer.someListItem?.id.toString()
    }
}