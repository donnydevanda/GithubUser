package com.devanda.githubuser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import org.w3c.dom.Text

class DetailActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_USER = "extra_user"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val user = intent.getParcelableExtra<User>(EXTRA_USER) as User

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = user.username

        val dImage: ImageView = findViewById(R.id.detailImage)
        val dUsername: TextView = findViewById(R.id.detailUsername)
        val dName: TextView = findViewById(R.id.detailName)
        val dCompanyLocation: TextView = findViewById(R.id.detailCompanyLocation)
        val dRepository: TextView = findViewById(R.id.detailRepository)
        val dFollowersFollowing: TextView = findViewById(R.id.detailFollowerFollowing)

        Glide.with(this)
                .load(user.avatar)
                .into(dImage)

        dUsername.text = user.username
        dName.text = user.name
        dCompanyLocation.text = "${user.company} - ${user.location}"
        dRepository.text = "${user.repository} Repositories"
        dFollowersFollowing.text = "${user.follower} Followers - ${user.following} Following"

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return super.onOptionsItemSelected(item)
    }
}