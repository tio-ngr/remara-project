package com.capstone.remara.data

import com.capstone.remara.R

object DataProvider {
    val recipeLists = listOf(
        Recipe(
            id = 1,
            title = "Tumis Buncis Udang",
            kategori = "Sayuran",
            bahan = "Bahan : " +
                    "100 gr udang loreng, kupas, bersihkan\n" +
                    "100 gr baby buncis, iris serong\n" +
                    "Garam\n" +
                    "Gula\n" +
                    "Penyedap rasa\n" +
                    "1 buah cabai merah besar, iris serong\n" +
                    "1 buah cabai hijau besar, iris serong",
            description =  "Cara membuat\n" +
                    "1. Tumis bumbu halus, beri air sedikit dan masak sampai harum.\n" +
                    "2. Masukkan buncis dan irisan cabai hijau, lalu tambahkan gula, garam, dan penyedap, aduk rata.\n" +
                    "3. Terakhir masukkan udang, masak sampai udang berubah warna dan matang. Angkat dan sajikan.",
            resepImageId = R.drawable.tumisbuncis
        ),
        Recipe(
            id = 2,
            title = "Bolu Kukus Keju",
            kategori = "Kue",
            bahan = "Bahan\n" +
                    "100 gram tepung terigu, diayak\n" +
                    "6 butir telur ayam\n" +
                    "100 gram gula pasir\n" +
                    "7 sdm kental manis putih\n" +
                    "60 gram susu bubuk vanila\n" +
                    "50 ml minyak goreng\n" +
                    "75 gram keju parut",
            description =  "\n" +
                    "Cara membuat\n" +
                    "Campur telur, SP, da gula. Kocok dengan mixer hingga putih mengental.\n" +
                    "Masukkan tepung terigu. Kocok dengan mixer berkecepatan sedang.\n" +
                    "Campur susu bubuk dan kental manis, aduk rata. Tuang ke dalam adonan. Tambahkan keju. Aduk hingga rata dengan spatula.\n" +
                    "Panaskan kukusan. Tuang adonan ke loyang yang sudah dilapisi mentega dan terigu. Kukus selama kurang lebih 40 menit. Angkat dan sajikan.",
            resepImageId = R.drawable.bolukukus
        ),
        Recipe(
            id = 3,
            title = "Coffe Boba Milk",
            kategori = "Minuman Segar",
            bahan = "Bahan\n" +
                    "1 1/2 sdt kopi instan tanpa ampas \n" +
                    "2 sdt palm sugar/gula aren \n" +
                    "40 gram boba atau sesuai selera \n" +
                    "30 gram sirup karamel \n" +
                    "Susu cair full cream sesuai selera \n" +
                    "Air panas untuk menyeduh kopi\n" +
                    "Es batu secukupnya",
            description = "\n" +
                    "Cara membuat\n" +
                    "Seduh kopi dan palm sugar dengan air panas, aduk rata, lalu sisihkan. \n" +
                    "Rebus boba sampai matang. \n" +
                    "Masukkan boba yang sudah matang ke dalam gelas. \n" +
                    "Tuang sirup karamel. Tambahkan es batu. \n" +
                    "Masukkan susu cair full cream. Tuang seduhan kopi dan palm sugar, aduk merata. Es kopi susu boba siap disajikan.",
            resepImageId = R.drawable.kopiboba
        )

    )
}