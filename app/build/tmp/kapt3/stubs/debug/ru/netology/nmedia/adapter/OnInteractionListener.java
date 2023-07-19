package ru.netology.nmedia.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\t"}, d2 = {"Lru/netology/nmedia/adapter/OnInteractionListener;", "", "onEdit", "", "post", "Lru/netology/nmedia/dto/Post;", "onLike", "onRemove", "onShare", "app_debug"})
public abstract interface OnInteractionListener {
    
    public abstract void onLike(@org.jetbrains.annotations.NotNull()
    ru.netology.nmedia.dto.Post post);
    
    public abstract void onEdit(@org.jetbrains.annotations.NotNull()
    ru.netology.nmedia.dto.Post post);
    
    public abstract void onRemove(@org.jetbrains.annotations.NotNull()
    ru.netology.nmedia.dto.Post post);
    
    public abstract void onShare(@org.jetbrains.annotations.NotNull()
    ru.netology.nmedia.dto.Post post);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public final class DefaultImpls {
        
        public static void onLike(@org.jetbrains.annotations.NotNull()
        ru.netology.nmedia.adapter.OnInteractionListener $this, @org.jetbrains.annotations.NotNull()
        ru.netology.nmedia.dto.Post post) {
        }
        
        public static void onEdit(@org.jetbrains.annotations.NotNull()
        ru.netology.nmedia.adapter.OnInteractionListener $this, @org.jetbrains.annotations.NotNull()
        ru.netology.nmedia.dto.Post post) {
        }
        
        public static void onRemove(@org.jetbrains.annotations.NotNull()
        ru.netology.nmedia.adapter.OnInteractionListener $this, @org.jetbrains.annotations.NotNull()
        ru.netology.nmedia.dto.Post post) {
        }
        
        public static void onShare(@org.jetbrains.annotations.NotNull()
        ru.netology.nmedia.adapter.OnInteractionListener $this, @org.jetbrains.annotations.NotNull()
        ru.netology.nmedia.dto.Post post) {
        }
    }
}