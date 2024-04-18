package com.gxy.common.common.adapter

import com.gxy.common.R
import com.gxy.common.databinding.ItemTableBinding
import com.gxy.common.entity.common.GroupTableEntity
import com.zyxcoder.mvvmroot.base.adapter.BaseViewBindingAdapter
import com.zyxcoder.mvvmroot.base.adapter.BaseViewBindingHolder
import com.zyxcoder.mvvmroot.utils.dpToPx

/**
 * @author zhangyuxiang
 * @date 2024/4/11
 */
class GroupTableAdapter : BaseViewBindingAdapter<GroupTableEntity, ItemTableBinding>(
    ItemTableBinding::inflate, R.layout.item_table
) {
    var onUploadFileClickListener: (() -> Unit)? = null
    override fun convert(holder: BaseViewBindingHolder<ItemTableBinding>, item: GroupTableEntity) {
        holder.viewBind.apply {
            TableAdapter(onUploadFileClickListener).apply {
                rvTable.adapter = this
                setNewInstance(item.tables.toMutableList())
            }
            clRoot.setPadding(0, 0, 0, dpToPx((item.paddingBottom ?: 20).toFloat()).toInt())
        }
    }
}