package com.llanosmunoz.orangebankct.di

import android.content.Context
import com.github.salomonbrys.kodein.Kodein
import com.github.salomonbrys.kodein.bind
import com.github.salomonbrys.kodein.instance
import com.github.salomonbrys.kodein.singleton
import com.llanosmunoz.data.datasources.network.ApiService
import com.llanosmunoz.data.datasources.network.NetworkDataSource
import com.llanosmunoz.data.datasources.network.OrangeBankNetworkDataSource
import com.llanosmunoz.data.datasources.network.createService
import com.llanosmunoz.domain.executor.Executor
import com.llanosmunoz.orangebankct.error.ErrorHandler
import com.llanosmunoz.orangebankct.error.AndroidErrorHandler
import com.llanosmunoz.orangebankct.executor.RxExecutor

/**
 * Modules
 */
fun appModule(context: Context) = Kodein.Module {
    bind<Context>() with singleton { context }
    bind<Executor>() with singleton { RxExecutor() }
    bind<ErrorHandler>() with singleton { AndroidErrorHandler(context = context) }
}

val domainModule = Kodein.Module {
    // Add here data dependencies
}

val dataModule = Kodein.Module {
    /* DataSource */
    bind<NetworkDataSource>() with singleton { OrangeBankNetworkDataSource(apiService = instance()) }

    /* API Service */
    bind<ApiService>() with singleton { createService<ApiService>(endPoint = ApiService.END_POINT) }
}