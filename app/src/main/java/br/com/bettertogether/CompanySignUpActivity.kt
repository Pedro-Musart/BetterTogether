package br.com.bettertogether

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CompanySignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_company_signup)

        val backToMainBtn = findViewById<Button>(R.id.backToMain)


        backToMainBtn.setOnClickListener{
            val i = Intent(this,  MainActivity::class.java)
            startActivity(i)
            finish()
    }
}
}