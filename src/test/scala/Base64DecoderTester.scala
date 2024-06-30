
import com.eu.base64.Base64Decoder
import org.scalatest.funsuite.AnyFunSuite

class Base64DecoderTester extends AnyFunSuite:

  test("test header1"){
    val encodedHeader = "eyJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE3MTk0ODk4MDYsInN1YiI6InN1cGVyLWFkbWluIiwiZXhwIjoxNzE5NDkxNjA2LCJ0b2tlblR5cGUiOiJkZWZhdWx0VjIifQ.KJc1175pjeRFcSokDC6QZiCYP_qPK-AgFIm3hIfFZvM";
    assert(Base64Decoder.getValue(encodedHeader, "tokenType") === "defaultV2")
    assert(Base64Decoder.getValue(encodedHeader, "sub") === "super-admin")
    assert(Base64Decoder.getValue(encodedHeader, "exp") === "1719491606")
    assert(Base64Decoder.getValue(encodedHeader, "iat") === "1719489806")
  }

  test("test header 2") {
    val encodedHeader = "eyJhbGciOiJIUzUxMiJ9.eyJpYXQiOjE3MTU2ODMzMzQsInN1YiI6Imd5YXJha28iLCJleHAiOjE3MTU2ODUxMzQsInRva2VuVHlwZSI6ImRlZmF1bHRWMiJ9.phwHmJAcEDpwgqGRyXBRcsBisieWsr0Wq-Bha7fkZs_20nAwuX7-KXnURaP7o7dG9Di5lhpHz1PhdbiZuwtzog"
    assert(Base64Decoder.getValue(encodedHeader, "tokenType") === "defaultV2")
    assert(Base64Decoder.getValue(encodedHeader, "sub") === "gyarako")
    assert(Base64Decoder.getValue(encodedHeader, "exp") === "1715685134")
    assert(Base64Decoder.getValue(encodedHeader, "iat") === "1715683334")
  }