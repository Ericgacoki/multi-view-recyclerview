package com.ericg.multiviewrecyclerview.model

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ericg.multiviewrecyclerview.databinding.MyChatBinding
import com.ericg.multiviewrecyclerview.databinding.OtherChatBinding

private const val MINE = 0 // my chat
private const val OTHER = 1 // other persons' chat

class ChatsAdapter(var chatsList: ArrayList<ChatModel>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemCount(): Int = chatsList.size

    // view holders for chats
    inner class MyChatViewHolder(private val myChat: MyChatBinding) :
        RecyclerView.ViewHolder(myChat.root) {
        fun bind(chat: ChatModel) {
            myChat.myChat.text = chat.text
        }
    }

   inner class OtherChatViewHolder(private val otherChat: OtherChatBinding) :
        RecyclerView.ViewHolder(otherChat.root) {
        fun bind(chat: ChatModel) {
            otherChat.otherChat.text = chat.text
        }
    }

    override fun getItemViewType(position: Int): Int {
        return if (chatsList[position].chatType == ChatType.MINE) MINE else OTHER
    }

    override fun onCreateViewHolder(parent: ViewGroup, chatType: Int): RecyclerView.ViewHolder {
        return if (chatType == MINE) {
            val view = MyChatBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            MyChatViewHolder(view)
        } else {
            val view = OtherChatBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            OtherChatViewHolder(view)
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (getItemViewType(position) == MINE) {
            (holder as MyChatViewHolder).bind(chat = chatsList[position])
        } else {
            (holder as OtherChatViewHolder).bind(chat = chatsList[position])
        }
    }
}