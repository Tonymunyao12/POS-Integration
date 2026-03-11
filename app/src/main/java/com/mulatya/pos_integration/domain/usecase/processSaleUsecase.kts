/*class ProcessSaleUseCase(
    private val saleRepository: SaleRepository,
    private val paymentManager: PaymentManager,
    private val printerManager: PrinterManager
){
    suspend operator fun invoke(sale: Sale){

        val paymentResult = paymentManager.processPayment()

        if(paymentResult.isSuccess){
           saleRepository.saveSale(sale)
            printerManager.printReceipt(sale)

        }else {
            throw Exception("Payment Failed")
        }
    }
}*/