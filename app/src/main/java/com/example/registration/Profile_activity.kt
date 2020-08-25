package com.example.registration

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_profile_activity.*

class Profile_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_activity)
    }

    private fun ambilData() {
        val bundle = intent.extras
        val nama = bundle?.getString("nama")
        val toko = bundle?.getString("toko")
        val jenis = bundle?.getString("jenis")
        val time = bundle?.getString("time")
        val gender = bundle?.getString("gender")
        val email = bundle?.getString("email")
        val telp = bundle?.getString("telp")
        val alamat = bundle?.getString("alamat")

        txtName.text = nama
        txttoko.text = toko
        txtjenis.text = jenis
        txttime.text = time
        txtGender.text = gender
        txtEmail.text = email
        txtTelp.text = telp
        txtAddress.text = alamat
    }
}
