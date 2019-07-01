package com.example.quran

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*
import org.json.JSONArray
import java.io.IOException
import java.io.InputStream

class MainActivity : AppCompatActivity() {

  //  var arr = arrayListOf<String>()
    var json : String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        readquran()

    }

fun readquran() {
   // var json : String? = null

try {
    val inputStream:InputStream = assets.open("qurandb.json")
    json = inputStream.bufferedReader().use { it.readText() }

    lists.text = json

   // var jsonarr = JSONArray(json)
//    for (i in 0..jsonarr.length())
   // {
//        var jsonobj =jsonarr.getJSONObject(i)
//        arr.add(jsonobj.getString("AyahText"))

  //  }
//    var adpt = ArrayAdapter(this,android.R.layout.simple_list_item_1
//        ,arr)
//    list.adapter= adpt

}

catch (e : IOException)
{

}
}

}
