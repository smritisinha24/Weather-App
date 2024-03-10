package com.example.weatherapp.Repository

import com.example.weatherapp.Server.ApiServices

class WeatherRepository(val api: ApiServices) {
    fun getCurrentWeather(lat: Double, lng:Double, unit:String)=
        api.getCurrentWeather(lat,lng,unit,"9c53793220e77f03d46aa5d54ef2db6c")

    fun getForecastWeather(lat: Double, lng:Double, unit:String)=
        api.getForecastWeather(lat,lng,unit,"9c53793220e77f03d46aa5d54ef2db6c")

}