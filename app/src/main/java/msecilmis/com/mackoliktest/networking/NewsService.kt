package msecilmis.com.mackoliktest.networking

import android.text.TextUtils
import android.util.Log
import msecilmis.com.mackoliktest.networking.models.GetNewsResponse
import msecilmis.com.mackoliktest.news.NewsItemViewModel
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

                val body = response.body()
                if (body == null) {
                    callback.onFailure("Body null")
                    return
                }

                val channel = body.channel
                if (channel == null) {
                    callback.onFailure("Channel null")
                    return
                }

                val item = channel.item
                if (item == null) {
                    callback.onFailure("Items null")
                    return
                }

                callback.onSuccess(NewsItemViewModel.convert(item))
            }

            override fun onFailure(call: Call<GetNewsResponse>, t: Throwable) {
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