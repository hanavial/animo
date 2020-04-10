package com.example.animo

object AnimalData {
    private val animalNames = arrayOf(
        "Ayam",
        "Burung Elang",
        "Gajah",
        "Harimau",
        "Ikan Hiu",
        "Jerapah",
        "Kuda",
        "Monyet",
        "Ikan Paus",
        "Singa"
    )

    private val animalDetails = arrayOf(
        "Ayam adalah sejenis unggas berkaki dua yang banyak dipelihara oleh manusia karena dianggap banyak manfaatnya. Ayam yang sering dipelihara oleh manusia biasanya ayam peliharaan (gallus gallus domesticus). Ayam jenis tersebut merupakan keturunan langsung dari subspesies ayam hutan merah (gallus gallus). Ayam pun mempunyai  jenis kelamin yaitu jantan dan betina. Ayam jantan pada umumya mempunyai ukuran tubuh lebih besar, berjengger lebih besar, ekornya panjang dan bisa berkokok. Ayam betina sebaliknya ukuran tubunya relative lebih kecil, berjengger kecil, dan ekornya pendek. Ayam termasuk hewan yang bersayap tetapi tidak bisa terbang. Hewan ini sangat mudah beradaptasi dengan lingkungan asalkan tersedianya cukup makanan. Ayam biasanya memakan biji – bijian, pur, nasi dan lain – lain.",
        "Burung elang merupakan salah satu dari hewan yang terdapat di seluruh Indonesia. Dalam Bahasa inggris, eagle atau elang merujuk pada burung pemangsa berukuran besar dari suku Accipitridae terutama genus Aquila. Sementara itu burung-burung pemangsa yang lebih kecil dalam Daftar Burung Indonesia nomor 2 disebut Elang atau Alap (Hawk, genus Accipiter).",
        "Gajah adalah  hewan mamalia yang mempunyai ukuran yang besar.Gajah memiliki ciri-ciri seperti, belalai yang panjang,telinga yang besar dan melebar,mempunyai gading, warna kulitnya  abu-abu sampai hitam.Gajah hidup dengan bekelompok, jumlah kelompok 10-30 ekor.Gajah betina akan kawin pada umur 9 tahun dengan masa kehamilan 18-22 bulan.Makanannya berupa ,berbagai jenis bagian dari pohon ( kulit,ranting , daun, dan lain-lain.Gajah hidup pada lingkungan yang bervariasi.",
        "Harimau adalah hewan yang termasuk dalam keluarga felidae atau kucing. Dalam bahasa latin di sebut Panthera trigis. Merupakan sejenis hewan mamalia yang bertulang belakang serta pemakan daging (karnivora). Harimau adalah kucing terbesar yang berukuran seperti singa namun sedikit lebih berat. Umumnya harimau jantan memiliki berat 180 sampai 320 kg dan panjang 2,6-3,3 meter. Sementara harimau betina sekitar 120 sampai 180 kg dan panjang 2,75 meter.",
        "Ikan Hiu adalah sekelompok (superordo Selachimorpha) ikan dengan kerangka tulang rawan yang lengkap dan tubuh yang ramping. Mereka bernapas dengan menggunakan lima liang insang (kadang-kadang enam atau tujuh, tergantung pada spesiesnya) di samping, atau dimulai sedikit di belakang, kepalanya. Hiu mempunyai tubuh yang dilapisi kulit dermal denticles untuk melindungi kulit mereka dari kerusakan, dari parasit, dan untuk menambah dinamika air. Mereka mempunyai beberapa deret gigi yang dapat digantikan.",
        "Jerapah adalah hewan memamah biak yang memiliki ciri khas leher yang panjang dan kulit yang bercorak totol. Jerapah adalah salah satu mamalia tertinggi dengan tinggi hingga 6 meter. Jerapah adalah salah satu mamalia tertinggi di dunia. Jerapah terkenal dengan leher panjang, kaki panjang, dan corak totol pada kulitnya yang khas. Leher jerapah yang panjang ini berfungsi untuk mengambil dedaunan dari pepohonan yang tinggi. Jerapah adalah herbivora yang memakan hanya tetumbuhan saja.",
        "Kuda (Equus caballus atau Equus ferus caballus) adalah salah satu dari sepuluh spesies modern mamalia dari genus Equus. Hewan ini telah lama merupakan salah satu hewan ternak yang penting secara ekonomis, dan telah memegang peranan penting dalam pengangkutan orang dan barang selama ribuan tahun. Kuda dapat ditunggangi oleh manusia dengan menggunakan sadel dan dapat pula digunakan untuk menarik sesuatu, seperti kendaraan beroda, atau bajak. Pada beberapa daerah, kuda juga digunakan sebagai sumber makanan. Walaupun peternakan kuda diperkirakan telah dimulai sejak tahun 4500 SM, bukti-bukti penggunaan kuda untuk keperluan manusia baru ditemukan terjadi sejak 2000 SM. Dalam bahasa Jawa disebut jaran, Bahasa Makassar disebut jarang.",
        "Monyet termasuk golongan primata, makanan ciri khasnya adalah pisang , namanya sering disebut dan disalah gunakan oleh manusia dalam pertengkaran, dia sangat suka dengan kutu, dan postur tubuhnya kecil dan mempunyai ekor yang cukup panjang, ia mempunyai bulu di hampir seluruh tubuhnya, ia juga biasa hidup berkelompok, ia mempunyai bentuk tubuh yang sedikit mirip dengan manusia yaitu mempunyai tangan dan kaki.",
        "Paus adalah makhluk sosial, mamalia bernafas udara, mereka memberi makan anak mereka dengan susu mereka sendiri, dan mereka merawat anak-anak mereka dengan sangat baik dan mengajari mereka keterampilan hidup. Banyak dari kita percaya paus itu istimewa, mereka tentu saja membangkitkan rasa kagum dan perasaan kekeluargaan. Paus termasuk hewan jinak karena banyak jenis ikan paus yang banyak orang bisa bersentuhan dengan mereka. Untuk makanan ikan paus sendiri sangatlah beragam ada yang memakan daging dan ada juga yang hanya memakan plankton.",
        "Singa adalah salah satu hewan karnivora terbesar yang hidup di bumi, memiliki nama latin Panthera Leo, singa hidup di alam liar secara berkelompok. Terdiri dari satu ekor jantan yang berperan sebagai pemimpin sedangkan anggota lainnya adalah betina yang bertugas untuk mencari makanan dengan cara berburu hewan herbivora di sekitar mereka. Singa termasuk ke dalam jenis kucing besar yang mampu hidup hingga usia 10 sampai 15 tahun di alam liar. Namun tak jarang singa juga bisa hidup hingga 20 tahun lamanya."
    )

    private val animalImages = intArrayOf(
        R.drawable.ayam,
        R.drawable.burung_elang,
        R.drawable.gajah,
        R.drawable.harimau,
        R.drawable.hiu,
        R.drawable.jerapah,
        R.drawable.kuda,
        R.drawable.monyet,
        R.drawable.paus,
        R.drawable.singa
    )

    val listData: ArrayList<Animal>
        get() {
            val list = arrayListOf<Animal>()
            for (position in animalNames.indices){
                val animal = Animal()
                animal.name = animalNames[position]
                animal.detail = animalDetails[position]
                animal.photo = animalImages[position]
                list.add(animal)
            }
            return list
        }
}