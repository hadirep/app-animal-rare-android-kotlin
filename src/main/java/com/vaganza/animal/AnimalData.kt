package com.vaganza.animal

import java.util.ArrayList

object AnimalData {
    private val animalName = arrayOf(
		"Badak Jawa",
		"Burung Cendrawasih",
		"Burung Jalak Bali",
		"Burung Merak",
		"Dugong",
		"Gajah Sumatera",
		"Harimau Sumatera",
		"Ikan Arwana Merah",
		"Komodo",
		"Kura-kura Leher Ular",
		"Macan Tutul Jawa",
		"Orang Utan Kalimantan"
	)

	private val latinName = arrayOf(
		"Rhinoceros sondaicus",
		"Paradisaeidae",
		"Leucopsar rothschildi",
		"Pavo muticus",
		"Dugong dugon",
		"Elephas maximus sumatrensis",
		"Panthera tigris sumatrae",
		"Scleropages formosus",
		"Varanus komodoensis",
		"Chelodina mccordi",
		"Panthera pardus melas",
		"Pongo pygmaeus"
	)

	private val animalFamili = arrayOf(
		"Rhinocerotidae",
		"Paradisaeidae",
		"Sturnidae",
		"Pheasant",
		"Dugongidae",
		"Elephantidae",
		"Felidae",
		"Osteoglossidae",
		"Varanidae",
		"Cheloniidae",
		"Felidae",
		"Hominid"
	)

	private val animalDetail = arrayOf(
		"Badak Jawa atau Badak Bercula satu dengan nama latin Rhinoceros 	sondaicus merupakan Mamalia Terbesar Paling Langka di Dunia, dapat ditemukan di daerah Asia Tenggara, tersebar di Tiongkok. Hingga saat ini hanya ada 60-70 ekor Badak Jawa saja di Indonesia. Badak Jawa sebagai bagian dari famili Rhinocerotidae memiliki tinggi antara 1,4 sampai 1,7 m dan panjang antara 3,1 sampai 3,2 m. Culanya sendiri berukuran lebih kecil dari ukuran cula pada umumnya yaitu kurang lebih 20 cm. Badak dewasa sendiri dilaporkan mempunyai berat antara 900 sampai 2.300 kilogram.Umur badak jawa sendiri dapat mencapai 30-45 tahun di hutan hujan yang ada di dataran rendah, padang rumput basah serta tempat daratan banjir besar. Sekitar 40-50 populasi  badak hidup di Taman Nasional Ujung Kulon di pulau Jawa. Menyusutnya populasinya diakibatkan oleh perburuan liar untuk culanya yang diambil dan dijual dengan harga mencapai $30. 000 per kilogram di pasar gelap, cula ini juga sangat bernilai pada proses pengobatan tradisional Tiongkok.",
		"Burung Cendrawasih dengan habitat asli di dataran rendah ini merupakan burung yang menjadi maskot Pulau Papua. Terbagi menjadi 41 spesies, dan 	tersebar di Papua Barat sebanyak 38 spesiesnya, di pulau torres hingga ke 		Australia bagian timur. Jenis Cendrawasih yang paling dikenal diantaranya 		Cendrawasih Kuning Besar atau Cendrawasih Paradise Apoda.",
		"Burung Jalak Bali atau Bahasa latinnya Leucopsar rothschildi adalah satwa endemis asli dari Bali. Burung Jalak Bali ini ditemukan pada tahun 1910 oleh pakar binatang dari Inggris yaitu Walter rothschild. Jenis burung ini 	memiliki ciri warna biru di sekitar mata dan warna tubuhnya yang putih 	bersih. Burung Jalak Bali masuk sebagai hewan yang terancam punah dan dilindungi oleh pemerintah Indonesia.",
		"Burung Merak. Merak sebagai spesies burung yang termasuk dalam genus pavo dan afropavo dan termasuk familia ayam hutan berasal dari daratan Asia seperti India, Pakistan Nepal Indonesia Myanmar, Burma, dan Afrika Tengah. Khususnya di Indonesia, Burung Merak dapat ditemukan di daerah jawa bagian timur. Habitatnya berada pada area tropis dan alam liar seperti hutan yang dataran rendah dan dekat dengan sumber air yang mengalir.",
		"Dugong sebagai mamalia laut yang hidup indo pasifik, dan dapat dijumpai di sekitar perairan sebelah utara Australia, dapat ditemukan di sepanjang Samudra Hindia dan Pasifik. Dugong juga merupakan kerabat dekat dari gajah 	dengan jumlah yang kian menurun setiap tahunnya. Ia Dugong sebagai salah 	satu Sirenia atau sapi laut yang masih bertahan hidup selain manatee dan 	mampu mencapai usia 70 tahun",
		"Gajah Sumatera dengan nama ilmiah Elephas maximus kini masuk ke dalam satwa yang kian terancam punah berdasarkan laporan IUCN. Hal ini dikarenakan kian menyempitnya habitat tempat tinggalnya serta tingginya tingkat perburuan liar. Menurut data penelitian selama 25 tahun belakangan gajah Sumatera memiliki penurunan hingga 70% habitatnya, dengan jumlah hampir separuh dari jumlah aslinya.",
		"Harimau Sumatra atau dalam Bahasa Latin Panthera Tigris Sondaica 	merupakan spesies Hewan langka yang terancam punah. Hidup di endemis asli  Pulau Sumatra, hingga saat ini hanya tersisa sekitar 500 ekor harimau Sumatra saja hal ini diakibatkan oleh kerusakan habitat hingga tingginya angka kematian (Sejauh yang tercatat adalah 66 ekor harimau sumatera terbunuh sela tahun 1998 dan 2000).Tak sampai disitu Harimau Sumatra juga seringkali beredar di perdagangan ilegal dimana bagian-bagian tubuhnya diperjualbelikan dengan harga tinggi di pasar gelap, yakni untuk dijadikan perhiasan, tas kulit, ikat pinggang dan masih banyak lagi.",
		"Ikan arwana terbagi menjadi beberapa jenis bergantung pada warnanya misalnya pada Arwana silver yang berasal dari Negara Brazil, Arwana hijau (Kalimantan Barat), dan arwana emas (Sumatera dan Malaysia), arwana merah 	sendiri berasa dari Kapuas Hulu, Indonesia dan tersebar di daerah Kalimantan Barat seperti di Sungai Kapuas dan Danau Sentarum. Hewan ini kini telah dinyatakan sebagai hewan langka dan dilindungi oleh Surat Keputusan Bupati kapuas Hulu Nomor 6 Tahun 2001, yang menyatakan 	Danau Lindung Empangau Kalimantan Barat ditetapkan sebagai danau lindung. Sebab kelangkaannya juga disebabkan oleh penangkapan liar masyarakat. Selain itu perairan yang tercemar juga membuat arwana ini sulit untuk 	bertahan hidup. Selain Hukum adat juga diberlakukan yang membuatnya hanya dapat diambil jika ukurannya kurang dari 5cm.",
		"Komodo, sebagai hewan langka pertama di Indonesia juga menjadi satu-	satunya hewan purba yang masih hidup hingga saat ini. Hewan langka ini 	memiliki nama lain Varatus Komodoensis atau Orah juga merupakan salah satu spesies reptil terbesar di dunia. Komodo memiliki gigitan yang sangat kuat serta bisa yang sangat mematikan, racun berbisa ini berasal dari ribuan kelenjar pada area gusinya. Habitat Komodo sendiri saat ini hanya dapat ditemukan di Pulau Komodo, Flores, Gili Matang, Gili Dasami dan Rinca Nusa Tenggara Timur Indonesia.",
		"Kura-kura Leher Ular sebagai salah satu spesies yang masuk ke dalam kategori hewan yang dilindungi di IUCN, ia berasal dari Pulau Rote NTT. 	Kura-kura Leher Ular masuk dalam kategori satwa endemik, dan masuk juga ke 	dalam kategori 25 spesies kura-kura paling terancam punah di dunia.",
		"Macan Tutul Jawa adalah hewan yang dinyatakan langka dan terancam punah 	dan termasuk dalam red list di IUCN. Macan Tutul Jawa juga dilindungi berdasarkan UU 134 Tahun 1931 tentang Perlindungan Binatang Liar. Macan tutul jawa sebagai spesies macan tutul yang memiliki ukuran paling kecil dengan penglihatan yang sangat tajam.",
		"Orangutan baik Orangutan Sumatera maupun Kalimantan masuk ke dalam spesies terancam punah. Berdasarkan dari laporan IUCN melalui penelitian yang telah ia lakukan selama 75 tahun belakangan Hewan ini kian Mengalami penurunan signifikan yaitu sebesar 80%. Tak hanya itu faktanya pada tahun 1998-1999 angka kepunahan Orang Utan Kalimantan mencapai 1000 orangutan per tahun.",
)

private val animalPhoto = intArrayOf(
		R.drawable.badak_jawa,
		R.drawable.burung_cendrawasih,
		R.drawable.burung_jalak_bali,
		R.drawable.burung_merak,
		R.drawable.dugong,
		R.drawable.gajah_sumatera,
		R.drawable.harimau_sumatera,
		R.drawable.ikan_arwana_merah,
		R.drawable.komodo,
		R.drawable.kura_kura_leher_panjang,
		R.drawable.macan_tutul_jawa,
		R.drawable.orang_utan_kalimantan
)

	val animalData : ArrayList<Animal>
		get(){
			val list = arrayListOf<Animal>()
			for (position in animalName.indices){
				val animal = Animal()
				animal.name = animalName[position]
				animal.latin = latinName[position]
				animal.famili = animalFamili[position]
				animal.detail = animalDetail[position]
				animal.photo = animalPhoto[position]
				list.add(animal)
			}
			return list
		}
}