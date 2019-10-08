package kz.view.model

import kz.model.Model
import kz.model.copyModel
import kz.remote.model.IModelToRemoteAction
import kz.remote.model.IRemoteModel
import kz.remote.model.ModelToRemoteAction
import javax.swing.text.View
import kotlin.reflect.KProperty

/**
 * Created by Max on 25.06.2017.
 */

interface IViewModel {
    fun <T>setProp(prop: KProperty<T>, value: T);
}

class ViewModelPropMap: IViewModel {
    val propMap = mutableMapOf<String, Any?>();

    override fun <T>setProp(prop: KProperty<T>, value: T) {
        propMap[prop.name] = value;
    }
}

