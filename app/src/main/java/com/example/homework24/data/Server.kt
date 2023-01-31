package com.example.homework24.data

import com.example.homework24.data.models.PictureResponse
import javax.inject.Inject

class Server @Inject constructor() {

    fun getPicture() = PictureResponse("https://repository-images.githubusercontent.com/519348881/d411fd39-0622-443e-8082-8783ccf386c8")
}