
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
  test("test header 3") {
    val encodedHeader = "eyJhbGciOiJSUzI1NiJ9.eyJzdWIiOiJneWFyYWtvIiwiaHR0cHM6XC9cL2VjYXMuZWMuZXVyb3BhLmV1XC9jbGFpbXNcL2VtcGxveWVlX251bWJlciI6IjkwMTQ5NzQ1Iiwic3Vic2NyaXB0aW9ucyI6WyJcL2NhcGkiXSwiaHR0cHM6XC9cL2VjYXMuZWMuZXVyb3BhLmV1XC9jbGFpbXNcL2RlcGFydG1lbnRfbnVtYmVyIjoiRElHSVQuQS40LjAwNSIsImlzcyI6Imh0dHBzOlwvXC9hcGkuYWNjZXB0YW5jZS50ZWNoLmVjLmV1cm9wYS5ldVwvZmVkZXJhdGlvblwvb2F1dGhcL3Rva2VuIiwiZ2l2ZW5fbmFtZSI6IktvbmRhaWFoIiwiY2xpZW50X2lkIjoiMk00QzNKRlhXMlI2U2k0N2tBWTQyZDFqZnpUVldNSmJTc2lnZmVsZnRFSHpaWmlGRjR6cjBPZ3FLY0lodG1Xa09yNWhubXprR3lUV3F6R05zT1Q5S3lyLXJhOGduQ0YxbFdhRzluZ1MzcXRjNHkiLCJodHRwczpcL1wvZWNhcy5lYy5ldXJvcGEuZXVcL2NsYWltc1wvb3JnX2lkIjoiMjUwNjYzIiwiYXVkIjoicEFmM1lkVnJpTHlUUjVyODRkdk1HTDBDYzhVYSIsIm5iZiI6MTcxOTkzMTc4NiwicGhvbmVOdW1iZXIiOiI2NjY0NiIsImF6cCI6InBBZjNZZFZyaUx5VFI1cjg0ZHZNR0wwQ2M4VWEiLCJuYW1lIjoiS29uZGFpYWggR1lBUkEiLCJleHAiOjE3MTk5MzUzODYsImlhdCI6MTcxOTkzMTc4NiwiZmFtaWx5X25hbWUiOiJHWUFSQSIsImp0aSI6ImIxMzI3OTc4LTVlODAtNDRiNS04ZjRkLWNhOTU0MjZhZWY3NCIsImVtYWlsIjoiS29uZGFpYWguR1lBUkFAZXh0LmVjLmV1cm9wYS5ldSIsInVzZXJuYW1lIjoiZ3lhcmFrbyJ9.qqEgaNpRIOTi2wXAC-6snoSIrJz2hZoXj4ws2JqGY1ULX4J53haRs9qfCS0oTGLsLHWamq8IZvp0lAviGyFgzfxYDzKv7jJKFfeLDZvo2IayZNuj7ml5MiF8DvWDo96leMIRfPp2y-dzlliUzZEm-n3974b4mneq4mcWy2Jwmyk85rVBVaaBUShLgxKt9dYEQ9Xzh4dvNaxMMatt0qHlCryOanI3B5q73EGs2pTrhlhOLd0DSeVC8V45npHpaN28b7uECEjbLJ0RoOhXc_BI8mGRdPnoX5LEn34JJ0x9GcRG1DP-7pkDXVVYNL64tdNwRt6RR1j5tWKgoVTGhMpBSg"
    assert(Base64Decoder.getValue(encodedHeader, "sub") === "gyarako")
    assert(Base64Decoder.getValue(encodedHeader, "given_name") === "Kondaiah")
    assert(Base64Decoder.getValue(encodedHeader, "client_id") === "2M4C3JFXW2R6Si47kAY42d1jfzTVWMJbSsigfelftEHzZZiFF4zr0OgqKcIhtmWkOr5hnmzkGyTWqzGNsOT9Kyr-ra8gnCF1lWaG9ngS3qtc4y")
    assert(Base64Decoder.getValue(encodedHeader, "aud") === "pAf3YdVriLyTR5r84dvMGL0Cc8Ua")
    assert(Base64Decoder.getValue(encodedHeader, "nbf") === "1719931786")
    assert(Base64Decoder.getValue(encodedHeader, "phoneNumber") === "66646")
    assert(Base64Decoder.getValue(encodedHeader, "azp") === "pAf3YdVriLyTR5r84dvMGL0Cc8Ua")
    assert(Base64Decoder.getValue(encodedHeader, "name") === "Kondaiah GYARA")
    assert(Base64Decoder.getValue(encodedHeader, "exp") === "1719935386")
    assert(Base64Decoder.getValue(encodedHeader, "iat") === "1719931786")
    assert(Base64Decoder.getValue(encodedHeader, "family_name") === "GYARA")
    assert(Base64Decoder.getValue(encodedHeader, "jti") === "b1327978-5e80-44b5-8f4d-ca95426aef74")
    assert(Base64Decoder.getValue(encodedHeader, "email") === "Kondaiah.GYARA@ext.ec.europa.eu")
    assert(Base64Decoder.getValue(encodedHeader, "username") === "gyarako")

  }