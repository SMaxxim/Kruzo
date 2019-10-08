import javax.management.Query.div
import kotlin.reflect.KProperty

/**
 * Created by stepanov on 19.05.2017.
 */

data class Model(
        var id: String = "",
        var name: String = ""
)

class Layout(
        val page: Any
        ) {

    var elementMap = HashMap<String, UIElement>();
    val elements: MutableList<UIElement> = ArrayList()

    operator fun invoke(bfun: Layout.() -> Unit): Layout {
         this.bfun();
         return this;
    }

    operator fun UIElement.unaryPlus() {
        element(this);
    }

    fun element(p: UIElement) {
        for (m in page::class.members) {
            if (m is KProperty) {
                if (m.call(page) === p) {
                    p.id = m.name;
                    elementMap[m.name] = p;
                    elements.add(p);
                }
            }
        };
    }

    fun div(body: Layout.() -> Unit): Layout {
        this.body();
        return this;
    }

    fun html(): String {
        return elements.joinToString(separator = "\n", transform = {
            item ->
            item.html();
        });
    }
}

open class UIElement(
        var id: String = "") {

    open fun layout(): Layout {
        return Layout(this);
    }

    open fun html(): String {
        return "< id={$id}> "+ layout().html() + "</>";
    }
}

open class Text(
        var text: String): UIElement() {

    override fun html(): String {
        return "<div id=$id>$text</div>";
    }
}

class TestView(
    var model: Model): UIElement() {

    var nameText = Text("");

    override fun layout(): Layout {
        return Layout(this).div {
            if (model.name == "55")
                +nameText;
        }
    }
}

fun  main(args: Array<String>) {
}

