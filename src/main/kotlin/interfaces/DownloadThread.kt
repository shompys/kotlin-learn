package interfaces

import clases.Ciruja

class DownloadThread {
    // con la interfaz declaramos una funcion que nos pide una callback del tipo DownloadListener el cual recibe dentro un atributo del tipo ciruja
    // Este ciruja es creado y emulamos la espera de la creacion del ciruja con un sleep una vez lo tenemos ejecutamos en donde sea llamado la funcion gritar
    interface DownloadListener {
        fun onDownloadFinished(ciruja: Ciruja)
    }

    fun downloadThread(downloadListener: DownloadListener) {
        //Creacion de hilo que se ejecuta en paralelo a nuestro codigo principal
        val thread = Thread(Runnable {
            println("ejecucion de hilo comenzando!")
            Thread.sleep(5000)
            val downloadedNewCiruja = Ciruja("alfredo", 40, "limpio")
            downloadListener.onDownloadFinished(downloadedNewCiruja)
        })
        thread.start()
    }

    //lambda es lo mismo que la interfaz

    fun downloadThread(downloadListenerLambda: (ciruja: Ciruja) -> Unit) {
        val thread = Thread {
            println("ejecucion de hilo lambda comenzando!")
            Thread.sleep(10000)
            val newCiruja = Ciruja("Alberto", 60, "F")
            downloadListenerLambda(newCiruja)
        }
        thread.start()
    }

}