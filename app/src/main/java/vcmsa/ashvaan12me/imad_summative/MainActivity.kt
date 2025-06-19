package vcmsa.ashvaan12me.imad_summative

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }//end of onCreate
        // code starts here
        // i first declare the variables needed
        val edtSongTitle = findViewById<EditText>(R.id.edtSongTitle)
        val edtArtistName = findViewById<EditText>(R.id.edtArtistName)
        val edtRating = findViewById<EditText>(R.id.edtRating)
        val edtComments = findViewById<EditText>(R.id.edtComments)
        val btnAddPlaylist = findViewById<Button>(R.id.btnAddPlaylist)
        val btnNextScreen = findViewById<Button>(R.id.btnNextScreen)
        val btnExitApp = findViewById<Button>(R.id.btnExitApp)

        // now i create 4 parallel arrays which take the users data, hold it and display it in the next screen in a string format this will be used in the next screen.
        val songTitleArray = ArrayList<String>()
        val artistNameArray = ArrayList<String>()
        val ratingArray = ArrayList<String>()
        val commentsArray = ArrayList<String>()

        btnAddPlaylist.setOnClickListener {
            // now i get the user inputs and make sure its not empty and also check if the rating is a number because a rating average calculation needs to be done.
            val songTitle = edtSongTitle.text.toString()
            val artistName = edtArtistName.text.toString()
            val rating = edtRating.text.toString()
            val comments = edtComments.text.toString()


            // now i check if any of the blocks are empty and display a  message if they are empty
            if (edtSongTitle.text.toString().isEmpty() || edtArtistName.text.toString().isEmpty()
                || edtRating.text.toString().isEmpty() || edtComments.text.toString().isEmpty()
            )
                Toast.makeText(this, "Please fill all the fields", Toast.LENGTH_SHORT).show()
            // now i check if the user has enter a number for rating for 1-5 and not anything else
            else if (edtRating.text.toString().toInt() < 1 || edtRating.text.toString().toInt() > 5)
                Toast.makeText(this, "Please enter a number between 1-5", Toast.LENGTH_SHORT).show()
            // now i use else to say song added to playlist with a toast meagreness
            // now i make sure the song dpesnt get added if there is a empty box
            else {
                Toast.makeText(this, "Song added to playlist", Toast.LENGTH_SHORT).show()
                // now i clear the edit text blocks
                edtSongTitle.text.clear()
                edtArtistName.text.clear()
                edtRating.text.clear()
                edtComments.text.clear()

                // now i add the user inputs to the array in order to store them and display them in the next screen
                songTitleArray.add(songTitle)
                artistNameArray.add(artistName)
                ratingArray.add(rating)
                commentsArray.add(comments)



            }
            // Now i set the next button to go to the next screen without forgetting to added the user inputs in the arrays
            btnNextScreen.setOnClickListener {
                val intent = Intent(this, detailscreen::class.java)
                // now i added the arrays to the intent to send them to the next screen
                intent.putExtra("songName", songTitleArray)
                intent.putExtra("artistName", artistNameArray)
                intent.putExtra("rating", ratingArray)
                intent.putExtra("comments", commentsArray)
                // i make use og logs to check if the arrays sending propylene to the detail screen
                Log.d("songTitleArray", songTitleArray.toString())
                Log.d("artistNameArray", artistNameArray.toString())
                Log.d("ratingArray", ratingArray.toString())
                Log.d("commentsArray", commentsArray.toString())
                startActivity(intent)
                // used finish() to end this screen
                finish()



                // now i set the exit button to exit the app
                btnExitApp.setOnClickListener {
                    finish()
                }
            }

        }
    }
}