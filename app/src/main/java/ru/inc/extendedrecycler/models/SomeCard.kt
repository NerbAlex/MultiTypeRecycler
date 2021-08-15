package ru.inc.extendedrecycler.models

import ru.inc.extendedrecycler.models.MainItemContainer.Companion.CARD_TYPE

data class SomeCard(val color: CardColor): MainItemContainer {
    override fun getType() = CARD_TYPE
}
