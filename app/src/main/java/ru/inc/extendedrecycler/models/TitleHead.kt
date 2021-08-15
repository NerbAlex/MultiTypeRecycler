package ru.inc.extendedrecycler.models

data class TitleHead(val title: String) : MainItemContainer {
    override fun getType() = MainItemContainer.TITLE_TYPE
}


