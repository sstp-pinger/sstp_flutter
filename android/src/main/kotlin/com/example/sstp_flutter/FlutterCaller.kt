package com.example.sstp_flutter

import android.annotation.SuppressLint
import com.example.sstp_flutter.preference.OscPrefKey
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class FlutterCaller {

@SuppressLint("SuspiciousIndentation")
fun connect(){
    if(connectionStatus == OscPrefKey.Connected.name) return
        connectionStatus = OscPrefKey.Connected.name
        val tempMap : HashMap<String,Any>  = HashMap()
        tempMap.put("status",connectionStatus)
        tempMap.put("ip",assignedIp)
        flutterChannel.invokeMethod("connectResponse", tempMap)
    }

    fun connecting(){
        connectionStatus = OscPrefKey.Connecting.name
        val tempMap : HashMap<String,Any>  = HashMap()
        tempMap.put("status",connectionStatus)
        flutterChannel.invokeMethod("connectResponse", tempMap)
    }

    suspend fun DownloadSpeed(downloadSpeed : Int, totalDownload : Int){
        withContext(Dispatchers.Main) {
            flutterChannel.invokeMethod("downloadSpeed",listOf(downloadSpeed, totalDownload) )
        }

    }

    suspend fun UploadSpeed(uploadSpeed : Int, totalUpload : Int){
        withContext(Dispatchers.Main) {
            flutterChannel.invokeMethod("uploadSpeed", listOf(uploadSpeed, totalUpload))
        }

    }

    /// Sent just before the matching `connectResponse` (disconnected), so Dart
    /// can tag that report as user-initiated via the notification rather than
    /// a dropped connection. Called from `onStartCommand`, already on the main
    /// thread, so no dispatch is needed.
    fun notificationDisconnect(){
        flutterChannel.invokeMethod("onNotificationDisconnect", null)
    }

}