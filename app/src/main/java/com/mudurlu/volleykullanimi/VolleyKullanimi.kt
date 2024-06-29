package com.mudurlu.volleykullanimi


import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley

fun main(){
    //https://ridiculous-mockingbird-alper-7675b022.koyeb.app/api/v1/customers

    val url = "https://ridiculous-mockingbird-alper-7675b022.koyeb.app/api/v1/customers"

    val istek = object :StringRequest(Method.POST,url,Response.Listener {cevap ->

        println("Silinen: $cevap")

    },Response.ErrorListener { e -> e.printStackTrace() }){

        override fun getParams(): MutableMap<String, String>? {

            val params = HashMap <String,String>()

            params["id"] = "11"

            return params
        }

    }





}