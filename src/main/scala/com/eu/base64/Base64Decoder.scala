package com.eu.base64

import play.api.libs.json.*
import java.util.Base64

object Base64Decoder :

  def getValue(encodeStr: String, key: String): String = {
    val json: JsValue = getJson(encodeStr)
    var value : String = null
    if(key.equals("sub")  || key.equals("tokenType")){
      value = (json \ key).as[String]
    }else{
      value = (json \ key).as[Int].toString
    }
    println(key + " : " + value)
    value
  }
  private def getJson(encodeStr: String): JsValue = {
    val parts = encodeStr.split("\\.")
    val part2 = parts(1)
    val decodedBytes = Base64.getDecoder.decode(part2)
    val decodedString = new String(decodedBytes, "UTF-8")
    println(decodedString)
    val json: JsValue = Json.parse(decodedString)
    json
}
