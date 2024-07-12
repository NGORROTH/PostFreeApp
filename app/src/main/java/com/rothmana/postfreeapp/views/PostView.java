package com.rothmana.postfreeapp.views;

import com.rothmana.postfreeapp.models.response.PostsItem;

import java.util.List;

public interface PostView extends BaseView {
    void onGetPostSuccess(List<PostsItem>postsItemList);
    void onGetPostByIdSuccess(PostsItem data);
}
