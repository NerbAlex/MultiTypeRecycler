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
            TitleHead(getString(R.string.title)),
            SomeCard(CardColor.COLOR_2),
            SomeCard(CardColor.COLOR_3),
            SomeListItem(randomId()),
            SomeListItem(randomId()),
            SomeListItem(randomId()),
            SomeListItem(randomId()),
            SomeListItem(randomId()),
            SomeListItem(randomId()),
            SomeListItem(randomId()),
            SomeListItem(randomId()),
            SomeListItem(randomId()),
            SomeListItem(randomId())
            )

    private fun randomId(): Int = Random.nextInt()
}