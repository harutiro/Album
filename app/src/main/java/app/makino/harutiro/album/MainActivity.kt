package app.makino.harutiro.album

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val preview = Intent(this,PreviewActivity::class.java)

        albumImage1.setOnClickListener{
            preview.putExtra("image",R.drawable.image3)
            preview.putExtra("title","餃子")
            startActivity(preview)
        }
        albumImage2.setOnClickListener{
            preview.putExtra("image",R.drawable.image1)
            preview.putExtra("title","mohumohu")
            startActivity(preview)
        }
        albumImage3.setOnClickListener{
            preview.putExtra("image",R.drawable.image2)
            preview.putExtra("title","羊")
            startActivity(preview)
        }
        albumImage4.setOnClickListener{
            preview.putExtra("image",R.drawable.image4)
            preview.putExtra("title","あぁ^～心がぴょんぴょんするんじゃぁ^～")
            startActivity(preview)
        }
        albumImage5.setOnClickListener{
            preview.putExtra("image",R.drawable.image5)
            preview.putExtra("title","どろーぴくちゃー")
            startActivity(preview)
        }
        albumImage6.setOnClickListener{
            preview.putExtra("image",R.drawable.image6)
            preview.putExtra("title","kwaii")
            startActivity(preview)
        }

    }
}