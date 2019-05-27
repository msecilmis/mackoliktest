package msecilmis.com.mackoliktest.networking

import android.text.TextUtils
import android.util.Log
import msecilmis.com.mackoliktest.networking.models.GetScoresResponse
import msecilmis.com.mackoliktest.scores.ScoresItemViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ScoresService(private val api: Api) : IScoresService {

    override fun getScores(callback: IScoresService.IGetScoresCallback) {
        api.scores.enqueue(object : Callback<GetScoresResponse> {
            override fun onResponse(call: Call<GetScoresResponse>, response: Response<GetScoresResponse>) {
                if (!response.isSuccessful) {
                    callback.onFailure("Response unsuccessful")
                    return
                }

                val body = response.body()
                if (body == null) {
                    callback.onFailure("Body null")
                    return
                }

                callback.onSuccess(ScoresItemViewModel.convert(body))

            }

            override fun onFailure(call: Call<GetScoresResponse>, t: Throwable) {
                var message = t.message
                if (TextUtils.isEmpty(message) || message == null) {
                    message = "Call Failed"
                }

                callback.onFailure(message)
                Log.d("okhttp log", message)
            }
        })
    }

}