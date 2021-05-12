package com.ericg.multiviewrecyclerview.model

import com.ericg.multiviewrecyclerview.model.ChatModel as chat
import com.ericg.multiviewrecyclerview.model.ChatType.MINE
import com.ericg.multiviewrecyclerview.model.ChatType.OTHER

class Repository {
    fun getChats(): ArrayList<chat>{
        return arrayListOf(
            chat("I appreciate \uD83D\uDE0A... Thank you so much \uD83D\uDE0A",chatType =  MINE),
            chat("It\'s a small thing!", OTHER),
            chat("Have a good night \uD83E\uDD24", OTHER),
            chat("You gon\' sleep too early though\uD83E\uDD14... are you tired?", MINE),
            chat("Early?\nThis must be a joke! \uD83D\uDE02", OTHER),
            chat("Not really...Thought you said you watch till late hours! \uD83D\uDE1C", MINE),
            chat(".", MINE),
            chat("Hey, Good Morning ☕", MINE),
            chat("Good morning cool boy!", OTHER),
            chat("I feel too lazy to get out of my bed \uD83D\uDE34....wgggh", MINE),
            chat("It\'s okay \uD83D\uDE02 \uD83D\uDE02", OTHER),
            chat("I gotta wake up and prepare breakfast but...vyombooooo \uD83E\uDD26\uD83C\uDFFD \uD83E\uDD26\uD83C\uDFFD", MINE),
            chat("Don\'t wo", OTHER),
            chat("*worry", OTHER),
            chat("It\'s okay...let me force myself to do it as usual!", MINE),
            chat("Have you taken breakfast already?", MINE),
            chat("Not yet!", OTHER),
        )
    }
}