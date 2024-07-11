package com.learn.regex

@main
def main(): Unit = {
  RegEx().saveContactInformation("123-456-7890")
  RegEx().saveContactInformation("JohnSmith@sample.domain.com")
  RegEx().saveContactInformation("2 Franklin St, Mars, Milky Way")

  RegEx().passwordCheck("thisispassword123")
  val input: String =
    """background-color: #A03300;
      |background-image: url(img/header100.png);
      |background-position: top center;
      |background-repeat: repeat-x;
      |background-size: 2160px 108px;
      |margin: 0;
      |height: 108px;
      |width: 100%;""".stripMargin
  RegEx().keyValueGroups(input)
}