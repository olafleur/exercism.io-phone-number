class PhoneNumber(s: String) {
  def areaCode = ""

  def number = {
    val chiffres = s filter ("0123456789" contains _)
    if(chiffres.length == 11) {
      if(chiffres{0} == '1') {
        chiffres.drop(1)
      } else {
        throw new NotImplementedError()
      }
    } else {
      chiffres
    }
  }

}
