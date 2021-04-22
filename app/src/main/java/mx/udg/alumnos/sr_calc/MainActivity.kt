package mx.udg.alumnos.sr_calc

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity(), View.OnClickListener {

    var operacion = ""
    var operacionPendiente = false

    //Btn Numericos
    lateinit var btn0:Button
    lateinit var btn1:Button
    lateinit var btn2:Button
    lateinit var btn3:Button
    lateinit var btn4:Button
    lateinit var btn5:Button
    lateinit var btn6:Button
    lateinit var btn7:Button
    lateinit var btn8:Button
    lateinit var btn9:Button

    //Btn Operacionales
    lateinit var btnSum:Button
    lateinit var btnRes:Button
    lateinit var btnMult:Button
    lateinit var btnDiv:Button
    lateinit var btnIgual:Button
    lateinit var btnLimpiar:Button

    // TextView
    lateinit var etVisor:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initUI() //Se manda a llamar la funcion

    }

    //Funcion donde se inicializan todos los botones
    private fun initUI(){

        //Inicializar botones numericos
        btn0 = findViewById(R.id.btn0)
        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
        btn4 = findViewById(R.id.btn4)
        btn5 = findViewById(R.id.btn5)
        btn6 = findViewById(R.id.btn6)
        btn7 = findViewById(R.id.btn7)
        btn8 = findViewById(R.id.btn8)
        btn9 = findViewById(R.id.btn9)

        //Inicializar Btn Operacionales
        btnSum = findViewById(R.id.btnSum)
        btnRes = findViewById(R.id.btnRes)
        btnMult = findViewById(R.id.btnMult)
        btnDiv = findViewById(R.id.btnDiv)
        btnIgual = findViewById(R.id.btnIgual)
        btnLimpiar = findViewById(R.id.btnLimpiar)

        //Inicializar TextView
        etVisor = findViewById(R.id.etVisor)

        //Click listener de botones
        btn0.setOnClickListener(this) //Utiliza el listener que se esta implementando en la clase
        btn1.setOnClickListener(this)
        btn2.setOnClickListener(this)
        btn3.setOnClickListener(this)
        btn4.setOnClickListener(this)
        btn5.setOnClickListener(this)
        btn6.setOnClickListener(this)
        btn7.setOnClickListener(this)
        btn8.setOnClickListener(this)
        btn9.setOnClickListener(this)

        //Listener Botones Operacionales
        btnSum.setOnClickListener(this)
        btnRes.setOnClickListener(this)
        btnMult.setOnClickListener(this)
        btnDiv.setOnClickListener(this)
        btnIgual.setOnClickListener(this)
        btnLimpiar.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when(v!!.id){ // !! Se usa para indicar que no es nulo, a fuerzas se le va a dar clic
            R.id.btn0->{ //Que hacer cuando se le da click al boton #1
                etVisor.append("0")
            }
            R.id.btn1->{
                etVisor.append("1")
            }
            R.id.btn2->{
                etVisor.append("2")
            }
            R.id.btn3->{
                etVisor.append("3")
            }
            R.id.btn4->{
                etVisor.append("4")
            }
            R.id.btn5->{
                etVisor.append("5")
            }
            R.id.btn6->{
                etVisor.append("6")
            }
            R.id.btn7->{
                etVisor.append("7")
            }
            R.id.btn8->{
                etVisor.append("8")
            }
            R.id.btn9->{
                etVisor.append("9")
            }

        }
    }
}