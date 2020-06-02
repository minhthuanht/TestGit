package gst.trainingcourse.lesson17.ex1.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        Toast.makeText(this, "toi la ai", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "toi la thuan01", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "toi la thuan03", Toast.LENGTH_SHORT).show()
    }
}
