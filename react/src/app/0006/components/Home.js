// Blog Post
// https://www.hackerrank.com/challenges/blog-post/problem?isFullScreen=true

import React, { useState } from "react";
import Input from "./Input";
import PostDisplay from "./PostDisplay";

function Home() {
    const [tmpTitle, setTmpTitle] = useState("");
    const [tmpDesc, setTmpDesc] = useState("");
    const [posts, setPosts] = useState([]);

    const addPost = () => {
        if(tmpTitle !== "" && tmpDesc !== "") {
            setPosts([...posts, { "title" : tmpTitle, "description" : tmpDesc }]);
            setTmpTitle("");
            setTmpDesc("");
        }
    };

    const removePost = (post) => {
        setPosts(posts.filter((p) => p !== post));
    };

    return (
        <div className="text-center ma-20">
            <div className="mb-20">
                <Input title={tmpTitle} setTitle={setTmpTitle} desc={tmpDesc} setDesc={setTmpDesc} />
                <button data-testid="create-button" className="mt-10" onClick={() => addPost()}>
                    Create Post
                </button>
            </div>
            <div className="posts-section">
                <PostDisplay posts={posts} removePost={removePost} />
            </div>
        </div>
    );
}

export default Home;
