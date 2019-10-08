package kz.action

/**
 * Created by Max on 02.07.2017.
 */
interface IAction {
    val runner: IActionRunner;
}

interface IActionRunner {

}

open class Action(
        override val runner: IActionRunner): IAction {
}

open class ActionRunner: IActionRunner {

}