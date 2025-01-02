import React from "react";

function PostDisplay({posts, removePost}) {
    return (
        <div data-testid="posts-container" className="flex wrap gap-10">
            {
                posts.map((post, index) => (
                    <div className="post-box" key={"posts.post.number." + index}>
                        <h3>{post.title}</h3>
                        <p>{post.description}</p>
                        <button onClick={() => removePost(post)}>Delete</button>
                    </div>
                ))
            }
        </div>
    );
}

export default PostDisplay;
