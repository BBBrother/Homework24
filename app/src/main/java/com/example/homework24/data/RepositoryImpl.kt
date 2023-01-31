package com.example.homework24.data

import com.example.homework24.data.mappers.PictureUIMapper
import com.example.homework24.domain.PictureRepository
import com.example.homework24.domain.PictureUiData
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val server: Server,
    private val mapper: PictureUIMapper
): PictureRepository {

    override fun getPicture(): PictureUiData {
        val response = server.getPicture()
        return mapper(response)
    }
}