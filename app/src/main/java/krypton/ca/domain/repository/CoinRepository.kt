package krypton.ca.domain.repository

import krypton.ca.data.remote.dto.CoinDetailDto
import krypton.ca.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}
