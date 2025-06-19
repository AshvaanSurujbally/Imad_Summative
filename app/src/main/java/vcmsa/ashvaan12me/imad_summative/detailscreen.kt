package vcmsa.ashvaan12me.imad_summative

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class detailscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detailscreen)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }//end of oncreate
        //code starts here
        // i declare the variables
        val btnSongList = findViewById<Button>(R.id.btnSongList)
        val btnRating = findViewById<Button>(R.id.btnRating)
        val btnReturn = findViewById<Button>(R.id.btnReturn)
        val tvDisplayAnswers = findViewById<TextView>(R.id.tvDisplayAnswers)
        val tvAverageRating = findViewById<TextView>(R.id.tvAverageRating)
        // now i get the information from the intent which i sent from the main activity
        // used my previous repository to guide me not to catch the items correctly without errros
        //here is the link to the repository: https://github.com/AshvaanSurujbally/Flashcard_App

        val songName = intent.getStringArrayListExtra("songName")
        val artistName = intent.getStringArrayListExtra("artistName")
        val rating = intent.getStringArrayListExtra("rating")
        val comments = intent.getStringArrayListExtra("comments")
        // i make use of logs to check if the information is being received correctly
         Log.d("songName", songName.toString())
         Log.d("artistName", artistName.toString())
         Log.d("rating", rating.toString())
         Log.d("comments", comments.toString())

        // now i display the information on the screen in the textview
        // i use a string builder to display the information on the screen
        // Used information from my previous repository
        // here you can find the link to the repository: https://github.com/AshvaanSurujbally/Flashcard_App/blob/master/app/src/main/java/vcmsa/ashvaan12me/flashcard_app/ReviewAnswers.kt
        // I also used a webiste to asist me in creating this code
        // here you can the link to the website : https://codeql.github.com/codeql-query-help/csharp/cs-stringbuilder-creation-in-loop/
        btnSongList.setOnClickListener {
          // using a loop to display the information on the screen from the arrays
            val sb = StringBuilder()
            for (i in songName!!.indices) {
                sb.append("Song Name: ${songName[i]}")
                sb.append("Artist Name: ${artistName!![i]}")
                sb.append("Rating: ${rating!![i]}")
                sb.append("Comments: ${comments!![i]}")
                sb.append("")
                tvDisplayAnswers.text = sb.toString()
            }
        btnRating.setOnClickListener {
            // i first set the total to 0 so that it counts for zero to start with
            // i used a website for a guide line to create this code but never follow exaclty the method they used
            // here you can find the link to the website : https://www.programiz.com/kotlin-programming/examples/average-arrays
            var total = 0
            // now i use a for loop to add all the ratings together
            for (i in rating!!.indices) {
                total += rating[i].toInt()
            }
            //now i calculate the average by dividing the total by the number of ratings and displys it on the screen on the textview
            val average = total / rating.size
            tvAverageRating.text = "Average Rating: $average"
        }
        // now i set the return button to go back to the main activity

        btnReturn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()



    }


}}}






