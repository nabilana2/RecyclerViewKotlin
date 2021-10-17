package com.example.recyclerviewkotlin

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Kartun(
    val imgKartun: Int,
    val NameKartun: String,
    val descKartun: String

):Parcelable
