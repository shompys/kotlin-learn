package interfaces

import clases.Ciruja

// Otra manera de aplicar la descarga del ciruja (interfaces)
class DownloadThread2: DownloadThread.DownloadListener {
    override fun onDownloadFinished(ciruja: Ciruja) {
        ciruja.gritar()
    }
    // init se ejecuta cuando se instancia la clase!!!
    init {
        val downLoadThread = DownloadThread()
        downLoadThread.downloadThread(this)
    }

}