package com.llanosmunoz.orangebankct.view.app

import android.app.Application
import com.github.salomonbrys.kodein.Kodein
import com.github.salomonbrys.kodein.KodeinAware
import com.github.salomonbrys.kodein.lazy
import com.llanosmunoz.orangebankct.di.appModule
import com.llanosmunoz.orangebankct.di.dataModule
import com.llanosmunoz.orangebankct.di.domainModule

/**
 * App.
 */
class App : Application(), KodeinAware {

    override val kodein by Kodein.lazy {
        import(appModule(this@App))
        import(domainModule)
        import(dataModule)
    }

}