package com.mozhimen.updatek.commons

/**
 * @ClassName IHotUpdateKListener
 * @Description TODO
 * @Author Kolin Zhao / Mozhimen
 * @Version 1.0
 */
interface ISuspendUpdateKListener {
    suspend fun onComplete()
    suspend fun onFail(msg: String)
}