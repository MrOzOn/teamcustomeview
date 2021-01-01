package com.mrozon.teamviewexample

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.widget.LinearLayout
import coil.load
import coil.transform.CircleCropTransformation
import com.mrozon.teamviewexample.databinding.AvatarAndNameViewBinding

@SuppressLint("ViewConstructor")
class AvatarAndNameView(context: Context, member: Member) : LinearLayout(context) {

    init {
        orientation = VERTICAL
        val binding = AvatarAndNameViewBinding
            .inflate(LayoutInflater.from(context), this, true)
        binding.username.text = member.name
        if (member.picture != null) {
            binding.userAvatar
                .load(member.picture) {
                    transformations(CircleCropTransformation())
                }
        } else {
            binding.userAvatar
                .load(R.drawable.ic_avatar_placeholder) {
                    transformations(CircleCropTransformation())
                }
        }
    }
}