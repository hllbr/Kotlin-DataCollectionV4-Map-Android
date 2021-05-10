package com.hllbr.datacollectionv4_map

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*
        DataCollection : Map(Sözlük)
        Bazı Dillerde Map sözlük olarak ifade edilir.

         */

        println("**********************MAP---------------------------")

        /*
        HashMap veya Map bize verileri/Dizileri birbirleriyle eşleştirme imkanı verdi

        Dizilerden Listelerden Set den faklı olarak içersinde Key/Value ilişkisi olarak tanımlanan Anahtar/Değer ilişkisi bulundurmaktadır

        Bir değere karşılık gelen bir değer mevcuttur

        anahtar String Integer... olabilir değerde aynı şekilde String Integer olabilir.Integer bir ahantara String yada başka bir veri tipinden değer atabilriz.

        Örneğin bir Yiyecek Programı yazdığımız varsayalım

        bir yiyecek ismini anahtar oalrak belirleyip ona karşılık bir kalori değerini değer olarak gönderebilirim

        yada bu işlemi tersten yaparak kalori değerini anahtar olarak belirleyip yiyecek ismini değer olarak gönderebilirim


         */

        val fruitArray = hashMapOf<String,Int>()

        fruitArray.put("Apple",100)
        fruitArray.put("Banana",150)
        fruitArray.put("Orange",5000)
        println("Key/Anahtar ile Değer/Value Çağırma : ")
        println(fruitArray["Apple"])

        var myHashMap = HashMap<String,String>()

        var myNewMap = hashMapOf<String,Int>("H" to 1,"L" to 2,"L" to 3,"B" to 4 ,"R" to 5)//Bu çok kullanılan bir yöntem değil fakat Projelerde bu tarz kullanımlara denk gelebilirim
        



    }
}