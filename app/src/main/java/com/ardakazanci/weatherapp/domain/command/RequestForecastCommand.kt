package com.ardakazanci.weatherapp.domain.command

import com.ardakazanci.weatherapp.data.ForecastRequest
import com.ardakazanci.weatherapp.domain.mapper.ForecastDataMapper
import com.ardakazanci.weatherapp.domain.model.ForecastList

class RequestForecastCommand(private val zipCode: String) : Command<ForecastList> {
    override fun execute(): ForecastList {
        val forecastRequest = ForecastRequest(zipCode) // Gson
        return ForecastDataMapper().convertFromDataModel(forecastRequest.execute())
    }
}