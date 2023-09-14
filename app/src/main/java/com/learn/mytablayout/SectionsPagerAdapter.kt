package com.learn.mytablayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class SectionsPagerAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {

    //Unutuk hal ini anda dapat menggunakan recycleView.Adapter
    override fun getItemCount(): Int {
        return  3
        //Fungsi getItemCount digunakan untuk menentukan jumlah tab yang ingin ditampilkan. Pada kode di atas, Anda mencoba untuk menampilkan
        //dua tab. Pastikan bahwa jumlah yang ditampilkan sesuai dengan Fragment yang didefinisikan oleh fungsi createFragment
    }

    //Fungsi createFragment digunakan untuk menampilkan fragment sesuai dengan posisi tab-nya.
   // Misalnya kode di bawah untuk posisi 0 (tab pertama) menampilkan HomeFragment dan di posisi 1 (tab kedua) menampilkan ProfileFragment
    /*override fun createFragment(position: Int): Fragment {
       var fragment : Fragment? = null
        when (position){
            0 -> fragment = HomeFragment()
            1 -> fragment = ProfileFragment()
        }
        return  fragment as Fragment
    }*/
    //kode yang  di block di atas adalah kode yang tab layout menggunakan 2 fragment

    //ini adlah kode pembuatan fragment yang hanya menggunakan 1 fragment
    override fun createFragment(position: Int): Fragment {
        val fragment = HomeFragment()
        fragment.arguments = Bundle().apply {
            putInt(HomeFragment.ARG_SECTION_NUMBER, position + 1)
        }
        return fragment
    }

}