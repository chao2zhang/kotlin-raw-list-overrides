package com.chaozhang.sample

open class MyParentAdapter : RecyclerViewAdapter() {

    override fun onBindViewHolder(
        position: Int,
        payloads: List<Any>
    ) { }

    override fun onBindViewHolder2(
        position: Int,
        payloads: List<Any?>
    ) { }

    override fun onBindViewHolder3(
        position: Int,
        payloads: List<Any>
    ) { }

    override fun onBindViewHolder4(
        position: Int,
        payloads: List<Any>
    ) { }
}