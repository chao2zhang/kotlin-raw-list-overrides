package com.chaozhang.sample;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class MyChildAdapter extends MyParentAdapter {

    // error: name clash: onBindViewHolder(int,List<Object>) in MyChildAdapter and
    // onBindViewHolder(int,List<? extends Object>) in MyParentAdapter have the same erasure, yet neither overrides the other
    //    public void onBindViewHolder(int position, @NotNull List<Object> payloads) {
    @Override
    public void onBindViewHolder(int position, @NotNull List<Object> payloads) {
        super.onBindViewHolder(position, payloads);
    }

    //  error: name clash: onBindViewHolder2(int,List<Object>) in MyChildAdapter and
    // onBindViewHolder2(int,List<? extends Object>) in MyParentAdapter have the same erasure, yet neither overrides the other
    //    public void onBindViewHolder2(int position, @NotNull List<Object> payloads) {
    @Override
    public void onBindViewHolder2(int position, @NotNull List<Object> payloads) {
        super.onBindViewHolder(position, payloads);
    }

    //  error: name clash: onBindViewHolder3(int,List<? extends Object>) in MyChildAdapter and
    // onBindViewHolder3(int,List<Object>) in RecyclerViewAdapter have the same erasure, yet neither overrides the other
    //    public void onBindViewHolder3(int position, @NotNull List<? extends Object> payloads) {
    @Override
    public void onBindViewHolder3(int position, @NotNull List<? extends Object> payloads) {
        super.onBindViewHolder(position, payloads);
    }

    // error: name clash: onBindViewHolder4(int,List<?>) in MyChildAdapter and
    // onBindViewHolder4(int,List<Object>) in RecyclerViewAdapter have the same erasure, yet neither overrides the other
    //    public void onBindViewHolder4(int position, @NotNull List<?> payloads) {
    @Override
    public void onBindViewHolder4(int position, @NotNull List<?> payloads) {
        super.onBindViewHolder(position, payloads);
    }
}
