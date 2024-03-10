package com.example.weatherapp.Repository

import com.example.weatherapp.Server.ApiServices

class CityRepository(val api:ApiServices) {
    fun getCities(q:String,limit:Int)=
        api.getCitiesList(q,limit,"9c53793220e77f03d46aa5d54ef2db6c")
}