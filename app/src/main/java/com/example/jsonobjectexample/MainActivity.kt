package com.example.jsonobjectexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.json.JSONObject as JSONObject1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var data ="{\"student\"{\"name\":\"robin\",\"id\":\"101\"}}"
        var jsonObject: JSONObject1 = (JSONObject1(data)).getJSONObject("student")
        var name2=jsonObject.getString("name")
        var id2=jsonObject.getString("id")
        var textview2:TextView=findViewById(R.id.textvieew1)
        textview2.text= "$name2 \n $id2"
    }
}