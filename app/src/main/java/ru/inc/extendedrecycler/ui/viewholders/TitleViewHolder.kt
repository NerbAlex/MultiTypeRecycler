package ru.inc.extendedrecycler.ui.viewholders

import ru.inc.extendedrecycler.databinding.ItemTitleHeadBinding
import ru.inc.extendedrecycler.models.MainItemContainer
import ru.inc.extendedrecycler.models.TitleHead

class TitleViewHolder(private val view: ItemTitleHeadBinding) : BaseViewHolder(view.root) {

    override fun bind(mainItemContainer: MainItemContainer) {
        view.titleHead.text = (mainItemContainer as TitleHead).title
    }
}