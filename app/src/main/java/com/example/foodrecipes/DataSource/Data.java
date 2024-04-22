package com.example.foodrecipes.DataSource;

import com.example.foodrecipes.Model.Category;
import com.example.foodrecipes.R;
import com.example.foodrecipes.Model.Recipes;

import java.util.ArrayList;
import java.util.List;

public class Data {
    public static List<Recipes> recipes1 = generateDataRecipesDummies();
    public static List<Category> categories = generateDataCategoriesDummies();
    public static int idCount = 10;

    private static List<Recipes> generateDataRecipesDummies() {
        List<Recipes> recipes1 = new ArrayList<>();
        recipes1.add(new Recipes(1, "Serabi",
                "- 300 ml santan kelapa\n" +
                        " - 8 sdm tepung beras\n" +
                        " - 5 sdm gula pasir\n" +
                        " - Sejumput garam\n" +
                        " - Ragi instan secukupnya", "Metode",
                "1. Masak santan dengan gula hingga mendidih. Kemudian biarkan santan dingin terlebih dahulu.\n" +
                        " 2. Dalam wadah lain, masukkan tepung beras, garam, ragi dan santan yang telah dingin, campur hingga rata.\n" +
                        " 3. Panaskan cetakan dengan api kecil, dapat juga menggunakan wajan gerabah. Ambilah satu sendok sayur dan tuang ke dalam cetakan.\n" +
                        " 4. Biarkan serabi hingga muncul rongga-rongga dan serabi benar-benar matang. Angkat dan lakukan pada adonan yang masih tersisa.\n" +
                        " 5. Sajikan serabi Jawa dengan parutan kelapa supaya lebih nikmat.",
                R.drawable.serabi, 1));
        recipes1.add(new Recipes(2, "Chiken Shish Kebab",
                "400 gr fillet dada ayam\n" +
                        "- 2 buah paprika merah\n" +
                        "- 50 gr greek yogurt\n" +
                        "- 3 siung bawang putih\n" +
                        "- 1/2 buah lemon\n" +
                        "- 2 sdm Tropicana Slim Extra Virgin Olive Oil\n" +
                        "- 1 sdt bubuk paprika\n" +
                        "- 1/2 sdt jinten bubuk\n" +
                        "- 20 gr pasta tomat\n" +
                        "- 1 sdm Tropicana Slim Kecap Asin\n" +
                        "- 1/4 sdt lada", "Metode",
                "1. Campur semua bahan kecuali paprika merah. Marinasi selama 2 - 6 jam di kulkas.\n" +
                        "2. Campur semua bahan lemon yoghurt dressing dan simpan di kulkas.\n" +
                        "3. Panaskan oven di suhu 200°C. Siapkan tusukan dan susun daging ayam berselang-seling dengan paprika merah.\n" +
                        "4. Panggang selama 15-20 menit dan dibalik saat 8 menit pertama.\n" +
                        "5. Sajikan \"Chicken Shish Kebab\" dengan nasi basmati, salad dan lemon yoghurt dressing.",
                R.drawable.chicken_shish_kebab, 2));
        recipes1.add(new Recipes(3, "Selada Bangkok",
                "- 1 buah mentimun\n" +
                        "- 200 gram nanas\n" +
                        "- 100 gram taoge\n" +
                        "- 200 gram kol\n" +
                        "- 100 gram daun selada\n" +
                        "- 2 butir telur rebus\n" +
                        "Bumbu saus :\n" +
                        "- 150 gram selai kacang\n" +
                        "- 100 ml saus tomat\n" +
                        "- 3 sdm gula pasir\n" +
                        "- 1 sdm air jeruk nipi", "Metode",
                "1. Cuci mentimun,kupas lalu potong sesuai selera.\n" +
                        "2. Kupas nanas,cuci kemudian dipotong kipas.\n" +
                        "3. Taoge dibuang ekornya,dicuci,kemudian seduh dengan air panas,tiriskan.\n" +
                        "4. Cuci kol lalu iris halus sesuai selera.\n" +
                        "5. Daun selada dicuci,disobek kasar.\n" +
                        "6. Untuk membuat saus,campurkan selai kacang dan saus tomat. Aduk hingga rata,tambahkan gula pasir dan air jeruk nipis.\n" +
                        "7. Tata sayuran telur di atas piring saji. Sajikan bersama dengan sausnya.",
                R.drawable.selada_bangkok, 1));
        recipes1.add(new Recipes(4, "Chicken Mushroom",
                "- 250gr Fillet Dada Ayam\n" +
                        "- 50gr Fillet Paha Atas Ayam\n" +
                        "- 250gr Jamur Champignon\n" +
                        "- 2 sachet Tropicana Slim Santan Less Fat\n" +
                        "- 2 sdm Tropicana Slim Corn Oil\n" +
                        "- 2 sdm Bawang Putih Bubuk\n" +
                        "- Parsley bubuk\n" +
                        "- Garam\n" +
                        "- Lada ", "Metode",
                "1. Cuci bersih daging ayam, kemudian potong dadu.\n" +
                        "2. Potong jamur champignon menjadi 4 irisan.\n" +
                        "3. Panaskan Tropicana Slim Corn Oil, kemudian tumis daging ayam, bubuhkan bawang putih bubuk, lalu aduk hingga rata.\n" +
                        "4. Masukkan jamur champignon, aduk sampai teksturnya lembut.\n" +
                        "5. Masukkan Tropicana Slim Santan Less Fat, aduk merata, tambahkan parsley bubuk, garam, dan lada secukupnya. Kemudian aduk merata sampai mendidih, angkat dan sajikan.",
                R.drawable.chicken_mushroom, 2));
        recipes1.add(new Recipes(5, "Pan Seared Shrimp",
                "- 500 gr Udang ukuran besar\n" +
                        "- 2 sdm Tropicana Slim Kecap Asin\n" +
                        "- 1 sdt lada hitam\n" +
                        "- 1 sdm paprika bubuk\n" +
                        "- 1 sdm parsley cincang\n" +
                        "- Tropicana Slim Extra Virgin Olive Oil secukupnya\n" +
                        "- Perasan lemon secukupnya", "Metode",
                "1. Kupas dan bersihkan udang terlebih dahulu. Lumuri dengan Tropicana Slim Kecap Asin, lada hitam, dan paprika bubuk. Diamkan hingga 10 menit.\n" +
                        "2. Panaskan pan dan tuang Tropicana Slim Extra Virgin Olive Oil secukupnya.\n" +
                        "3. Masukkan udang yang sudah dilumuri bumbu dan masak hingga matang.\n" +
                        "4. Sebelum diangkat, tambahkan sedikit perasan lemon dan aduk hingga rata.\n" +
                        "5. Tambahkan parsley cincang dan \"Pan-Seared Shrimp\" siap disajikan hangat.",
                R.drawable.pan_seared_shrimp, 2));
        recipes1.add(new Recipes(6, "Ratatouille",
                "- 1 buah Zucchini\n" +
                        "- 1 buah Terung\n" +
                        "- 1 buah Labu kuning\n" +
                        "- Paprika 3 warna (hijau, merah, kuning)\n" +
                        "- 3 buah Tomat segar\n" +
                        "- Italian Herbs\n" +
                        "- Garam\n" +
                        "- Lada\n" +
                        "- 2 sdm Tropicana Slim Minyak Jagung", "Metode",
                "1. Rebus buah Tomat utuh selama +/- 2 menit, tiriskan, buang kulitnya, potong kemudian buang biji tomatnya, dan potong kotak\n" +
                        "2. Potong dadu zucchini, terung, labu kuning, dan paprika\n" +
                        "3. Tuangkan 2 sdm Tropicana Slim Minyak Jagung ke dalam pan. Saat minyak mulai panas, masukkan labu kuning, kemudian tumis beberapa saat hingga terlihat melembut. Setelah itu, secara satu per satu masukkan paprika kemudian tumis sebentar, masukkan terong dan tumis kembali, masukkan zucchini lalu tumis sebentar, dan terakhir masukkan tomat, kemudian tumis kembali.\n" +
                        "4. Bubuhkan Italian Herbs, aduk merata, masukkan garam dan lada secukupnya. Aduk merata, angkat dan sajikan.",
                R.drawable.ratatouille, 2));
        recipes1.add(new Recipes(7, "Hokkaido Dessert Cup",
                "- 500 ml Tropicana Slim Low Fat Milk Vanilla\n" +
                        "- 50 ml Tropicana Slim Kental Manis\n" +
                        "- 50 gr Maizena\n" +
                        "- 100 gr Tropicana Slim Hokkaido Cheese Cookies\n" +
                        "- 2 sdm Tropicana Slim Kental Manis\n" +
                        "- 200 gr Tropicana Slim Strawberry Jam secukupnya", "Metode",
                "1. Campur semua bahan Vla Susu dan masak hingga mengental. Dinginkan.\n" +
                        "2. Haluskan Tropicana Slim Hokkaido Cheese Cookies dan campur dengan 2 sdm Tropicana Slim Kental Manis, aduk rata.\n" +
                        "3. Susun di dalam cup dengan urutan sebagai berikut: Vla Susu - Tropicana Slim Strawberry Jam - Tropicana Slim Hokkaido Cheese Cookies. Ulangi urutan ini hingga cup penuh.\n" +
                        "4. \"Hokkaido Dessert Cup\" siap disajikan.",
                R.drawable.hokkaido_dessert_cup, 3));
        recipes1.add(new Recipes(8, "Goguma Puto Cheese",
                "- 120 gr terigu protein sedang\n" +
                        "- 25 gr light butter cair\n" +
                        "- 1 butir telur\n" +
                        "- 40 gr Tropicana Slim Korean Goguma Cookies\n" +
                        "- 200 ml Tropicana Slim Low Fat Milk Vanilla\n" +
                        "- 20 gr Tropicana Slim Sweetener Classic Refill\n" +
                        "- 1 sdt baking powder\n" +
                        "- 20 gr keju parut\n" +
                        "- Tropicana Slim Chocolate Spread\n" +
                        "- Kacang sangrai\n" +
                        "- Keju", "Metode",
                "1. Haluskan Tropicana Slim Korean Goguma Cookies terlebih dahulu. Sisihkan.\n" +
                        "2. Di wadah yang lain, campurkan tepung, Tropicana Slim Sweetener Classic Refill, Tropicana Slim Korean Goguma Cookies yang sudah dihaluskan, dan baking powder. Aduk rata menggunakan whisk.\n" +
                        "3. Tambahkan telur, susu Tropicana Slim Low Fat Milk Vanilla, dan butter leleh. Kemudian masukkan keju parut dan aduk kembali.\n" +
                        "4. Tuang adonan ke dalam cetakan ¾ penuh dan kukus selama 30 menit hingga matang.\n" +
                        "5. Setelah matang, tambahkan masing-masing topping dan kukus kembali selama 2 menit. Sajikan hangat.",
                R.drawable.goguma_puto_cheese, 3));
        recipes1.add(new Recipes(9, "Pie Buah",
                "- 50 g oat, haluskan\n" +
                        "        - 30 g Tropicana Slim Sweetener Classic Refill\n" +
                        "        - 1 sdm susu Tropicana Slim Skim Milk Original\n" +
                        "                - 150 g tepung terigu\n" +
                        "                - 50 g margarin canolla\n" +
                        "                - 1 butir kuning telur\n" +
                        "                - 50 ml air es\n" +
                        "                - Buah segar: strawberry, kiwi, jeruk, apel, anggur (pilih sesuai selera)", "Metode",
                "1. Campur oat dengan Tropicana Slim Sweetener Classic Refill, Tropicana Slim Skim Milk Original, tepung terigu dan margarin menjadi serpihan halus. Tambahkan telur dan air es secara bertahap. Aduk rata. Bulatkan dan tutup dengan selembar plastik. Diamkan 15 menit.\n" +
                        "2. Gilas adonan setebal ½ cm. Ratakan dalam loyang. Bentuk pinggirannya hingga rapi. Panggang dalam oven hingga matang.\n" +
                        "3. Vla: Campur tepung terigu, susu, garam, vanili, dan Tropicana Slim Sweetener Classic Refill. Tuangkan air secara bertahap. Tambahkan kuning telur. Aduk. Masak sambil diaduk hingga mengental. Tambahkan margarin. Angkat. Aduk rata hingga dingin.\n" +
                        "4. Semprotkan vla dalam kulit pie. Atur potongan buah di atasnya. Sajikan.",
                R.drawable.pie_buah, 3));
        return recipes1;
    }

    private static List<Category> generateDataCategoriesDummies() {
        List<Category> categories = new ArrayList<>();
        categories.add(new Category(1, "dessert"));
        categories.add(new Category(2, "main course"));
        categories.add(new Category(3, "appetizer"));
        return categories;
    }
}
