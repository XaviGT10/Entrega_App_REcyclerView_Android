package com.xgt.pfentregarv

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.xgt.pfentregarv.databinding.ItemReposBinding
import com.xgt.pfentregarv.model.Base

class RepoAdapter(val repos: MutableList<Base>, val repoListener: (Base)-> Unit) : RecyclerView.Adapter<RepoAdapter.ReposHolder>() {

    lateinit var binding: ItemReposBinding


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReposHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        binding = ItemReposBinding.inflate(layoutInflater, parent, false)
        return ReposHolder(binding)
    }

    override fun onBindViewHolder(holder: ReposHolder, position: Int) {
        val repoPosition = repos[position]
        binding.tvNameRepo.text = repoPosition.repoName
        binding.tvDescription.text = repoPosition.repoDescription
        Picasso.get()
            .load(repoPosition.owner.avatarImg_url)
            .into(binding.ivRepo)
        binding.root.setOnClickListener{
            repoListener(repoPosition)
        }
    }

    override fun getItemCount(): Int = repos.size

    class ReposHolder (val binding: ItemReposBinding) : RecyclerView.ViewHolder(binding.root){

    }

}