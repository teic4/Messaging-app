package com.example.messagingapp.db.firebase


data class FirebaseChat(
    var name: String,
    var chatID: String,
    var userIDs: List<String>,
    var lastMessageID: String,
) {

    constructor() : this("", "", listOf(), "")
}