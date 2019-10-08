package kz.remote.model

import kz.action.Action
import kz.action.IAction
import kz.action.IActionRunner
import kz.model.IModel
import kz.model.copyModel


interface IRemoteModel: IModel {
}

interface IModelToRemoteAction: IAction {
    val src: IModel;

    fun doit(): IRemoteModel;
}

abstract class ModelToRemoteAction(runner: IActionRunner, srcModel: IModel): Action(runner), IModelToRemoteAction {
    override val src: IModel = srcModel;

    override abstract fun doit(): IRemoteModel;
}