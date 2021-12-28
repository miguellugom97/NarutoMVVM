package com.miguellugo.narutomvvm.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.core.view.isVisible
import androidx.recyclerview.widget.LinearLayoutManager
import com.miguellugo.narutomvvm.data.model.NinjaItem
import com.miguellugo.narutomvvm.databinding.ActivityMainBinding
import com.miguellugo.narutomvvm.ui.view.adapters.NinjaAdapter
import com.miguellugo.narutomvvm.ui.viewmodel.NinjaViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val ninjaViewModel: NinjaViewModel by viewModels()
    private lateinit var ninjaAdapter: NinjaAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setup()
    }

    private fun setup() {
        setUI()
        ninjaViewModel.onCreate()

        ninjaViewModel.isLoading.observe(this, {
            binding.progressBar.isVisible = it
        })

        ninjaViewModel.ninja.observe(this, { ninjas ->
            setNinjas(ninjas)
        })
    }

    private fun setNinjas(ninjas: List<NinjaItem>?) {
        if (!ninjas.isNullOrEmpty())
            ninjaAdapter.setData(ninjas)
    }

    private fun setUI() {
        ninjaAdapter = NinjaAdapter()
        binding.ninjasRecyclerView.adapter = ninjaAdapter
        binding.ninjasRecyclerView.layoutManager = LinearLayoutManager(this)
    }
}