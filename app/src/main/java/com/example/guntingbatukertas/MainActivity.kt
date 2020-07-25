package com.example.guntingbatukertas

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.guntingbatukertas.R.drawable
import com.example.guntingbatukertas.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import java.lang.NullPointerException

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        try {
            this.supportActionBar?.hide()
        } catch (e: NullPointerException) {}

        val binding = ActivityMainBinding.inflate(layoutInflater)

        val gbk = listOf("batu", "gunting", "kertas")

        val view = binding.root
        var pilihan: String
        var pilihanCom: String

        view.ivBatuPemain.setOnClickListener{
            pilihan = "batu"
            Log.d("pilihan user", pilihan)
            pilihanCom = gbk.random()

            view.ivBatuPemain.setBackgroundResource(drawable.bg_on_click)
            view.ivKertasPemain.setBackgroundResource(drawable.bg_no_click)
            view.ivGuntingPemain.setBackgroundResource(drawable.bg_no_click)

            when (pilihanCom) {
                "batu" -> {
                    view.ivBatuCom.setBackgroundResource(drawable.bg_on_click)
                    ivGuntingCom.setBackgroundResource(drawable.bg_no_click)
                    ivKertasCom.setBackgroundResource(drawable.bg_no_click)
                    ivHasilPertandingan.setImageResource(drawable.draw)
                    Log.d("hasil pertandingan", "Seimbang")
                }
                "gunting" -> {
                    ivGuntingCom.setBackgroundResource(drawable.bg_on_click)
                    ivBatuCom.setBackgroundResource(drawable.bg_no_click)
                    ivKertasCom.setBackgroundResource(drawable.bg_no_click)
                    ivHasilPertandingan.setImageResource(drawable.pemain_menang)
                    Log.d("hasil pertandingan", "Pemain Menang")
                }
                "kertas" -> {
                    ivKertasCom.setBackgroundResource(drawable.bg_on_click)
                    ivBatuCom.setBackgroundResource(drawable.bg_no_click)
                    ivGuntingCom.setBackgroundResource(drawable.bg_no_click)
                    ivHasilPertandingan.setImageResource(drawable.computer_menang)
                    Log.d("hasil pertandingan", "Computer Menang")
                }
            }
        }

        view.ivGuntingPemain.setOnClickListener {
            pilihan = "gunting"
            Log.d("pilihan user", pilihan)
            pilihanCom = gbk.random()

            ivGuntingPemain.setBackgroundResource(drawable.bg_on_click)
            ivKertasPemain.setBackgroundResource(drawable.bg_no_click)
            ivBatuPemain.setBackgroundResource(drawable.bg_no_click)

            when (pilihanCom) {
                "batu" -> {
                    ivBatuCom.setBackgroundResource(drawable.bg_on_click)
                    ivGuntingCom.setBackgroundResource(drawable.bg_no_click)
                    ivKertasCom.setBackgroundResource(drawable.bg_no_click)
                    ivHasilPertandingan.setImageResource(drawable.computer_menang)
                    Log.d("hasil pertandingan", "Computer Menang")
                }
                "gunting" -> {
                    ivGuntingCom.setBackgroundResource(drawable.bg_on_click)
                    ivBatuCom.setBackgroundResource(drawable.bg_no_click)
                    ivKertasCom.setBackgroundResource(drawable.bg_no_click)
                    ivHasilPertandingan.setImageResource(drawable.draw)
                    Log.d("hasil pertandingan", "Seimbang")
                }
                "kertas" -> {
                    ivKertasCom.setBackgroundResource(drawable.bg_on_click)
                    ivBatuCom.setBackgroundResource(drawable.bg_no_click)
                    ivGuntingCom.setBackgroundResource(drawable.bg_no_click)
                    ivHasilPertandingan.setImageResource(drawable.pemain_menang)
                    Log.d("hasil pertandingan", "Pemain Menang")
                }
            }
        }

        view.ivKertasPemain.setOnClickListener {
            pilihan = "kertas"
            Log.d("pilihan user", pilihan)
            pilihanCom = gbk.random()

            ivKertasPemain.setBackgroundResource(drawable.bg_on_click)
            ivBatuPemain.setBackgroundResource(drawable.bg_no_click)
            ivGuntingPemain.setBackgroundResource(drawable.bg_no_click)

            when (pilihanCom) {
                "batu" -> {
                    ivBatuCom.setBackgroundResource(drawable.bg_on_click)
                    ivGuntingCom.setBackgroundResource(drawable.bg_no_click)
                    ivKertasCom.setBackgroundResource(drawable.bg_no_click)
                    ivHasilPertandingan.setImageResource(drawable.pemain_menang)
                    Log.d("hasil pertandingan", "Pemain Menang")
                }
                "gunting" -> {
                    ivGuntingCom.setBackgroundResource(drawable.bg_on_click)
                    ivBatuCom.setBackgroundResource(drawable.bg_no_click)
                    ivKertasCom.setBackgroundResource(drawable.bg_no_click)
                    ivHasilPertandingan.setImageResource(drawable.computer_menang)
                    Log.d("hasil pertandingan", "Computer Menang")
                }
                "kertas" -> {
                    ivKertasCom.setBackgroundResource(drawable.bg_on_click)
                    ivBatuCom.setBackgroundResource(drawable.bg_no_click)
                    ivGuntingCom.setBackgroundResource(drawable.bg_no_click)
                    ivHasilPertandingan.setImageResource(drawable.draw)
                    Log.d("hasil pertandingan", "Seimbang")
                }
            }
        }



        setContentView(view)
    }
}