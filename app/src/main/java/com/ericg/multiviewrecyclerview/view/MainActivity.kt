package com.ericg.multiviewrecyclerview.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ericg.multiviewrecyclerview.databinding.ActivityMainBinding
import com.ericg.multiviewrecyclerview.model.ChatModel
import com.ericg.multiviewrecyclerview.model.ChatsAdapter
import com.ericg.multiviewrecyclerview.model.Repository

class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    private var chats = arrayListOf<ChatModel>()
    private lateinit var chatsAdapter: ChatsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initRecyclerView()
    }

    private fun initRecyclerView() {
        chats = Repository().getChats()
        chatsAdapter = ChatsAdapter(chats)

        binding.chatsRecyclerview.apply {
            adapter = chatsAdapter
            smoothScrollToPosition(chats.size - 1)
        }
    }
}