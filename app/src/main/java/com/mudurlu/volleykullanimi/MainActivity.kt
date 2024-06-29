package com.mudurlu.volleykullanimi

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        customerSil()
    }



    fun customerSil(){
        //https://ridiculous-mockingbird-alper-7675b022.koyeb.app/api/v1/customers
        val silinecek_id = 12
        val url = "https://ridiculous-mockingbird-alper-7675b022.koyeb.app/api/v1/customers/${silinecek_id}"

        val istek = object : StringRequest(Method.DELETE,url, Response.Listener { cevap ->

            //println("Silinen: $cevap")

        }, Response.ErrorListener { e -> e.printStackTrace() }){

            /*override fun getParams(): MutableMap<String, String>? {

                val params = HashMap <String,String>()

                params["id"] = "11"

                return params
            }*/

        }

        Volley.newRequestQueue(this@MainActivity).add(istek)
    }

}