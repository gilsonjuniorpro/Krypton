package krypton.ca.data.repository

import android.content.Context
import krypton.ca.data.remote.CoinPaprikaAPI
import krypton.ca.data.remote.dto.CoinDetailDto
import krypton.ca.data.remote.dto.CoinDto
import krypton.ca.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaAPI
): CoinRepository {

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coindId = coinId)
    }

    fun answerQuestion(context: Context) {

    }
}
