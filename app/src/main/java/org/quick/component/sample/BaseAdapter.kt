package org.quick.component.sample

import android.view.View
import org.quick.component.QuickAdapter

abstract class BaseAdapter<M> : QuickAdapter<M, BaseViewHolder>() {
    override fun onResultViewHolder(itemView: View): BaseViewHolder = BaseViewHolder(itemView)
}
