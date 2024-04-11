package com.mozhimen.updatek.commons

/**
 * @ClassName IHotUpdateKListener
 * @Description TODO
 * @Author Kolin Zhao / Mozhimen
 * @Version 1.0
 */
interface IUpdateKListener {
    fun onComplete()
    fun onFail(msg: String)
}