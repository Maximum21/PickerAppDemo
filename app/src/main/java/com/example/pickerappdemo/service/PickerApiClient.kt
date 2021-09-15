package dev.beema.app.framework.service

import android.content.Context
import com.example.pickerappdemo.BuildConfig
import com.example.pickerappdemo.service.WebApiService
import okhttp3.*
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit


class PickerApiClient(context: Context, key:String) {

    private lateinit var apiService: WebApiService

    init {
            val httpClient = OkHttpClient.Builder()
            httpClient.readTimeout(30,TimeUnit.SECONDS)
            httpClient.connectTimeout(30, TimeUnit.SECONDS)

            val dispatcher = Dispatcher()
            dispatcher.maxRequests = 1


//            httpClient.addNetworkInterceptor(interceptorBuilder.build())
            httpClient.dispatcher(dispatcher)
            httpClient.addInterceptor(Interceptor { chain ->
                val original: Request = chain.request()
                val request: Request = original.newBuilder()
                    .header("API-KEY", key)
                    .header("Content-Type", "application/json")
                    .method(original.method, original.body)
                    .build()
                chain.proceed(request)
            })
            val retrofit: Retrofit = Retrofit.Builder()
                .baseUrl(BuildConfig.SITE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient.build())
                .build()

            apiService = retrofit.create(WebApiService::class.java)

        }

//    fun getUserDetails(): Call<UserData>{
//        return apiService.getUserDetails()
//    }
//    fun getUserLinking(installId: String?): Call<UserLinkingResponse>{
//        return apiService.getUserDetails(installId)
//    }
//    fun setEvent(event: NotifyEvent): Call<NotifyEventResponse> {
//        return apiService.setEvent(event)
//    }
//    fun updateBehaviours(event: UpdateBehaviourEvent, behaviour_id: String) : Call<UpdateBehaviourResponse>{
//        return apiService.updateBehaviour(event,behaviour_id)
//    }
//    fun updatePermissions(event: HashMap<String,HashMap<String,String>>, behaviour_id: String) : Call<UpdateBehaviourResponse>{
//        return apiService.updatePermissions(event,behaviour_id)
//    }
}