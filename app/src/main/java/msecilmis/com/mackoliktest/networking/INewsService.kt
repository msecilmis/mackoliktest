package msecilmis.com.mackoliktest.networking

import msecilmis.com.mackoliktest.news.NewsItemViewModel

interface INewsService {
    fun getNews(callback: IGetNewsCallback)

    interface IGetNewsCallback {
        fun onSuccess(newsViewModels: List<NewsItemViewModel>)

        fun onFailure(errorMessage: String)
    }
}