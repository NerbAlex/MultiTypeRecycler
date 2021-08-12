package ru.inc.extendedrecycler.ui.viewholders

import ru.inc.extendedrecycler.databinding.ItemTitleHeadBinding
import ru.inc.extendedrecycler.models.MainItemContainer

class TitleViewHolder(private val view: ItemTitleHeadBinding) : BaseViewHolder(view.root) {
    override fun bind(mainItemContainer: MainItemContainer) {

        view.titleHead.text = mainItemContainer.titleHead?.title
    }
}