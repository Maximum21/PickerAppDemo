package com.martoo.picker

object Config {
    val user_id = "user_id"
    var DB_NAME = "db_cart"
    var token = "mytoken"
    var siteUrl = BuildConfig.SITE_URL


    var cart = "$siteUrl/wp-json/cocart/v1/"

    var consumerKey = BuildConfig.CONSUMER_KEY
    var consumerSecret = BuildConfig.CONSUMER_SECRET

    private const val auth = "/wp-json/jwt-auth/v1"
    val login: String = "$siteUrl$auth/token"
}
