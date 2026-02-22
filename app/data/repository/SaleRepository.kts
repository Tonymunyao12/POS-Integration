interface SaleRepository{
    suspend fun saveSale()
    suspend fun syncSales()
}