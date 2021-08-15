package ru.inc.extendedrecycler.ui.viewholders

import ru.inc.extendedrecycler.R
import ru.inc.extendedrecycler.databinding.ItemSomeCardBinding
import ru.inc.extendedrecycler.models.CardColor
import ru.inc.extendedrecycler.models.MainItemContainer
import ru.inc.extendedrecycler.models.SomeCard

class CardViewHolder(private val view: ItemSomeCardBinding) : BaseViewHolder(view.root) {

    override fun bind(mainItemContainer: MainItemContainer) {
        view.card.setCardBackgroundColor(
            when ((mainItemContainer as SomeCard).color) {
                CardColor.COLOR_1 -> itemView.context.resources.getColor(R.color.color_1)
                CardColor.COLOR_2 -> itemView.context.resources.getColor(R.color.color_2)
                CardColor.COLOR_3 -> itemView.context.resources.getColor(R.color.color_3)
            }
        )
    }
}