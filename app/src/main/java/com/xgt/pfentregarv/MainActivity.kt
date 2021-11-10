package com.xgt.pfentregarv

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.xgt.pfentregarv.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvRepos.layoutManager= LinearLayoutManager(this)
        binding.rvRepos.adapter= RepoAdapter(app.repo){
            val detailActivity = Intent(this, DetailActivity::class.java)
            detailActivity.putExtra("name", it.repoName)
            detailActivity.putExtra("description", it.repoDescription)
            detailActivity.putExtra("language", it.language)
            detailActivity.putExtra("tags", it.tags_url)
            detailActivity.putExtra("img", it.owner.avatarImg_url)
            startActivity(detailActivity)
        }
    }
}