package org.quick.component.http.callback

/**
 * 请求接口
 * @param T 泛型，解析为指定的类型
 */
abstract class OnRequestListener<T> : ClassCallback<T>() {
    open fun onStart() {}
    abstract fun onFailure(e: Exception, isNetworkError: Boolean)
    abstract fun onResponse(value: T?)
    open fun onEnd() {}
}