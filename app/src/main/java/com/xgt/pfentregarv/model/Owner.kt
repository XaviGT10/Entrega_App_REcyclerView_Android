package com.xgt.pfentregarv.model

import com.google.gson.annotations.SerializedName

data class Owner(
    @SerializedName("login") val login : String,
    @SerializedName("id") val id : Int,
    @SerializedName("node_id") val node_id : String,
    @SerializedName("avatar_url") val avatarImg_url : String,
    @SerializedName("gravatar_id") val id_GRavatar : String,
    @SerializedName("url") val url : String,
    @SerializedName("html_url") val url_html : String,
    @SerializedName("followers_url") val url_followers : String,
    @SerializedName("following_url") val url_following : String,
    @SerializedName("gists_url") val url_gists : String,
    @SerializedName("starred_url") val url_starred : String,
    @SerializedName("subscriptions_url") val url_subscriptions : String,
    @SerializedName("organizations_url") val url_organizations : String,
    @SerializedName("repos_url") val url_repos : String,
    @SerializedName("events_url") val url_events : String,
    @SerializedName("received_events_url") val received_events_url : String,
    @SerializedName("type") val type : String,
    @SerializedName("site_admin") val site_admin : Boolean
)
