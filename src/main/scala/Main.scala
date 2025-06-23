@main def hello(): Unit =
  println("Hello world!")
  println(msg)
  val conc = conceito(8.5)
  println(s"O conceito foi $conc")
  val com = comissao(750)
  println(s"A comissão do cara que vendeu 750 produtos foi RS $com")
  val temp = classificaTemperatura(37.5)
  println(s"teste da temperatura: $temp")
  val classifica = decideIdade(24)
  println(s"Uma pessoa de 24 anos é $classifica")

def msg = "I was compiled by Scala 3. :)"

def conceito(nota : Double) : String = {
  if (nota >= 0 && nota <= 5) "F" else
    if(nota > 5 && nota <=6.9) "D" else
      if(nota >= 7 && nota <= 8.9) "C" else
        if(nota > 9 && nota <=9.9) "B" else
          if(nota == 10.0) "A"
          else ""  
          }

def comissao(quantidade : Int) : Double = {
  if(quantidade <= 250) quantidade else 
    if(quantidade > 250 && quantidade <= 500) 1.5 * quantidade else
      if (quantidade > 500) 2*quantidade 
        else 0.0
}

def classificaTemperatura(t: Double): List[String] = {
  if (t < -10.0) List("Congelante")
   else if (t >= -10.0 && t < 0.0) List("Muito Frio")
   else if (t == 0.0) List("Muito Frio", "Frio")
   else if (t < 10.0) List("Frio")
   else if (t == 10.0) List("Frio", "Fresco")
   else if (t < 20.0) List("Fresco")
   else if (t == 20.0) List("Fresco", "Agradável")
   else if (t < 30.0) List("Agradável")
   else if (t == 30.0) List("Agradável", "Quente")
   else if (t <= 40.0) List("Quente")
   else if (t > 40.0) List("Muito Quente")
   else List()
}

def decideIdade(idade : Int) : String = {
  if(idade >= 0 && idade<= 12) "Criança" else
    if(idade >=13 && idade <= 17) "Adolescente" else
      if(idade>=18 && idade<=59) "Adulto" else
        if(idade>= 60) "Idoso" else ""
}

