fun main(){
    var idade = 0
    var p21 = 0
    var p50 = 0

    while (idade != -99){
        print("Digite uma idade diferente de -99: ")
        idade = readLine()!!.toInt()

        if(idade != -99){
            if(idade < 21){
                p21++
            }else if (idade > 50){
                p50++
            }
        }
    }
}