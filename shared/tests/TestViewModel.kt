import kz.action.IActionRunner
import kz.model.copyModel
import kz.remote.model.IRemoteModel
import kz.remote.model.ModelToRemoteAction

/**
 * Created by Max on 02.07.2017.
 */

class RemoteViewBook: Book(), IRemoteModel {

}

class MyAction(runner: IActionRunner,
               val viewBook: Book): ModelToRemoteAction(runner, viewBook) {

     override fun doit(): IRemoteModel {
         return copyModel(viewBook)
     }
}

fun main(args: Array<String>) {
    val b = Book();

}