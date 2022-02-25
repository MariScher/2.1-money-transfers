fun main() {
    val amount = 1_500_000
    val transferFee = 0.0075
    val minFee = 3500
    val totalAmount = amount * transferFee

    val result = if (totalAmount > minFee) totalAmount else minFee
    println("Комиссия по Вашему платежу составит: $result")
}