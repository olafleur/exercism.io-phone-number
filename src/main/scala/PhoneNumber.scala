class PhoneNumber(s: String) {
  def areaCode = ""

  def number = s filter ("0123456789" contains _)

}
