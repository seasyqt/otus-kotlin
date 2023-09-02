package ru.otus.otuskotlin.marketplace.repo.inmemory

import ru.otus.otuskotlin.marketplace.backend.repo.tests.RepoGoodsReadTest
import ru.otuskotlin.learning.menu.common.repo.IGoodsRepository
import ru.otuskotlin.learning.repo.inmemory.GoodsRepoInMemory

class GoodsRepoInMemoryReadTest: RepoGoodsReadTest() {
    override val repo: IGoodsRepository = GoodsRepoInMemory(
        initObjects = initObjects
    )
}
