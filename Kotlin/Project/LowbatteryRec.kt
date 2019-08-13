package kr.ac.smu.cs.smtoday

import android.app.AlertDialog
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class LowbatteryRec : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        // This method is called when the BroadcastReceiver is receiving an Intent broadcast.
        TODO("LowbatteryRec.onReceive() is not implemented")


        when(intent.action){
            Intent.ACTION_BATTERY_LOW ->{
                var intent = Intent(context,Information::class.java)
                intent.putExtra("sign",1)

            }


        }


    }
}
