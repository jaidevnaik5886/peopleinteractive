package com.shaadi.peopleinteractive.responses.matches


import com.google.gson.annotations.SerializedName
import com.shaadi.peopleinteractive.common.ListItem
import java.io.Serializable

data class Result(
    @SerializedName("cell")
    val cell: String,
    @SerializedName("dob")
    val dob: Dob,
    @SerializedName("email")
    val email: String,
    @SerializedName("gender")
    val gender: String,
    @SerializedName("id")
    val id: Id,
    @SerializedName("location")
    val location: Location,
    @SerializedName("login")
    val login: Login,
    @SerializedName("name")
    val name: Name,
    @SerializedName("nat")
    val nat: String,
    @SerializedName("phone")
    val phone: String,
    @SerializedName("picture")
    val picture: Picture,
    @SerializedName("registered")
    val registered: Registered
): ListItem, Serializable