package ru.inc.extendedrecycler.models

data class SomeCard(val color: CardColor): MainItemContainer {
    override fun getType() = MainItemContainer.CARD_TYPE
}
