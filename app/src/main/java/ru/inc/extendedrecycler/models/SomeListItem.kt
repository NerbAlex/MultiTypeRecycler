package ru.inc.extendedrecycler.models

import ru.inc.extendedrecycler.models.MainItemContainer.Companion.ID_TYPE

data class SomeListItem(val id: Int): MainItemContainer {
    override fun getType() = ID_TYPE
}
