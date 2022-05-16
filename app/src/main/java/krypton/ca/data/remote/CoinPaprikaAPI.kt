package krypton.ca.data.remote

import krypton.ca.data.remote.dto.CoinDetailDto
import krypton.ca.data.remote.dto.CoinDto
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinPaprikaAPI {

    @GET("/v1/coins/")
    suspend fun getCoins(): List<CoinDto>

    @GET("/v1/coins/{coindId}")
    suspend fun getCoinById(@Path("coindId") coindId: String): CoinDetailDto
}
