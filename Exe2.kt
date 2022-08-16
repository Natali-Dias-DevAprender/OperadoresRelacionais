
 fun main(){

     var idade = 0
     println(" Olá, tudo bem!!! \nInsira sua idade, por favor : ")
     idade = readln().toInt()
     println(idade)

     if (idade >= 10 && idade <= 14) {
         println("Infatil  ")

     }
     if (idade >= 15 && idade <= 17) {
         println("Juventil  ")

     }
     if (idade >= 18 && idade <= 25) {
         println("Adulto ")
     }

 }