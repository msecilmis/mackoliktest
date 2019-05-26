package msecilmis.com.mackoliktest.injection

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import msecilmis.com.mackoliktest.MackolikApplication
import msecilmis.com.mackoliktest.networking.Api
import okhttp3.Cache
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

import javax.inject.Singleton
import java.util.concurrent.TimeUnit


@Module
class NetworkingModule {
    @Provides
    @Singleton
    internal fun okHttpClient(cache: Cache): OkHttpClient {
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY

        return OkHttpClient.Builder()
            .cache(cache)
            .addInterceptor(interceptor)
            .connectTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .build()
    }

    @Provides
    @Singleton
    internal fun retrofit(client: OkHttpClient): Retrofit {
        val gson = GsonBuilder()
            .create()


        val gsonConverterFactory = GsonConverterFactory.create(gson)
        return Retrofit.Builder()
            .client(client)
            .baseUrl("http://www.mobilefeeds.performgroup.com")
            .addConverterFactory(gsonConverterFactory)
            .build()
    }

    @Provides
    @Singleton
    internal fun provideApi(retrofit: Retrofit): Api {
        return retrofit.create(Api::class.java)
    }

    @Provides
    @Singleton
    internal fun cache(app: MackolikApplication): Cache {
        return Cache(app.cacheDir.absoluteFile, (20 * 1024 * 1024).toLong())
    }

}
