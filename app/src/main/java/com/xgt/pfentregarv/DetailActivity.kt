package com.xgt.pfentregarv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.get
import com.squareup.picasso.Picasso
import com.xgt.pfentregarv.databinding.ActivityDetailBinding
import com.xgt.pfentregarv.model.Base
import kotlinx.android.synthetic.main.activity_detail.view.*

class DetailActivity : AppCompatActivity() {

    private  lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val repoId = intent.getStringExtra("Id")
        val positionClicked = intent.action
        val repoSelected = (application as App).repo.first { positionClicked == repoId }

        binding.tvName.text = repoSelected.name
        binding.tvDetails.text = repoSelected.description
        binding.tvLicence.text = repoSelected.license.toString()
        binding.tvTags.text = repoSelected.tags_url
        binding.tvLanguage.text = repoSelected.language
        Picasso.get()
            .load(repoSelected.owner.avatar_url)
            .into(binding.ivAvatar)

    }
}