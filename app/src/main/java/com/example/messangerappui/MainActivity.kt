package com.example.messangerappui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.messangerappui.adapter.ChatAdapter
import com.example.messangerappui.models.Chat
import com.example.messangerappui.models.Message
import com.example.messangerappui.models.Room

class MainActivity : AppCompatActivity() {

    lateinit var  recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    fun initViews() {
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 1)

        refreshAdapter(getAllChats())
    }

    fun refreshAdapter(chats: ArrayList<Chat>) {
        val adapter = ChatAdapter(this, chats)
        recyclerView!!.adapter = adapter
    }

    fun getAllChats() : ArrayList<Chat> {
        val stroies: ArrayList<Room> = ArrayList()

        stroies.add(Room(R.drawable.im_sample1, "Qobilov Kamron"))
        stroies.add(Room(R.drawable.im_sample2, "Xushvaqtov Azizbek"))
        stroies.add(Room(R.drawable.im_sample3, "Matyaqubov Bogibek"))
        stroies.add(Room(R.drawable.im_sample4, "Mirzayev Mansur"))
        stroies.add(Room(R.drawable.im_sample5, "Buriyev Begzod"))
        stroies.add(Room(R.drawable.im_sample6, "Tojimurodov Diyor"))
        stroies.add(Room(R.drawable.im_sample1, "Qobilov Kamron"))
        stroies.add(Room(R.drawable.im_sample2, "Xushvaqtov Azizbek"))
        stroies.add(Room(R.drawable.im_sample3, "Matyaqubov Bogibek"))
        stroies.add(Room(R.drawable.im_sample4, "Mirzayev Mansur"))
        stroies.add(Room(R.drawable.im_sample5, "Buriyev Begzod"))
        stroies.add(Room(R.drawable.im_sample6, "Tojimurodov Diyor"))
        stroies.add(Room(R.drawable.im_sample2, "Xushvaqtov Azizbek"))
        stroies.add(Room(R.drawable.im_sample3, "Matyaqubov Bogibek"))
        stroies.add(Room(R.drawable.im_sample4, "Mirzayev Mansur"))
        stroies.add(Room(R.drawable.im_sample5, "Buriyev Begzod"))
        stroies.add(Room(R.drawable.im_sample6, "Tojimurodov Diyor"))
        stroies.add(Room(R.drawable.im_sample1, "Qobilov Kamron"))
        stroies.add(Room(R.drawable.im_sample2, "Xushvaqtov Azizbek"))
        stroies.add(Room(R.drawable.im_sample3, "Matyaqubov Bogibek"))
        stroies.add(Room(R.drawable.im_sample4, "Mirzayev Mansur"))
        stroies.add(Room(R.drawable.im_sample3, "Matyaqubov Bogibek"))
        stroies.add(Room(R.drawable.im_sample4, "Mirzayev Mansur"))
        stroies.add(Room(R.drawable.im_sample5, "Buriyev Begzod"))
        stroies.add(Room(R.drawable.im_sample6, "Tojimurodov Diyor"))
        stroies.add(Room(R.drawable.im_sample1, "Qobilov Kamron"))
        stroies.add(Room(R.drawable.im_sample2, "Xushvaqtov Azizbek"))
        stroies.add(Room(R.drawable.im_sample3, "Matyaqubov Bogibek"))
        stroies.add(Room(R.drawable.im_sample4, "Mirzayev Mansur"))
        stroies.add(Room(R.drawable.im_sample5, "Buriyev Begzod"))
        stroies.add(Room(R.drawable.im_sample6, "Tojimurodov Diyor"))
        stroies.add(Room(R.drawable.im_sample2, "Xushvaqtov Azizbek"))
        stroies.add(Room(R.drawable.im_sample3, "Matyaqubov Bogibek"))
        stroies.add(Room(R.drawable.im_sample4, "Mirzayev Mansur"))
        stroies.add(Room(R.drawable.im_sample5, "Buriyev Begzod"))
        stroies.add(Room(R.drawable.im_sample6, "Tojimurodov Diyor"))
        stroies.add(Room(R.drawable.im_sample1, "Qobilov Kamron"))
        stroies.add(Room(R.drawable.im_sample2, "Xushvaqtov Azizbek"))
        stroies.add(Room(R.drawable.im_sample3, "Matyaqubov Bogibek"))

        val chats: ArrayList<Chat> = ArrayList()

        chats.add(Chat(stroies))

        chats.add(Chat(Message(R.drawable.im_sample1, "Qobilov Kamron", false)))
        chats.add(Chat(Message(R.drawable.im_sample2, "Xushvaqtov Azizbek", true)))
        chats.add(Chat(Message(R.drawable.im_sample3, "Matyaqubov Bogibek", true)))
        chats.add(Chat(Message(R.drawable.im_sample4, "Mirzayev Mansur", false)))
        chats.add(Chat(Message(R.drawable.im_sample5, "Buriyev Begzod", true)))
        chats.add(Chat(Message(R.drawable.im_sample6, "Tojimurodov Diyor", false)))
        chats.add(Chat(Message(R.drawable.im_sample1, "Qobilov Kamron", false)))
        chats.add(Chat(Message(R.drawable.im_sample2, "Xushvaqtov Azizbek", true)))
        chats.add(Chat(Message(R.drawable.im_sample3, "Matyaqubov Bogibek", true)))
        chats.add(Chat(Message(R.drawable.im_sample4, "Mirzayev Mansur", false)))
        chats.add(Chat(Message(R.drawable.im_sample5, "Buriyev Begzod", true)))
        chats.add(Chat(Message(R.drawable.im_sample6, "Tojimurodov Diyor", false)))
        chats.add(Chat(Message(R.drawable.im_sample3, "Matyaqubov Bogibek", true)))
        chats.add(Chat(Message(R.drawable.im_sample4, "Mirzayev Mansur", false)))
        chats.add(Chat(Message(R.drawable.im_sample5, "Buriyev Begzod", true)))
        chats.add(Chat(Message(R.drawable.im_sample6, "Tojimurodov Diyor", false)))
        chats.add(Chat(Message(R.drawable.im_sample1, "Qobilov Kamron", false)))
        chats.add(Chat(Message(R.drawable.im_sample2, "Xushvaqtov Azizbek", true)))
        chats.add(Chat(Message(R.drawable.im_sample3, "Matyaqubov Bogibek", true)))
        chats.add(Chat(Message(R.drawable.im_sample4, "Mirzayev Mansur", false)))
        chats.add(Chat(Message(R.drawable.im_sample5, "Buriyev Begzod", true)))
        chats.add(Chat(Message(R.drawable.im_sample6, "Tojimurodov Diyor", false)))
        chats.add(Chat(Message(R.drawable.im_sample1, "Qobilov Kamron", false)))
        chats.add(Chat(Message(R.drawable.im_sample2, "Xushvaqtov Azizbek", true)))
        chats.add(Chat(Message(R.drawable.im_sample3, "Matyaqubov Bogibek", true)))
        chats.add(Chat(Message(R.drawable.im_sample4, "Mirzayev Mansur", false)))
        chats.add(Chat(Message(R.drawable.im_sample5, "Buriyev Begzod", true)))
        chats.add(Chat(Message(R.drawable.im_sample6, "Tojimurodov Diyor", false)))
        chats.add(Chat(Message(R.drawable.im_sample3, "Matyaqubov Bogibek", true)))
        chats.add(Chat(Message(R.drawable.im_sample4, "Mirzayev Mansur", false)))
        chats.add(Chat(Message(R.drawable.im_sample5, "Buriyev Begzod", true)))
        chats.add(Chat(Message(R.drawable.im_sample6, "Tojimurodov Diyor", false)))
        chats.add(Chat(Message(R.drawable.im_sample1, "Qobilov Kamron", false)))
        chats.add(Chat(Message(R.drawable.im_sample2, "Xushvaqtov Azizbek", true)))

        return chats
    }
}