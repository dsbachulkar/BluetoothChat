package com.demo.bluethootchart.di

import android.content.Context
import com.demo.bluethootchart.data.AndroidBluetoothController
import com.demo.bluethootchart.domain.chat.BluetoothController
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideBluetoothController(@ApplicationContext context: Context):BluetoothController{
        return AndroidBluetoothController(context)
    }

}