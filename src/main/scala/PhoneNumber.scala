class PhoneNumber(s: String) {
  def areaCode = number.substring(0, 3)

  def number = {
    val chiffres = s filter ("0123456789" contains _)
    if (chiffres.length == 11) {
      if (chiffres {0} == '1') {
        chiffres.drop(1)
      } else {
        "0000000000"
      }
    } else {
      if (chiffres.length < 10) {
        "0000000000"
      } else {
        chiffres
      }
    }
  }

}
