package msecilmis.com.mackoliktest.networking

import msecilmis.com.mackoliktest.news.NewsModel

interface INewsService {
    fun getNews(callback: IGetNewsCallback)

    interface IGetNewsCallback {
        fun onSuccess(newsModel: NewsModel)

        fun onFailure(errorMessage: String)
    }
}