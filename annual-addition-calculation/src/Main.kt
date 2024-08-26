data class Pais(val habitantes: Double, val taxaCrescimento: Double) {
    fun crescerPopulacaoAnual(habitantes: Double) : Double {
        return habitantes * (1 + taxaCrescimento / 100)
    }
}

fun main() {
    val habitantesPaisA = readLine()!!.toDouble()
    val habitantesPaisB = readLine()!!.toDouble()
    val paisA = Pais(habitantesPaisA, taxaCrescimento = 3.0) // N
    val paisB = Pais(habitantesPaisB, taxaCrescimento = 1.5) // M

    var populacaoAtualA = paisA.habitantes
    var populacaoAtualB = paisB.habitantes
    var quantidadeAnos = 0

    while (populacaoAtualA < populacaoAtualB) {
        populacaoAtualA = paisA.crescerPopulacaoAnual(populacaoAtualA)
        populacaoAtualB = paisB.crescerPopulacaoAnual(populacaoAtualB)
        quantidadeAnos++
    }

    println("$quantidadeAnos anos")
}
