package com.gmail.susirevsi123.jadwalsholat

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import layout.Kota

class MainActivity : AppCompatActivity() {
    private var listKota: MutableList<Kota>? = null
    private var mKotaAdapter: ArrayAdapter<Kota>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listKota = ArrayList<Kota>()
        mKotaAdapter = ArrayAdapter<Kota>(this, android.R.layout.simple_spinner_item, listKota)
        mKotaAdapter!!.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_kota.adapter = mKotaAdapter
                kota.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            @Override
            fun onNothingSelected(p0: AdapterView<*>?) {
            }
            @Override
            fun onItemSelected(p0: AdapterView<*>?, view: View?, position: Int, val kota = mKotaAdapter!!.getItem(position)
                    loadJadwal(kota.id)
        }
    }
    loadKota()
}
}