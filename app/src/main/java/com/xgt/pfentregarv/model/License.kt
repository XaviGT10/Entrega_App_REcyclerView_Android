package com.xgt.pfentregarv.model

import com.google.gson.annotations.SerializedName

data class License(
    @SerializedName("key") val myKey : String,
    @SerializedName("name") val myName : String,
    @SerializedName("spdx_id") val id_spdx : String,
    @SerializedName("url") val myUrl : String,
    @SerializedName("node_id") val id_node : String
)
