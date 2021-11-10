package com.xgt.pfentregarv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import com.xgt.pfentregarv.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private  lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val repoId = intent.getStringExtra("name")
        val repoSelected = (application as App).repo.first { it.repoName == repoId }

        binding.tvName.text = "Nombre:  ${repoSelected.repoName}"
        binding.tvDetails.text = "Descripción:  ${repoSelected.repoDescription}"
        binding.tvLicence.text = "Licencias:  ${repoSelected.license.toString()}"
        binding.tvTags.text = "Tags:  ${repoSelected.tags_url}"
        binding.tvLanguage.text = "Lenguaje:  ${repoSelected.language}"
        Picasso.get()
            .load(repoSelected.owner.avatarImg_url)
            .into(binding.ivAvatar)

    }
}