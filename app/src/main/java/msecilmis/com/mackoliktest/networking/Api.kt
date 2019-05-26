package msecilmis.com.mackoliktest.networking

import msecilmis.com.mackoliktest.networking.models.GetNewsResponse
import msecilmis.com.mackoliktest.networking.models.GetScoresResponse
import retrofit2.Call
import retrofit2.http.GET

interface Api {
    @get:GET(value = "/utilities/interviews/techtest/latestnews.xml")
    val news: Call<GetNewsResponse>

    @get:GET(value = "/utilities/interviews/techtest/scores.xml")
    val scores: Call<GetScoresResponse>

}
