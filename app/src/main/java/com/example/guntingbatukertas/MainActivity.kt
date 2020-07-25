package com.example.guntingbatukertas

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.guntingbatukertas.R.drawable
import com.example.guntingbatukertas.databinding.ActivityMainBinding

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

        binding.ivBatuPemain.setOnClickListener{
            pilihan = "batu"
            Log.d("pilihan user", pilihan)
            pilihanCom = gbk.random()

            binding.ivBatuPemain.isClickable = false
            binding.ivGuntingPemain.isClickable = false
            binding.ivKertasPemain.isClickable = false

            binding.ivBatuPemain.setBackgroundResource(drawable.bg_on_click)

            when (pilihanCom) {
                "batu" -> {
                    binding.ivBatuCom.setBackgroundResource(drawable.bg_on_click)
                    binding.ivHasilPertandingan.setImageResource(drawable.draw)
                    Log.d("hasil pertandingan", "Seimbang")
                }
                "gunting" -> {
                    binding.ivGuntingCom.setBackgroundResource(drawable.bg_on_click)
                    binding.ivHasilPertandingan.setImageResource(drawable.pemain_menang)
                    Log.d("hasil pertandingan", "Pemain Menang")
                }
                "kertas" -> {
                    binding.ivKertasCom.setBackgroundResource(drawable.bg_on_click)
                    binding.ivHasilPertandingan.setImageResource(drawable.computer_menang)
                    Log.d("hasil pertandingan", "Computer Menang")
                }
            }
        }

        binding.ivGuntingPemain.setOnClickListener {
            pilihan = "gunting"
            Log.d("pilihan user", pilihan)

            pilihanCom = gbk.random()

            binding.ivBatuPemain.isClickable = false
            binding.ivGuntingPemain.isClickable = false
            binding.ivKertasPemain.isClickable = false

            binding.ivGuntingPemain.setBackgroundResource(drawable.bg_on_click)

            when (pilihanCom) {
                "batu" -> {
                    binding.ivBatuCom.setBackgroundResource(drawable.bg_on_click)
                    binding.ivHasilPertandingan.setImageResource(drawable.computer_menang)
                    Log.d("hasil pertandingan", "Computer Menang")
                }
                "gunting" -> {
                    binding.ivGuntingCom.setBackgroundResource(drawable.bg_on_click)
                    binding.ivHasilPertandingan.setImageResource(drawable.draw)
                    Log.d("hasil pertandingan", "Seimbang")
                }
                "kertas" -> {
                    binding.ivKertasCom.setBackgroundResource(drawable.bg_on_click)
                    binding.ivHasilPertandingan.setImageResource(drawable.pemain_menang)
                    Log.d("hasil pertandingan", "Pemain Menang")
                }
            }
        }

        binding.ivKertasPemain.setOnClickListener {
            pilihan = "kertas"
            Log.d("pilihan user", pilihan)

            pilihanCom = gbk.random()

            binding.ivBatuPemain.isClickable = false
            binding.ivGuntingPemain.isClickable = false
            binding.ivKertasPemain.isClickable = false

            binding.ivKertasPemain.setBackgroundResource(drawable.bg_on_click)

            when (pilihanCom) {
                "batu" -> {
                    binding.ivBatuCom.setBackgroundResource(drawable.bg_on_click)
                    binding.ivHasilPertandingan.setImageResource(drawable.pemain_menang)
                    Log.d("hasil pertandingan", "Pemain Menang")
                }
                "gunting" -> {
                    binding.ivGuntingCom.setBackgroundResource(drawable.bg_on_click)
                    binding.ivHasilPertandingan.setImageResource(drawable.computer_menang)
                    Log.d("hasil pertandingan", "Computer Menang")
                }
                "kertas" -> {
                    binding.ivKertasCom.setBackgroundResource(drawable.bg_on_click)
                    binding.ivHasilPertandingan.setImageResource(drawable.draw)
                    Log.d("hasil pertandingan", "Seimbang")
                }
            }
        }

        binding.ivRestart.setOnClickListener {
            binding.ivBatuPemain.isClickable = true
            binding.ivGuntingPemain.isClickable = true
            binding.ivKertasPemain.isClickable = true

            binding.ivKertasCom.setBackgroundResource(drawable.bg_no_click)
            binding.ivBatuCom.setBackgroundResource(drawable.bg_no_click)
            binding.ivGuntingCom.setBackgroundResource(drawable.bg_no_click)

            binding.ivKertasPemain.setBackgroundResource(drawable.bg_no_click)
            binding.ivBatuPemain.setBackgroundResource(drawable.bg_no_click)
            binding.ivGuntingPemain.setBackgroundResource(drawable.bg_no_click)

            binding.ivHasilPertandingan.setImageResource(drawable.vs)
        }
        
        setContentView(view)
    }
}