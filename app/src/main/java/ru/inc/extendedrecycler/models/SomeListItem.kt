package ru.inc.extendedrecycler.models

data class SomeListItem(val id: Int): MainItemContainer {
    override fun getType() = MainItemContainer.ID_TYPE
}
