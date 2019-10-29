package com.example.badgeonmenuitem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.core.view.MenuItemCompat
import kotlinx.android.synthetic.main.custom_action_item_layout.view.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

       menuInflater.inflate(R.menu.main_menu,menu)

        val menuItem: MenuItem = menu!!.findItem(R.id.action)
        val actionView = MenuItemCompat.getActionView(menuItem)

        var textView = actionView.cart_badge

        textView.text = "5"

        return true

    }


}
