package ru.otus.otuskotlin.marketplace.biz.workers

import models.CommonError
import models.State
import ru.otuskotlin.learning.menu.common.*
import ru.otuskotlin.learning.menu.cor.*
import stubs.GoodsStub

fun ICorChainDsl<GoodsContext>.stubValidationBadType(title: String) = worker {
    this.title = title
    on { stub == GoodsStub.BAD_TYPE && state == State.RUNNING }
    handle {
        state = State.FAILING
        this.errors.add(
            CommonError(
                group = "validation",
                code = "validation-type",
                field = "type",
                message = "Wrong type field"
            )
        )
    }
}
