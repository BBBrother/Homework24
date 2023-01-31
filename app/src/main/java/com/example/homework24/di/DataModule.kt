package com.example.homework24.di

import com.example.homework24.data.RepositoryImpl
import com.example.homework24.domain.PictureRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class DataModule {

    @Binds
    abstract fun getRepository(impl: RepositoryImpl): PictureRepository
}