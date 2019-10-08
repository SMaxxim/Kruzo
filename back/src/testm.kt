import kz.model.Model
import kotlin.properties.Delegates
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KMutableProperty
import kotlin.reflect.KProperty


/**
 * Created by stepanov on 21.06.2017.
 */

class ModelProperty<T>(
        initialValue: T,
        var get: (field: T) -> T = { it },
        var set: (newValue: T) -> T = { it }) {

    private var value: T = initialValue;

    operator fun getValue(thisRef: Any?, property: KProperty<*>): T {
        return get(value)
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, newValue: T) {
        value = set(newValue);
    }
}


open class ViewModel {

    fun <T>observe(prop: KProperty<T>, setter: () -> Unit) {
        setter();
        println("!:");
        println(prop.call());
    }

}

open class Test: ViewModel() {
    var name1: String = ""
        get() {
            return field+ "@";
        }
        protected set(value) {
            field = value
        }

}

open class Book(val name: String = "1"): Model()

fun main(args: Array<String>) {
    val b1 = Book("test1");
    val b2 = b1.copy<Book>();
    println(b2?.name);
    val f = "f";
    f.apply {
        [1];

    }
}