package ru.inc.extendedrecycler.models

import ru.inc.extendedrecycler.models.MainItemContainer.Companion.TITLE_TYPE

data class TitleHead(val title: String) : MainItemContainer {
    override fun getType() = TITLE_TYPE
}


