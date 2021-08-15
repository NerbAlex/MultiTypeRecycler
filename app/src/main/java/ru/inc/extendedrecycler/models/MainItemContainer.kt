package ru.inc.extendedrecycler.models

interface MainItemContainer {
    companion object {
        const val TITLE_TYPE = 0
        const val CARD_TYPE = 1
        const val ID_TYPE = 2
    }

    fun getType(): Int
}
