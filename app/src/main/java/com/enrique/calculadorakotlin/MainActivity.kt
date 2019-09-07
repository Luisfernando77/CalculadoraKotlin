package com.enrique.calculadorakotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import bsh.Interpreter

import java.util.ArrayList


class MainActivity : AppCompatActivity() {
    private var consola: TextView? = null
    private var btn1: Button? = null
    private var btn2: Button? = null
    private var btn3: Button? = null
    private var btn4: Button? = null
    private var btn5: Button? = null
    private var btn6: Button? = null
    private var btn7: Button? = null
    private var btn8: Button? = null
    private var btn9: Button? = null
    private var btn0: Button? = null
    private var btnPor: Button? = null
    private var btnMas: Button? = null
    private var btnMenos: Button? = null
    private var btnIgual: Button? = null
    private var btnPunto: Button? = null
    private var btnCl: Button? = null

    internal lateinit var expr: ArrayList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn0 = findViewById(R.id.btn0) as Button
        btn1 = findViewById(R.id.btn1) as Button
        btn2 = findViewById(R.id.btn2) as Button
        btn3 = findViewById(R.id.btn3) as Button
        btn4 = findViewById(R.id.btn4) as Button
        btn5 = findViewById(R.id.btn5) as Button
        btn6 = findViewById(R.id.btn6) as Button
        btn7 = findViewById(R.id.btn7) as Button
        btn8 = findViewById(R.id.btn8) as Button
        btn9 = findViewById(R.id.btn9) as Button
        btnMas = findViewById(R.id.btnMas) as Button
        btnMenos = findViewById(R.id.btnMenos) as Button
        btnIgual = findViewById(R.id.btnIgual) as Button
        btnPor = findViewById(R.id.btnPor) as Button
        btnPunto = findViewById(R.id.btnPunto) as Button
        btnCl = findViewById(R.id.btnCl) as Button
        consola = findViewById(R.id.consola) as TextView
        expr = ArrayList()

    }

    fun boton1(view: View) {
        expr.add(btn1!!.text.toString())
        var valor = ""
        for (i in expr.indices) {
            valor += expr[i]
            consola!!.text = valor
        }
    }

    fun boton2(view: View) {
        expr.add(btn2!!.text.toString())
        var valor = ""
        for (i in expr.indices) {
            valor += expr[i]
            consola!!.text = valor
        }
    }

    fun boton3(view: View) {
        expr.add(btn3!!.text.toString())
        var valor = ""
        for (i in expr.indices) {
            valor += expr[i]
            consola!!.text = valor
        }
    }

    fun boton4(view: View) {
        expr.add(btn4!!.text.toString())
        var valor = ""
        for (i in expr.indices) {
            valor += expr[i]
            consola!!.text = valor
        }
    }

    fun boton5(view: View) {
        expr.add(btn5!!.text.toString())
        var valor = ""
        for (i in expr.indices) {
            valor += expr[i]
            consola!!.text = valor
        }
    }

    fun boton6(view: View) {
        expr.add(btn6!!.text.toString())
        var valor = ""
        for (i in expr.indices) {
            valor += expr[i]
            consola!!.text = valor
        }
    }

    fun boton7(view: View) {
        expr.add(btn7!!.text.toString())
        var valor = ""
        for (i in expr.indices) {
            valor += expr[i]
            consola!!.text = valor
        }
    }

    fun boton8(view: View) {
        expr.add(btn8!!.text.toString())
        var valor = ""
        for (i in expr.indices) {
            valor += expr[i]
            consola!!.text = valor
        }
    }

    fun boton9(view: View) {
        expr.add(btn9!!.text.toString())
        var valor = ""
        for (i in expr.indices) {
            valor += expr[i]
            consola!!.text = valor
        }
    }

    fun boton0(view: View) {
        expr.add(btn0!!.text.toString())
        var valor = ""
        for (i in expr.indices) {
            valor += expr[i]
            consola!!.text = valor
        }
    }

    fun botonMas(view: View) {
        expr.add(btnMas!!.text.toString())
        var valor = ""
        for (i in expr.indices) {
            valor += expr[i]
            consola!!.text = valor
        }
    }

    fun botonMenos(view: View) {
        expr.add(btnMenos!!.text.toString())
        var valor = ""
        for (i in expr.indices) {
            valor += expr[i]
            consola!!.text = valor
        }
    }

    fun botonPor(view: View) {
        expr.add(btnPor!!.text.toString())
        var valor = ""
        for (i in expr.indices) {
            valor += expr[i]
            consola!!.text = valor
        }
    }

    fun botonPunto(view: View) {
        expr.add(btnPunto!!.text.toString())
        var valor = ""
        for (i in expr.indices) {
            valor += expr[i]
            consola!!.text = valor


        }

    }

    fun botonCl(view: View) {
        consola!!.text = ""
        expr.clear()

    }

    fun botonIgual(view: View) {
        val intptr = Interpreter()
        var valorTotal = ""
        for (i in expr.indices)
            valorTotal += expr[i]
        try {
            intptr.eval("result =$valorTotal")
            val resultado = intptr.get("result").toString()
            expr.clear()
            expr.add(resultado)
            consola!!.setText(resultado)
        } catch (e: Exception) {
            println(e)

        }

    }


}
