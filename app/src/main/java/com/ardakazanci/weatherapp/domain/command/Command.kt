package com.ardakazanci.weatherapp.domain.command

interface Command<out T> {
    fun execute(): T
}