package com.example.dindinapp

import com.airbnb.mvrx.Success
import com.airbnb.mvrx.withState
import com.example.dindinapp.repository.FoodRepository
import com.example.dindinapp.repository.network.FoodService
import com.example.dindinapp.states.FoodDeliveryState
import com.example.dindinapp.viewmodels.FoodDeliveryViewModel
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.MockWebServer
import org.junit.After
import org.junit.Before
import org.junit.ClassRule
import org.junit.Test
import org.mockito.Mockito.*


// Created by Gbenga Oladipupo(Devmike01) on 1/10/21.


class MainActivityViewModelTest: ViewMode {

    lateinit var server : MockWebServer

    @Before
    fun initTest(){
        server = MockWebServer()
    }

    @After
    fun shutdown(){
        server.shutdown()
    }
//
//    val foodService: FoodService = mock(FoodService::class.java)
//    var viewModel : FoodDeliveryViewModel= mock(FoodDeliveryViewModel::class.java)

    @Test
    fun testDoGetFoodCategory(){
        server.enqueue(MockResponse().setBody())
    }

}