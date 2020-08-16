package com.example.lifeisgood

import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.security.MessageDigest
import java.security.NoSuchAlgorithmException

import android.content.pm.PackageManager
import android.util.Base64
import android.util.Log
import java.security.MessageDigest
import java.security.NoSuchAlgorithmException

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var id: TextView
    private lateinit var userName: TextView
    private lateinit var userEmail: TextView
    private lateinit var gender: TextView
    private lateinit var btnLogout: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        try {
            val info = packageManager.getPackageInfo(
                "com.example.lifeisgood", // TODO Change the package name
                PackageManager.GET_SIGNATURES)
            for (signature in info.signatures) {
                val md = MessageDigest.getInstance("SHA")
                md.update(signature.toByteArray())
                Log.d("KeyHash:", Base64.encodeToString(md.digest(), Base64.DEFAULT))
            }
        } catch (e: PackageManager.NameNotFoundException) {

        } catch (e: NoSuchAlgorithmException) {

        }
        if (SharedPrefManager.getInstance(this).isLoggedIn) {
            id = findViewById(R.id.textViewId)
            userName = findViewById(R.id.textViewUsername)
            userEmail = findViewById(R.id.textViewEmail)
            gender = findViewById(R.id.textViewGender)
            btnLogout = findViewById(R.id.buttonLogout)

            val user = SharedPrefManager.getInstance(this).user

            id.text = user.id.toString()
            userEmail.text = user.email
            gender.text = user.gender
            userName.text = user.name

            btnLogout.setOnClickListener(this)

        } else {
            val intent = Intent(this@MainActivity, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    override fun onClick(view: View) {
        if (view == btnLogout) {
            SharedPrefManager.getInstance(applicationContext).logout()
        }
    }
}