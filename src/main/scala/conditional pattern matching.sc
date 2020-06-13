case class Email(from:String,body:String)

val impPpl = Set("bou@home", "boss@office")

val regularEmail=Email("ngo@SocialCause","Plz donate")
val impEmail=Email("boss@office","")

def alert(email:Email)=email match {
  case Email(from,body) if impPpl.contains(from) && body!=""=>println("Please read")
  case Email(_,_)=>println("DND")
}

alert(regularEmail)
alert(impEmail)