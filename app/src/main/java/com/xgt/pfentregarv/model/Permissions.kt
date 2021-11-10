package com.xgt.pfentregarv.model

import com.google.gson.annotations.SerializedName

data class Permissions(
    @SerializedName("admin") val admin : Boolean,
    @SerializedName("maintain") val maintain : Boolean,
    @SerializedName("push") val push : Boolean,
    @SerializedName("triage") val triage : Boolean,
    @SerializedName("pull") val pull : Boolean
)
