package com.example.demo.controller

import tornadofx.*

class DataService : Controller() {
    fun kittens() = listOf(
            "http://zzuummaa.sytes.net:8070/fileserver/unicorn/images/0102.jpg",
            "http://zzuummaa.sytes.net:8070/fileserver/unicorn/images/0103.jpg",
            "http://zzuummaa.sytes.net:8070/fileserver/unicorn/images/0104.jpg",
            "http://zzuummaa.sytes.net:8070/fileserver/unicorn/images/0105.jpg",
            "http://zzuummaa.sytes.net:8070/fileserver/unicorn/images/0106.jpg",
            "http://zzuummaa.sytes.net:8070/fileserver/unicorn/images/0107.jpg",
            "http://zzuummaa.sytes.net:8070/fileserver/unicorn/images/0108.jpg",
            "http://zzuummaa.sytes.net:8070/fileserver/unicorn/images/0109.jpg",
            "http://zzuummaa.sytes.net:8070/fileserver/unicorn/images/0110.jpg",
            "http://zzuummaa.sytes.net:8070/fileserver/unicorn/images/0111.jpg",
            "http://zzuummaa.sytes.net:8070/fileserver/unicorn/images/0112.jpg")

    fun numbers() = listOf("One", "Two", "Three", "Four", "Five", "Six")
}