package com.example.wifidirect_final.Models

import java.io.File


sealed class ViewState {

    object Idle : ViewState()

    object Connecting : ViewState()

    object Receiving : ViewState()

    class Success(val file: File) : ViewState()

    class Failed(val throwable: Throwable) : ViewState()

}