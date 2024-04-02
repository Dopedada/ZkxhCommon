package com.gxy.owner.entity.common

import androidx.annotation.Keep
import kotlinx.parcelize.Parcelize
import android.os.Parcelable
import kotlinx.parcelize.RawValue

/**
 * @author zhangyuxiang
 * @date 2024/3/11
 */
@Keep
@Parcelize
data class BottomListEntity(
    val id: Int?,
    val name: String?,
    var isCheck: Boolean = false,
    var data: @RawValue Any? = null
) : Parcelable