package ru.inc.extendedrecycler.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.inc.extendedrecycler.R
import ru.inc.extendedrecycler.databinding.ActivityMainBinding
import ru.inc.extendedrecycler.models.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: MainAdapter
    private lateinit var binding: ActivityMainBinding
    private val mainContainerList by lazy { createMainList() }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initRecyclerView()
    }

    private fun initRecyclerView() {
        adapter = MainAdapter()
        binding.recycler.adapter = adapter
        adapter.list = mainContainerList
    }

    private fun createMainList(): List<MainItemContainer> =
        listOf(
            MainItemContainer(titleHead = TitleHead(getString(R.string.title)), someCard = null, someListItem = null),
            MainItemContainer(titleHead = null, someCard = SomeCard(CardColor.COLOR_1), someListItem = null),
            MainItemContainer(titleHead = null, someCard = SomeCard(CardColor.COLOR_2), someListItem = null),
            MainItemContainer(titleHead = null, someCard = SomeCard(CardColor.COLOR_3), someListItem = null),
            MainItemContainer(titleHead = null, someCard = null, someListItem = SomeListItem(randomId())),
            MainItemContainer(titleHead = null, someCard = null, someListItem = SomeListItem(randomId())),
            MainItemContainer(titleHead = null, someCard = null, someListItem = SomeListItem(randomId())),
            MainItemContainer(titleHead = null, someCard = null, someListItem = SomeListItem(randomId())),
            MainItemContainer(titleHead = null, someCard = null, someListItem = SomeListItem(randomId())),
            MainItemContainer(titleHead = null, someCard = null, someListItem = SomeListItem(randomId())),
            MainItemContainer(titleHead = null, someCard = null, someListItem = SomeListItem(randomId())),
            MainItemContainer(titleHead = null, someCard = null, someListItem = SomeListItem(randomId())),
            MainItemContainer(titleHead = null, someCard = null, someListItem = SomeListItem(randomId())),
            MainItemContainer(titleHead = null, someCard = null, someListItem = SomeListItem(randomId())),
            MainItemContainer(titleHead = null, someCard = null, someListItem = SomeListItem(randomId())),
            MainItemContainer(titleHead = null, someCard = null, someListItem = SomeListItem(randomId())),
            MainItemContainer(titleHead = null, someCard = null, someListItem = SomeListItem(randomId())),
        )

    private fun randomId(): Int = Random.nextInt()
}