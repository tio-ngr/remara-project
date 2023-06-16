package com.capstone.remara.data

import com.capstone.remara.R

object DataProvider {
    val recipeLists = listOf(
        Recipe(
            id = 1,
            title = "Tempe Orek",
            kategori = "Lauk Pauk",
            bahan = "Bahan :\n" +
                    "5 Lempeng Tempe sedang (Potong kotak)\n"+
                    "3 Siung Bawang Putih (Iris Tipis)\n"+
                    "2-3 Sdm Kecap Manis atau sesuai selera. (Saya Pakai merk Bango)\n"+
                    "2 cm Lengkuas (memarkan)\n"+
                    "2 Lembar Daun Salam\n"+
                    "7 Buah Cabai Merah (Iris serong)\n"+
                    "5 Buah Cabai Hijau (iris serong)\n"+
                    "2 Sdm Saos Sambal\n"+
                    "1 Sdm Kaldu Ayam Bubuk\n"+
                    "1/2 Sdt Gula Pasir\n"+
                    "Secukupnya Garam\n"+
                    "1 Gelas Air\n"+
                    "3 Sdm Minyak untuk menumis\n"+
                    "Bumbu Halus :\n"+
                    "2 Siung Bawang Putih\n"+
                    "2 Buah Bawang Merah\n"+
                    "1/4 Sdt Merica\n"+
                    "Secukupnya Garam\n",
            description =
            "Cara membuat\n" +
                    "1. Siapkan semua bahan orek. Iris bawang putih, potong tempe, memarkan lengkuas dan iris cabai.\n" +
                    "2. Haluskan semua bumbu halus.\n" +
                    "3. Goreng tempe setengah matang.\n"+
                    "4. Panaskan minyak, tumis bawang putih hingga harum. Masukkan lengkuas dan daun salam, tumis sebentar.\n"+
                    "5. Masukkan tempe, kaldu ayam bubuk, gula, garam dan air. Aduk rata.\n"+
                    "6. Terakhir Masukan kecap manis dan saos sambal, aduk kembali, biarkan meresap dan mengering (uji rasa) Angkat\n"+
                    "7. Orek Tempe Pedas Manis siap disajikan. Selamat mencoba \uD83D\uDE01\uD83D\uDC4C\n"+
                    "Catatan : Masukan Kecap dan saos sambal saat posisi air sedikit mengering, baru lanjut dikeringkan benar-benar kering.\n",
            resepImageId = R.drawable.tempeorek
        ),
        Recipe(
            id = 2,
            title = "Ayam Goreng Terasi ala resto",
            kategori = "Lauk Pauk",
            bahan = "Bahan :\n" +
                    "1 ekor ayam potong 12 bagian cuci bersih&tiriskan\n"+
                    "Bumbu Marinasi:\n"+
                    "7 siung bawang putih,haluskan\n"+
                    "1,5 ruas jari jahe,haluskan\n"+
                    "1,5 sdm minyak wijen\n"+
                    "1 sdm saos tiram\n"+
                    "2 sdm kecap asin\n"+
                    "1/2 sdt lada bubuk\n"+
                    "2 sdm tepung maizena\n"+
                    "5 bungkus kecil terasi,sangrai&haluskan\n"+
                    "1/2 sdt kaldu jamur\n"+
                    "Bahan tepung (aduk jadi satu)\n"+
                    "4 sdm tepung maizena\n"+
                    "2 sdm tepung tapioka\n"+
                    "1 sdm tepung terigu\n"+
                    "1 sdm tepung beras\n"+
                    "1/2 sdt baking powder\n",
            description =
            "Cara membuat\n" +
                    "1. Campur bumbu marinasi ke ayam aduk rata kemudian simpan di kulkas min 1 jam/sampai bumbu meresap *di marinasi semalaman lebih bagus\n" +
                    "2. Siapkan bahan tepung\n" +
                    "3. Setelah 1 jam keluarkan ayam masukan bahan tepung campur rata\n"+
                    "4. Kemudian goreng di minyak panas sedang hingga matang merata angkat&tiriskan\n"+
                    "5. Ayam goreng terasi siap di sajikan\uD83D\uDE0A\n\n"+
                    "~ di resep asli ada penambahan air 50 ml tapi di sini saya skip karna ayam nanti pas di\n"+
                    "marinasi mengeluarkan air \uD83D\uDE0A\n\n",
            resepImageId = R.drawable.ayamgoreng
        ),
        Recipe(
            id = 3,
            title = "Dimsum Ayam Udang",
            kategori = "Lauk Pauk",
            bahan = "Bahan :\n" +
                    "1 bungkus kulit pangsit instan (saya beli di pasar ± isi 50 lembar)\n"+
                    "Bahan Dimsum\n"+
                    "1/2 kg dada ayam fillet, haluskan\n"+
                    "200 gr udang, buang kulit dan kepala lalu haluskan\n"+
                    "2 sdm tepung tapioka\n"+
                    "3/4 labu siam ukuran sedang, diparut & dibuang airnya\n"+
                    "1 buah wortel ukuran sedang, parut. ⅔ dicampur adonan dan ⅓ dijadikan topping\n"+
                    "Secukupnya daun bawang yang dipotong-potong\n"+
                    "1/2 sdm garam\n"+
                    "1/2 sdt penyedap rasa\n"+
                    "1/2 sdt merica bubuk\n"+
                    "2 sdm saus tiram\n"+
                    "2 sdm minyak wijen (opsional)\n"+
                    "Bahan saus dimsum\n"+
                    "10 butir cabai merah besar\n"+
                    "5 butir cabai merah keriting\n"+
                    "6 butir cabai rawit merah\n"+
                    "6 butir bawang putih\n"+
                    "3/4 sdt garam, atau secukupnya\n"+
                    "2 sdm gula\n"+
                    "2 sdm cuka\n"+
                    "Larutan maizena (1:1 dengan air hangat)\n"+
                    "300 ml air\n",
            description =
            "Cara membuat\n" +
                    "1. Campurkan seluruh bahan dimsum, lalu letakkan diatas kulit pangsit, bentuk seperti dimsum pada umumnya.\n" +
                    "Tips: sebelum ditekuk-tekuk menutupi adonan, kulit dimsum dicelupkan kedalam air\n" +
                    "selama 1 detik. Fungsinya supaya kulit dimsum tetap stay bentuknya ketika ditekuk-tekuk,\n" +
                    "bentuknya tetap bagus, dan tidak mekar ketika dikukus\n"+
                    "2. Letakkan wortel sebagai topping dimsum. Bisa pakai telur ikan yang warnanya merah (tobiko)\n"+
                    "3. Panaskan kukusan, tatakan kukusan diberi minyak sedikit supaya dimsum mudah diangkat saat sudah matang.\n"+
                    "Kukus dimsum selama 25 s/d 30 menit dengan api sedang.\n" +
                    "Setelah matang, angkat dan taruh dalam wadah.\n"+
                    "4. Untuk Saus dimsum, haluskan cabai besar, cabai keriting, cabai rawit merah, dan bawang putih.\n"+
                    "5. Didihkan air dengan api sedang, masukkan bumbu halus saus dimsum, gula, garam, dan cuka.\n"+
                    "6. Masukkan larutan maizena kedalam air rebusan saus, lalu langsung aduk. Jangan sampai menggumpal!\n"+
                    "7. Matikan api, lalu letakkan saus pada mangkuk dengan cara disaring terlebih dahulu. Siap untuk disajikan.\n",
            resepImageId = R.drawable.dimsumayamudang
        ),
        Recipe(
            id = 4,
            title = "Beff Patty Steak With Blackpepper Sauce",
            kategori = "Lauk Pauk",
            bahan = "Bahan :\n" +
                    "2 buah beef patty homemade\n"+
                    "Bahan Saus Blackpepper :\n"+
                    "1 buah bawang bombay (Iris)\n"+
                    "2 siung bawang putih (iris)\n"+
                    "1 sdm mentega\n"+
                    "1 sdm saus tomat\n"+
                    "1 sdm saus sambal\n"+
                    "2 sdm saus tiram\n"+
                    "1 sdm gula pasir\n"+
                    "1/2 sdt lada hitam bubuk\n"+
                    "1/2 sdt kaldu jamur\n"+
                    "200 ml air\n"+
                    "1 sdm maizena larutkan dengan sedikit air\n"+
                    "Pelengkap :\n"+
                    "Wortel, jagung\n",
            description =
            "Cara membuat\n" +
                    "1. Siapkan teflon, lelehkan margarin. Lalu panggang beef patty selama 4 menit atau sampai matang. Sisihkan.\n" +
                    "2. Cara membuat saus : siapkan teflon, lelehkan mentega, tumis bawang bombay dan\n" +
                    "bawang putih sampai harum. Lalu masukkan saus tomat, saus sambal, saus tiram, gula\n" +
                    "pasir, air, kaldu jamur, lada hitam bubuk, aduk rata. Kemudian masukkan larutan maizena,\n" +
                    "aduk rata. Masak sampai mengental dan cek rasa. Matikan kompor.\n"+
                    "3. Siapkan piring saji, tata beef patty dan siram saus blackpepper di atasnya. Dan beri pelengkap.\n",
            resepImageId = R.drawable.beefsteak
        ),
        Recipe(
            id = 5,
            title = "Udang tofu siram saus jamur",
            kategori = "Lauk Pauk",
            bahan = "Bahan :\n" +
                    "1/4 kg udang kupas\n"+
                    "1 bh tofu\n"+
                    "1 ons jamur merang, belah 4 bagian\n"+
                    "1 bh bawang bombay, iris memanjang\n"+
                    "4 siung bawang putih, iris\n"+
                    "1 batang daun bawang, iris miring\n"+
                    "2 sdm saos tiram\n"+
                    "1 sdt minyak wijen\n"+
                    "Tepung terigu\n"+
                    "Tepung maizena\n"+
                    "Lada halus\n"+
                    "Garam\n",
            description =
            "Cara membuat\n" +
                    "1. Balurkan udang dan tofu yang telah di potong-potong dengan tepung terigu kemudian di goreng hingga matang, sisihkan\n" +
                    "2. Saos jamur: Tumis bawang bombay dan bawang putih hingga harum, kemudian masukan saos tiram dan minyak wijen, tambahkan air secukupnya\n" +
                    "3. Masukan jamur merang, garam, lada (koreksi rasa), masak hingga matang. Kamudian masukan irisan daun bawang.\n" +
                    "4. Larutkan tep maizena dengan air kemudian masukan ke dalam saus jamur yg telah matang, aduk hingga mengental.\n" +
                    "5. Siram/tuangkan saos jamur ke atas udang dan tofu yang telah di goreng.\n",
            resepImageId = R.drawable.udangtofu
        ),
        Recipe(
            id = 6,
            title = "Tongseng Daging Sapi",
            kategori = "Lauk Pauk",
            bahan = "Bahan :\n" +
                    "150 gr daging sapi, iris tipis lawan serat\n"+
                    "Segenggam kol\n"+
                    "1/2 buah tomat besar\n"+
                    "10 buah cabe rawit utuh\n"+
                    "5 sdm kecap manis\n"+
                    "secukupnya Garam dan kaldu jamur\n"+
                    "1 batang daun sereh, geprek\n"+
                    "1 ruas lengkuas, geprek\n"+
                    "Santan, daun salam dan daun jeruk (sy skip krn tidak ada)\n"+
                    "2 gelas air\n"+
                    "Bumbu halus\n"+
                    "2 siung bawang putih\n"+
                    "5 butir bawang merah\n"+
                    "1 sdt ketumbar butir\n"+
                    "1/2 sdt lada butir\n"+
                    "1 ruas kunyit\n"+
                    "1 ruas jahe\n"+
                    "2 butir kemiri\n",
            description =
            "Cara membuat\n" +
                    "1. Haluskan bumbu.\n" +
                    "2. Tumis bumbu hingga matang dan harum. Masukkan sereh lengkuas, dll.\n" +
                    "3. Masukkan daging, aduk.\n" +
                    "4. Masukkan air. Kemudian masukkan kecap.\n" +
                    "5. Setelah air mendidih, masukkan kol, tomat dan cabe. Tutup wajan, biarkan beberapa saat. Setelah kol matang, angkat lalu sajikan.\n\n",
            resepImageId = R.drawable.tongsengdagingsapi
        ),
        Recipe(
            id = 7,
            title = "Bakso telur",
            kategori = "Lauk Pauk",
            bahan = "Bahan :\n" +
                    "20 hard boiled quail eggs (shells removed)\n"+
                    "2 tbsp plain flour (sifted)\n"+
                    "10 shallots (finely sliced)\n"+
                    "3 cloves garlic (finely chopped)\n"+
                    "3 tbsp oil\n"+
                    "5 tbsp Sweet Soy Sauce\n"+
                    "350 ml water\n"+
                    "salt and pepper (to taste)\n"+
                    "mixture\n"+
                    "300 g minced chicken\n"+
                    "1 egg (lightly beaten)\n"+
                    "6 Chinese cabbage leaves (upper green part; finely chopped)\n"+
                    "1 spring onion (finely chopped)\n"+
                    "3 tbsp corn flour\n"+
                    "1/2 tsp salt\n"+
                    "1/4 tsp pepper\n",
            description =
            "Cara membuat\n" +
                    "1. Place mixture ingredients in a large bowl and mix ingredients in a circular motion until well-combined.\n" +
                    "2. Place 2 tbsp of plain flour in a bag and add quail eggs to coat.\n" +
                    "3. Flatten 1 tbsp of the mixture onto the palm of your hand and place one quail egg in the middle of the mixture. Form the mixture into a ball around the quail egg. Repeat this step until all ingredients are used up.\n" +
                    "4. Heat cooking oil and shallow-fry the chicken balls until golden brown. Remove from pan and drain most of the oil.\n" +
                    "5. Sauté sliced shallots and garlic until fragrant. Add pepper, water and sweet soy sauce and bring to the boil.\n"+
                    "6. Condense liquid to half, add the chicken balls, coat and simmer until sauce is further reduced. Remove from heat and serve.\n",
            resepImageId = R.drawable.baksotelur
        ),
        Recipe(
            id = 8,
            title = "Udang tofu siram saus jamur",
            kategori = "Lauk Pauk",
            bahan = "Bahan :\n" +
                    "1/4 kg udang kupas\n"+
                    "1 bh tofu\n"+
                    "1 ons jamur merang, belah 4 bagian\n"+
                    "1 bh bawang bombay, iris memanjang\n"+
                    "4 siung bawang putih, iris\n"+
                    "1 batang daun bawang, iris miring\n"+
                    "2 sdm saos tiram\n"+
                    "1 sdt minyak wijen\n"+
                    "Tepung terigu\n"+
                    "Tepung maizena\n"+
                    "Lada halus\n"+
                    "Garam\n",
            description =
            "Cara membuat\n" +
                    "1. Balurkan udang dan tofu yang telah di potong-potong dengan tepung terigu kemudian di goreng hingga matang, sisihkan\n" +
                    "2. Saos jamur: Tumis bawang bombay dan bawang putih hingga harum, kemudian masukan saos tiram dan minyak wijen, tambahkan air secukupnya\n" +
                    "3. Masukan jamur merang, garam, lada (koreksi rasa), masak hingga matang. Kamudian masukan irisan daun bawang.\n" +
                    "4. Larutkan tep maizena dengan air kemudian masukan ke dalam saus jamur yg telah matang, aduk hingga mengental.\n" +
                    "5. Siram/tuangkan saos jamur ke atas udang dan tofu yang telah di goreng.\n",
            resepImageId = R.drawable.udangtofu
        ),
        Recipe(
            id = 9,
            title = "Udang tofu siram saus jamur",
            kategori = "Lauk Pauk",
            bahan = "Bahan :\n" +
                    "1/4 kg udang kupas\n"+
                    "1 bh tofu\n"+
                    "1 ons jamur merang, belah 4 bagian\n"+
                    "1 bh bawang bombay, iris memanjang\n"+
                    "4 siung bawang putih, iris\n"+
                    "1 batang daun bawang, iris miring\n"+
                    "2 sdm saos tiram\n"+
                    "1 sdt minyak wijen\n"+
                    "Tepung terigu\n"+
                    "Tepung maizena\n"+
                    "Lada halus\n"+
                    "Garam\n",
            description =
            "Cara membuat\n" +
                    "1. Balurkan udang dan tofu yang telah di potong-potong dengan tepung terigu kemudian di goreng hingga matang, sisihkan\n" +
                    "2. Saos jamur: Tumis bawang bombay dan bawang putih hingga harum, kemudian masukan saos tiram dan minyak wijen, tambahkan air secukupnya\n" +
                    "3. Masukan jamur merang, garam, lada (koreksi rasa), masak hingga matang. Kamudian masukan irisan daun bawang.\n" +
                    "4. Larutkan tep maizena dengan air kemudian masukan ke dalam saus jamur yg telah matang, aduk hingga mengental.\n" +
                    "5. Siram/tuangkan saos jamur ke atas udang dan tofu yang telah di goreng.\n",
            resepImageId = R.drawable.udangtofu
        ),
        Recipe(
            id = 10,
            title = "Tumis Tofu Saus Tiram",
            kategori = "Lauk Pauk",
            bahan = "Bahan :\n"+
                "1 buah tofu, balut dengan maizena dan goreng\n"+
                "1 bonggol brokoli, potong dan rendam dengan air garam\n"+
                "2 buah wortel, potong\n"+
                "3 buah sosis, iris serong\n"+
                "1/2 bawang bombay, potong\n"+
                "3 bawang putih, cincang\n"+
                "2 sdm saus tiram\n"+
                "1 sdm kecap asin\n"+
                "1/2 sdm kecap manis\n"+
                "2 sdm gula\n"+
                "Garam\n"+
                "Merica\n"+
                "500 ml air matang\n"+
                "Larutan maizena\n",
        description =
        "Cara membuat\n"+
                "1. Tumis bawang bombay dan bawang putih dengan sedikit minyak sampai harum.\n"+
                "2. Kemudian masukkan wortel dan air, masak sampai agak empuk.\n"+
                "3. Setelah itu, masukkan sosis dan tambahkan semua bumbu.\n"+
                "4. Masukkan brokoli dan tofu, masak sebentar.\n"+
                "5. Lalu tambahkan larutan maizena dan masak sampai mengental.",
        resepImageId = R.drawable.tumistofu
        ),
        Recipe(
            id = 11,
            title = "Tumis Jamur Sosis",
            kategori = "Lauk Pauk",
            bahan = "Bahan :\n" +
                    "250 gr jamur tiram, suwir kasar, cuci, dan tiriskan\n" +
                    "3 buah sosis, potong dan belah tidak putus\n" +
                    "1 buah paprika hijau, iris\n" +
                    "Minyak" +
                    "Bumbu iris:\n" +
                    "4 siung bawang merah\n" +
                    "4 siung bawang putih\n" +
                    "2 buah cabai merah\n" +
                    "Bahan saus:\n" +
                    "1 1/2 sdm saus tiram\n" +
                    "1 sdt saus sambal\n" +
                    "Garam\n" +
                    "Gula\n" +
                    "Merica\n" +
                    "Kaldu bubuk\n" +
                    "100 ml air matang\n",
            description =
            "Cara membuat\n" +
                    "1. Tumis bumbu iris hingga harum, lalu masukkan sosis dan aduk rata.\n" +
                    "2. Masukkan jamur tiram, masak hingga layu. Tambahkan semua bahan saus.\n" +
                    "3. Lalu masukkan paprika dan masak sebentar. Tumis jamur sosis siap disajikan.",
            resepImageId = R.drawable.tumisjamursosis
        ),
        Recipe(
            id = 12,
            title = "Telur Sambal",
            kategori = "Lauk Pauk",
            bahan = "Bahan :\n" +
                    "4 buah telur ayam, rebus matang lalu goreng hingga berkulit\n" +
                    "Bahan sambal (cincang kasar):\n" +
                    "2 siung bawang putih\n" +
                    "8 siung bawang merah\n" +
                    "2 buah cabai merah besar\n" +
                    "10 buah cabai rawit\n" +
                    "Bahan lain:\n" +
                    "1 lembar daun jeruk, buang tulangnya\n" +
                    "1 buah tomat, iris\n" +
                    "1/2sdt terasi matang\n" +
                    "Gula\n" +
                    "Garam\n" +
                    "Kaldu bubuk\n",
            description =
            "Cara membuat\n" +
                    "1. Tumis bahan sambal bersama terasi dan daun jeruk hingga harum dan matang, beri air secukupnya.\n" +
                    "2. Masukkan telur dan irisan tomat, bumbui dengan gula, garam, dan kaldu bubuk, masak hingga air menyusut.\n" +
                    "3. Taburi daun bawang, telur sambal siap disajikan.",
            resepImageId = R.drawable.telursambal
        ),
        Recipe(
            id = 13,
            title = "Bening Bayam",
            kategori = "Sayur Kuah",
            bahan = "Bahan :\n" +
                    "1 ikat bayam, petik daunnya dan cuci bersih\n" +
                    "1 buah jagung\n" +
                    "1 buah wortel\n" +
                    "1 batang serai, geprek\n" +
                    "2 buah bawang merah, iris\n" +
                    "1 buah bawang putih, iris\n" +
                    "Gula\n" +
                    "Garam secukupnya\n" +
                    "Air Secukupnya\n",
            description =
            "Cara membuat\n" +
                    "1. Didihkan air, kemudian masukkan jagung dan wortel.\n" +
                    "2. Lalu masukkan bawang, serai,gula, dan garam.\n" +
                    "3. Masukkan bayam dan aduk sebentar. Setelah matang, sajikan.",
            resepImageId = R.drawable.beningbayam
        ),
        Recipe(
            id = 14,
            title = "Soto Padang",
            kategori = "Kuah",
            bahan = "Bahan :\n" +
                    "500 gram daging sapi (campur dengan tulang).\n" +
                    "2 liter air.\n" +
                    "minyak goreng secukupnya.\n" +
                    "Bahan cemplung :\n" +
                    "4 lembar daun jeruk.\n" +
                    "3 lembar daun salam.\n" +
                    "8 kelopak bunga lawang.\n" +
                    "2 batang sereh digeprek.\n" +
                    "2 batang daun bawang diiris.\n" +
                    "5 buah kapulaga.\n" +
                    "5 buah cengkeh.\n" +
                    "4 cm kayu manis.\n" +
                    "Bumbu halus :\n" +
                    "- 6 buah bawang merah.\n" +
                    "10 siung bawang putih.\n" +
                    "1 ruas kunyi.\n" +
                    "3 ruas lengkuas.\n" +
                    "2 ruas jahe.\n" +
                    "1 sdt pala bubuk.\n" +
                    "2 sdt lada bubuk.\n" +
                    "1 sdm ketumbar bubuk.\n" +
                    "garam.\n" +
                    "Bumbu pelengkap :\n" +
                    "sohun siram dengan air panas, rendam sebentar, angkat dan tiriskan.\n" +
                    "perkedel kentang.\n" +
                    "kerupuk merah.\n" +
                    "kecap.\n" +
                    "cuka.\n" +
                    "sambal.\n" +
                    "seledri diiris halus.\n" +
                    "bawang goreng\n",
            description =
            "Cara memasak\n" +
                    "1. Rebus daging sampai mendidih keluar buihnya, buah buih yang mengapung, masukkan semua bahan cemplung, lanjutkan merebus sampai daging empuk, masukan daun bawang, tunggu layu, matikan kompor, angkat daging, dan tunggu dingin.\n" +
                    "2. Panaskan minyak goreng, tumis bumbu halus sampai wangi, campur bumbu yang sudah ditumis ke dalam air rebusan daging, masak sebentar sampai bumbu dan kaldu menyatu. koreksi rasa.\n" +
                    "3. Iris tipis daging yang sudah direbus, kemudian goreng sampai garing.\n" +
                    "4. Tata sohun, daging didalam mangkok, siram dengan kuah soto, beri kerupuk, perkedel, seledri dan sambal.\n" +
                    "5. Sajikan.",
            resepImageId = R.drawable.sotopadang
        ),
        Recipe(
            id = 15,
            title = "Bubur Manado",
            kategori = "Bubur",
            bahan = "Bahan :\n" +
                    "200 gram beras.\n" +
                    "100 gram ubi kuning, potong dadu .\n" +
                    "150 gram singkong potong dadu.\n" +
                    "2 buah jagung manis dipipil.\n" +
                    "1 kg labu kuning, kukus dan lumatkan dengan garpu.\n" +
                    "4 liter air atau tambahkan sesuai kebutuhan.\n" +
                    "Bahan sayur:\n" +
                    "1 lembar daun kunyit,rajang sehalus mungkin.\n" +
                    "2 batang daun bawang, rajang halus.\n" +
                    "5 lembar daun gedi,rajang halus.\n" +
                    "1 ikat kecil bayam, ambil daun\n" +
                    "1 ikat kangkung, ambil daun dan pucuk mudanya, rajang kasar.\n" +
                    "1 mangkuk kemangi, dari 5 ikat kecil kemangi, ambil daun dan pucuk mudanya saja.\n" +
                    "Bumbu:\n" +
                    "6 bawang putih, cincang halus.\n" +
                    "6 bawang merah iris tipis.\n" +
                    "5 batang serai, ambil bagian putihnya saja dan memarkan.\n" +
                    "2 lembar daun salam.\n" +
                    "1 sdm garam.\n" +
                    "kaldu jamur secukupnya.\n" +
                    "Bumbu pelengkap\n" +
                    "ikan asin goreng.\n" +
                    "sambal dabu dabu atau sambal korek.\n",
            description =
            "Cara memasak\n" +
                    "1. Cuci bersih beras,lalu di panci masukkan air, beras, singkong, ubi masak dengan api kecil sampai singkong dan ubi lembut.\n" +
                    "2. Masukkan bawang putih, bawang merah, daun salam dan serai sambil terus diaduk, masukkan jagung dan labu kuning.\n" +
                    "3. Tambahkan air bila diperlukan, masukkan garam lada dan kaldu jamur aduk rata lagi.\n" +
                    "4. Setelah beras sudah menjadi bubur terakhir masukan semua sayuran aduk rata, koreksi rasa, angkat.",
            resepImageId = R.drawable.buburmanado
        ),
        Recipe(
            id = 16,
            title = "Sop Konro",
            kategori = "Kuah",
            bahan = "Bahan :\n" +
                    "1 kg iga sapi.\n" +
                    "1 lembar daun salam.\n" +
                    "2 lembar daun jeruk.\n" +
                    "1/2 butir kelapa parut kemudian disangrai hingga kering lalu dihaluskan.\n" +
                    "2 cm kayu manis.\n" +
                    "1700 ml air.\n" +
                    "Daun bawang dan Daun Seledri secukupnya.\n" +
                    "Minyak secukupnya.\n" +
                    "Gula pasir,garam,kaldu sapi bubuk secukupnya.\n" +
                    "Bumbu halus :\n" +
                    "6 siung bawang putih.\n" +
                    "10 siung bawang merah.\n" +
                    "2 cm kunyit.\n" +
                    "4 butir kemiri.\n" +
                    "1 buah kluwak.\n" +
                    "5 batang sereh.\n" +
                    "Serimpang lengkuas.\n" +
                    "1 sdt ketumbar bubuk.\n" +
                    "1/4 pala bubuk.\n" +
                    "1/2 sdt merica bubuk.\n" +
                    "1 sdt jinten bubuk.\n" +
                    "Bahan pelengkap :\n" +
                    "Nasi putih atau buras.\n" +
                    "Bawang goreng.\n" +
                    "Sambel & jeruk nipis.\n",
            description =
            "Cara memasak\n" +
                    "1. Presto iga sapi hingga empuk dengan air secukupnya,saring ambil kaldunya 1 liter.\n" +
                    "2. Pindahkan kepanci biasa,masukan iga dan kaldunya lalu tambah air biasa 700 ml atau secukupnya.\n" +
                    "3. Tumis bumbu halus dengan minyak secukupnya hingga wangi,lalu masukan kedalam panci iga,masukan juga daun salam,daun jeruk,kayu manis dan kelapa sangrai yang dihaluskan,aduk rata,beri gula garam dan kaldu sapi bubuk,didihkan cek rasa.\n" +
                    "4. Masukan potongan daun seledri dan daun bawang secukupnya didihkan sebentar matikan api.\n" +
                    "5. Sajikan dimangkok saji lalu taburi bawang goreng.",
            resepImageId = R.drawable.sopkonro
        ),
        Recipe(
            id = 17,
            title = "Sate Lilit Khas Bali",
            kategori = "Sate",
            bahan = "Bahan :\n" +
                    "100 gr kelapa parut.\n" +
                    "300 gr daging ayam (giling).\n" +
                    "1 butir telur ayam.\n" +
                    "2 sdm tapioka.\n" +
                    "4 siung bawang putih.\n" +
                    "5 siung bawang merah.\n" +
                    "3 biji kemiri (sangrai).\n" +
                    "1 cm lengkuas.\n" +
                    "1 cm jahe.\n" +
                    "1 cm kunyit (bakar).\n" +
                    "2 cm kencur.\n" +
                    "1 cm terasi (bakar).\n" +
                    "20 batang bambu atau serai.\n" +
                    "5 buah cabe rawit (boleh lebih).\n" +
                    "garam & merica secukupnya.\n",
            description =
            "Cara memasak\n" +
                    "1. Haluskan bawang merah,bawang putih, kunyit, cabai, kemiri, jahe, kencur, lengkuas dan terasi\n" +
                    "2. Campurkan ayam giling,telur,tapioka,dan kelapa. Beri garam dan merica secukupnya.\n" +
                    "3. Tumis bumbu halus hingga harum lalu campurkan kedalam adonan daging ayam. Aduk rata.\n" +
                    "4. Panaskan Grill Pan dengan api sedang. Ambil sedikit adonan. Masak hingga matang. Lalu cicipi rasanya hingga pas.\n" +
                    "5. Jika rasa sudah pas. Ambil adonan secukupnya dan lilitkan pada batang Bambu atau Batang serai. Lalu panggang di Grill Pan hingga matang.\n" +
                    "6. Untuk Sambal matah : iris bawang merah,daun jeruk,cabai,dan batang serai bagian putihnya saja. Beri sejumput garam. panaskan 2 sdm minyak masukkan terasi. goreng hingga terasi hancur bercampur minyak. lalu campurkan pada bahan irisan. Aduk rata, siap dihidangkan.",
            resepImageId = R.drawable.satelilit
        ),
        Recipe(
            id = 18,
            title = "Candil Ketan",
            kategori = "Bubur",
            bahan = "Bahan :\n" +
                    "30 gr tepung tapioka.\n" +
                    "200 gr tepung ketan.\n" +
                    "1/3 sdt garam.\n" +
                    "air hangat secukupnya.\n" +
                    "Bahan kuah :\n" +
                    "800 ml air.\n" +
                    "150 gula merah, disisir.\n" +
                    "2 lembar daun pandan ditali simpul.\n" +
                    "Bahan larutan pengental :\n" +
                    "1 sdm tepung beras atau boleh lebih jika suka kuah yang kental.\n" +
                    "1 sdm tepung ketan atau boleh lebih jika suka kuah yang kental.\n" +
                    "Campur semua bahan dan tambahkan sedikit air, aduk hingga larut dan tidak ada yang bergerindil.\n" +
                    "Bahan kuah santan :\n" +
                    "1/4 sdt garam.\n" +
                    "400 ml santan kental.\n" +
                    "buah nangka Secukupnya.\n" +
                    "Rebus kuah santan hingga mendidih bersama garam dan daun pandan. Matikan api. Masukan potongan nangka.\n",
            description =
            "Cara memasak\n" +
                    "1. Campur tepung ketan, tepung tapioka dan garam, tuangi air hangat secukupnya sampai adonan lembut dan enak buat dipulung ( kalau terlalu lembek boleh ditambahi tepung ketan lagi).\n" +
                    "2. Siapkan nampan, taburi tipis2 dengan tepung kanji.\n" +
                    "3. Ambil secuil adonan bentuk bulat sebesar kelereng. Susun di atas nampan. Lakukan sampai adonan habis\n" +
                    "4. Masak semua bahan kuah kuah gula merah hingga gula larut dan mendidih.\n" +
                    "5. Saring lalu masak lagi sampai mendidih.\n" +
                    "6. Masukkan bola bola ketan. Masak dengan api kecil hingga gula meresap dan warna bola bola ketan berubah kecoklatan.\n" +
                    "7. Masukkan larutan tepung , aduk pelan sampai kental dan meletup2.\n" +
                    "8. Jika kurang kental bisa ditambahkan tepung ketan/ tepung beras yang dicairkan lalu dimasak lagi sampai kental.\n" +
                    "9. Sajikan dengan kuah santan.",
            resepImageId = R.drawable.candilketan
        ),
        Recipe(
            id = 19,
            title = "Pempek Palembang",
            kategori = "Camilan",
            bahan = "Bahan :\n" +
                    "200 gr terigu.\n" +
                    "400 ml air.\n" +
                    "Garam dan gula Secukupnya .\n" +
                    "Bahan untuk adonan pempek :\n" +
                    "5 siung bawang putih dihaluskan.\n" +
                    "3 butir telur dikocok (dicampur ke dalam adonan pempek).\n" +
                    "400 gr sagu tani.\n" +
                    "Bahan untuk isian :\n" +
                    "2 butir telur dikocok beri sedikit garam dan gula.\n",
            description =
            "Cara memasak\n" +
                    "1. Dalam panci campur terigu, air, garam dan gula. Aduk rata. Nyalakan api, masak sambil diaduk-aduk sampai menggumpal seperti bubur (hati-hati gosong) Angkat. Biarkan hangat.\n" +
                    "2. Pindahkan biang yang sudah tidak panas ke dalam baskom. Dalam keadaan hangat tambahkan bawang putih, telur kocok. Aduk rata pakai sendok kayu.\n" +
                    "3. Masukkan sagu sedikit-sedikit. Aduk rata.\n" +
                    "4. Balur tangan dengan sagu, ambil sebagian adonan bentuk silinder\n" +
                    "5.Buat lubang dengan menggunakan jari telunjuk. Bentuk seperti contong kemudian isi dengan telur kocok\n" +
                    "6. Tutup adonan pempek rapat-rapat supaya tidak terbuka pada saat direbus\n" +
                    "7. Rebus pempek dalam air mendidih sampai matang, angkat.",
            resepImageId = R.drawable.pempek
        ),
        Recipe(
            id = 20,
            title = "Seblak Bandung",
            kategori = "Camilan",
            bahan = "Bahan :\n" +
                    "6 butir bakso.\n" +
                    "200 g ceker.\n" +
                    "2 genggam kerupuk (redam di air biasa 2 jam).\n" +
                    "Bumbu halus:\n" +
                    "3 siung bawang putih.\n" +
                    "4 siung bawang merah.\n" +
                    "3 butir kemiri.\n" +
                    "1 ruas jari kencur.\n" +
                    "6 cabe rawit pedas.\n" +
                    "8 cabe merah keriting.\n" +
                    "5 cabe rawit hijau (untuk irisan).\n" +
                    "1 bonggol sawi sendok.\n" +
                    "1 batang daun bawang.\n" +
                    "Air kaldu rebusan ceker (sesuai selera).\n" +
                    "2 butir telur yang sudah di orak arik.\n" +
                    "Gula, garam, kaldu bubuk, lada bubuk secukupnya.\n",
            description =
            "Cara memasak\n" +
                    "1. Tumis bumbu hingga matang.\n" +
                    "2. Tambahkan bakso, ceker, kerupuk yg sudah di rendam, garam, gula, lada, saus tiram, kaldu bubuk. Masak sebentar.\n" +
                    "3. Tambah air kaldu, masak hingga mendidih.\n" +
                    "4. Masukkan daun sawi, daun bawang, dan cabe rawit iris, masak hingga sayuran matang.",
            resepImageId = R.drawable.seblakbandung
        ),
        Recipe(
            id = 21,
            title = "Batagor Bandung",
            kategori = "Camilan",
            bahan = "Bahan :\n" +
                    "250 gr ikan fillet tenggiri buang kulitnya\n" +
                    "2 butir telur (jika besar boleh pakai 1 butir)\n" +
                    "1/2 sdt meres garam\n" +
                    "1 sdt gula putih\n" +
                    "1/2 sdt lada putih bubuk (optional)\n" +
                    "5 sdm tepung tapioka/sagu\n" +
                    "2 sdm tepung terigu\n" +
                    "4 buah bawang putih potong goreng\n" +
                    "5 buah tahu pong segi4 bagi 2\n" +
                    "1 lembar daun bawang iris tipis\n" +
                    "15 lembar kulit pangsit" +
                    "Sambal Batagor\n" +
                    "100 gr kacang tanah\n" +
                    "6 buah cabai rawit merah\n" +
                    "6 buah cabai merah keriting\n" +
                    "3 buah bawang putih\n" +
                    "100 cc air putih\n" +
                    "1 sdm gula merah\n" +
                    "1/2 sdt garam\n",
            description =
            "Cara memasak\n" +
                    "1. Masukan seluruh bahan kedalam chopper, blender hingga halus, koreksi rasa.\n" +
                    "2. Campurkan irisan daun bawang, aduk hingga rata.\n" +
                    "3. Isi tahu dengan 1 sdm adonan, isi kulit pangsit dengan 1sdt adonan, Goreng dalam api sedang hingga kecoklatan.\n" +
            "Cara memasak Sambal Batagor :\n" +
                    "1. Goreng seluruh bahan.\n" +
                    "2. Blender dengan air, garam, gula.\n" +
                    "3. Siapkan sedikit minyak, masak dalam api kecil hingga mengeluarkan minyak.",
            resepImageId = R.drawable.batagorbandung
        ),
        Recipe(
            id = 22,
            title = "Tahu Tek Surabaya",
            kategori = "Camilan",
            bahan = "Bahan :\n" +
                    "2 Telor\n" +
                    "Tahu putih\n" +
                    "100 gr genggam kacang tanah goreng\n" +
                    "4 siung bawang putih\n" +
                    "Garam dan lada secukupnya.\n" +
                    "Cabe rawit jika suka pedas\n" +
                    "1-2 sdm kecap manis\n" +
                    "1/2 sdm petis udang\n" +
                    "Daun seledri iris tipis2\n" +
                    "Kerupuk bawang yg biasanya juga untuk gado2\n" +
                    "2 genggam Toge rebus\n" +
                    "Lontong atau nasi\n",
            description =
            "Cara memasak\n" +
                    "Bumbu/saus kacang\n" +
                    "1. Goreng kacang tanah hingga matang, boleh digoreng bersama bawang putih dan cabe rawit, sisihkan.\n" +
                    "2. Jika sudah dingin blender semuanya ditambah air matang agar blender tidak berat jalannya.\n" +
                    "3. Tuang di mangkok, tambahkan gula, garam, kecap manis, dan petis udang.\n" +
                    "4. Aduk rata. Boleh ditambah kecap sampai dapat rasa dan warna saus yg diinginkan.\n" +
                    "Tahu telor:\n" +
                    "1. Kocok lepas telor.\n" +
                    "2. Masukkan tahu yg sdh diiris kotak2 kecil tambahkan garam, lada, dan sedikit kaldu bubuk.\n" +
                    "3. Goreng dengan wajan cekung dengan minyak yang panas dan api cenderung. kecil agar tahu matang sempurna.\n" +
                    "Plating:\n" +
                    "1. Iris lontong/nasi tata d piring, letakkan tahu telornya.\n" +
                    "2. Siram sausnya.\n" +
                    "3. Tambahkan toge dan terakhir irisan daun seledrinya.\n" +
                    "4. Tambahkan timun jika suka Jangan lupa kerupuknya.\n" +
                    "5. Sajikan selagi hangat.",
            resepImageId = R.drawable.tahuteksurabaya
        ),
        Recipe(
            id = 23,
            title = "Rawon",
            kategori = "Daging",
            bahan = "Bahan :\n" +
                    "500 gram daging sapi, bagian sandung lumur\n" +
                    "1.500 ml air kaldu sapi\n" +
                    "3 sdm minyak goreng, untuk menumis\n" +
                    "1 sdm garam\n" +
                    "Haluskan:\n" +
                    "6 siung bawang putih\n" +
                    "4 biji keluak (ambil isinya, lalu rendam dalam air)\n" +
                    "5 lembar daun jeruk purut\n" +
                    "8 buah cabai merah\n" +
                    "2 ibu jari lengkuas\n" +
                    "2 cm jahe\n" +
                    "3 cm kunyit\n" +
                    "2 cm kencur\n" +
                    "1/4 sdt jintan\n" +
                    "2 sdm ketumbar\n" +
                    "1/2 sdt merica butir\n" +
                    "4 lembar daun salam\n" +
                    "2 batang serai, memarkan\n" +
                    "2 mata asam jawa, larutkan dengan 1 sdm air\n" +
                    "Pelengkap:\n" +
                    "Sambal terasi\n" +
                    "Kerupuk ikan\n" +
                    "Tauge pendek/kecambah\n" +
                    "Telur bebek asin\n",
            description =
            "Cara memasak\n" +
                    "1. Cuci daging sampai bersih, rebus sampai matang. Angkat dan tiriskan daging, lalu potong ukuran dadu. Sisihkan daging dan air kaldunya.\n" +
                    "2. Panaskan minyak, tumis bumbu halus sampai harum dan matang. Masukkan daging, serai, daun jeruk, air asam, dan garam. Aduk sampai rata dan beraroma.\n" +
                    "3. Pukul-pukul daging sampai melebar. Goreng dalam minyak panas sebentar, angkat. Taburi dengan bawang goreng" +
                    "4. Sajikan selagi hangat.",
            resepImageId = R.drawable.rawon
        ),
        Recipe(
            id = 24,
            title = "Krasengan Koyo",
            kategori = "Daging",
            bahan = "Bahan :\n" +
                    "300 gr daging campur (koyor,urat,tetelan) rebus hingga empuk, potong-potong\n" +
                    "1 batang daun bawang,rajang\n" +
                    "1 buah bawang bombay,rajang\n" +
                    "Bumbu:\n" +
                    "15 cabe rawit (sesuai selera),rebus,lalu haluskan)\n" +
                    "1 ruas kecil jahe,geprek\n" +
                    "1 sdm margarin\n" +
                    "2 sdm baceman bawang\n" +
                    "1 sdt kecap asin\n" +
                    "4 sdm kecap manis (sesuai selera)\n" +
                    "1 sdt minyak wijen\n" +
                    "1 sdt lada hitam (pakai lada putih boleh)\n" +
                    "1 sdm kecap inggris\n" +
                    "Gula,garam,kaldu bubuk secukupnya\n",
            description =
            "Cara memasak\n" +
                    "1. Panaskan wajan,tumis baceman bawang bersama margarin,bawang bombay dan jahe hingga harum\n" +
                    "2. Beri air secukupnya,masukkan potongan daging yang telah direbus\n" +
                    "3. Masukkan ulekan cabe dan bumbui dengan kecap inggris,kecap asin,kecap manis,gula,garam,lada hitam dan juga kaldu bubuk aduk-aduk hingga rata\n" +
                    "4. Resep masakan nusantara\n" +
                    "5. Kecilkan api,tunggu hingga bumbu meresap\n" +
                    "6. Terakhir koreksi rasa,taburi dengan irisan daun bawang dan juga minyak wijen,aduk sebentar lalu angkat dan sajikan bersama nasi panas",
            resepImageId = R.drawable.krasengankoyo
        ),
        Recipe(
            id = 25,
            title = "Kalumpe Kalimantan",
            kategori = "Ikan",
            bahan = "Bahan: \n" +
                    "200 gram daun singkong, tumbuk halus. Jika tidak mau menumbuk, di pasar-pasar tradisional Kalimantan Tengah banyak orang yang menjual daun singkong yang sudah ditumbuk.\n" +
                    "100 gram terong kecil atau terong pipit\n" +
                    "1 batang lengkuas\n" +
                    "3 batang serai memarkan\n" +
                    "1 lembar daun salam\n" +
                    "1 ruas lengkuas\n" +
                    "1 gelas santan kental\n" +
                    "Bumbu halus:\n" +
                    "cabai rawit sesuai selera\n" +
                    "garam secukupnya\n" +
                    "1/4 ruas jahe\n" +
                    "1 butir kemiri sangrai\n" +
                    "3 butir bawang merah\n" +
                    "2 siung bawang putih\n",
            description =
            "Cara memasak\n" +
                    "1. Tumis bumbu halus dengan daun singkong tumbuk. Campur irisan lengkuas dan daun salam.\n" +
                    "2. Tuang santan kental, masak dengan api kecil hingga matang.",
            resepImageId = R.drawable.kalumpe
        ),
    )
}
