package kz.model

import kotlin.reflect.KParameter
import kotlin.reflect.KProperty
import kotlin.reflect.full.createInstance
import kotlin.reflect.full.primaryConstructor

/**
 * Created by Max on 25.06.2017.
 */

interface IModel {
}

open class Model: IModel {

}

inline fun <SrcT: IModel, reified DstT: SrcT>copyModel(obj: SrcT): DstT {
    val map = mutableMapOf<KParameter, Any?>();
    obj::class.primaryConstructor?.parameters?.forEach {
        param ->
        val srcProp = obj::class.members.firstOrNull {
            prop ->
            prop.name == param.name }
        if (srcProp != null)
            map[param] = srcProp.call(obj);
    }
    val res: DstT = obj::class.primaryConstructor?.callBy(map) as DstT;
    return res;
}


