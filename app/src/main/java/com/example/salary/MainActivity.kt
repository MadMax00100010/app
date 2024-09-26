package com.example.salary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.salary.Constance.Constance
import com.example.salary.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass : ActivityMainBinding

    override fun onCreate(s: Bundle?) {

        super.onCreate(s)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
        bindingClass.imageView.visibility = View.VISIBLE


        bindingClass.button.setOnClickListener {

            val User = bindingClass.TT.text.toString()

        when(User) {
            Constance.DVORNIK -> {
                bindingClass.textView3.visibility = View.VISIBLE
                val tempText = "${Constance.DVORNIK_SALARY}"
                if(bindingClass.edTT.text.toString() == Constance.DVORNIK_PASSWORD){

                    bindingClass.textView3.text = tempText
                    bindingClass.imageView.setImageResource(R.drawable.frog)

                } else{
                    bindingClass.textView3.text = "Неверный пароль"
                    bindingClass.imageView.setImageResource(R.drawable.no_money)
                }
            }

            Constance.MEHANIK -> {
                bindingClass.textView3.visibility = View.VISIBLE
                val tempText = "${Constance.MEHANIK_SALARY}"
                if(bindingClass.edTT.text.toString() == Constance.MEHANIK_PASSWORD) {

                    bindingClass.textView3.text = tempText
                    bindingClass.imageView.setImageResource(R.drawable.pokemon)

                } else{
                    bindingClass.textView3.text = "Неверный пароль"
                    bindingClass.imageView.setImageResource(R.drawable.no_money)
                }
            }

            Constance.INJINER -> {
                bindingClass.textView3.visibility = View.VISIBLE
                val tempText = "${Constance.INJINER_SALARY}"
                if(bindingClass.edTT.text.toString() == Constance.INJINER_PASSWORD) {

                    bindingClass.textView3.text = tempText
                    bindingClass.imageView.setImageResource(R.drawable.cat)

                } else{
                    bindingClass.textView3.text = "Неверный пароль"
                    bindingClass.imageView.setImageResource(R.drawable.no_money)
                }
            }

            Constance.DIRECTOR -> {
                bindingClass.textView3.visibility = View.VISIBLE
                val tempText = "${Constance.DIRECTOR_SALARY}"
                if(bindingClass.edTT.text.toString() == Constance.DIRECTOR_PASSWORD) {

                    bindingClass.textView3.text = tempText
                    bindingClass.imageView.setImageResource(R.drawable.marmok)

                } else{
                    bindingClass.textView3.text = "Неверный пароль"
                    bindingClass.imageView.setImageResource(R.drawable.no_money)
                }
            }

            else -> {
                bindingClass.textView3.visibility = View.VISIBLE
                bindingClass.textView3.text = "изменённый текст!!!"
                bindingClass.imageView.setImageResource(R.drawable.no_money)
            }



            Constance.DIRECTOR -> {
                bindingClass.textView3.visibility = View.VISIBLE
                val tempText = "${Constance.DIRECTOR_SALARY}"
                if(bindingClass.edTT.text.toString() == Constance.DIRECTOR_PASSWORD) {

                    bindingClass.textView3.text = tempText
                    bindingClass.imageView.setImageResource(R.drawable.marmok)

                } else{
                    bindingClass.textView3.text = "Неверный пароль"
                    bindingClass.imageView.setImageResource(R.drawable.no_money)
                }
            }



        }

        }
    }
}