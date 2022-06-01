package ru.otus.daggerhomework

import android.app.Application
import ru.otus.daggerhomework.di.app.ApplicationComponent
import ru.otus.daggerhomework.di.app.DaggerApplicationComponent

class App : Application() {

    val componentInstance: ApplicationComponent by lazy {
        DaggerApplicationComponent
            .factory()
            .create(context = this)
    }
}