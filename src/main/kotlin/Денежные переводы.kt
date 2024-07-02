fun main() {
    val amount = 10
    val rateCommission = 0.75
    val rateMinCommission = 35

    val commission = amount * rateCommission / 100
    val result = if (commission < rateMinCommission) rateMinCommission else commission
    print("комиссия - $result руб.")
}