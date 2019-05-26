package msecilmis.com.mackoliktest.networking

import android.text.TextUtils
import msecilmis.com.mackoliktest.networking.models.GetNewsResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class NewsService(private val api: Api) : INewsService {

    override fun getNews(callback: INewsService.IGetNewsCallback) {
        api.news.enqueue(object : Callback<GetNewsResponse> {
            override fun onResponse(call: Call<GetNewsResponse>, response: Response<GetNewsResponse>) {
                if (!response.isSuccessful) {
                    callback.onFailure("Response unsuccessful")
                    return
                }


            }

            override fun onFailure(call: Call<GetNewsResponse>, t: Throwable) {
                var message = t.message
                if (TextUtils.isEmpty(message) || message == null) {
                    message = "Call Failed"
                }

                callback.onFailure(message)
            }
        })
    }

}