package ru.inc.extendedrecycler.ui.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import ru.inc.extendedrecycler.models.MainItemContainer

abstract class BaseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    abstract fun bind(mainItemContainer: MainItemContainer)
}