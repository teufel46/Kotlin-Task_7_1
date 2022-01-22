object WallService {
    var posts: Array<Post> = emptyArray()
    var nextId: Int = 1

    var comments = emptyArray<Comment>()

    fun add(post: Post) : Post {
        val postNew = post.copy(id = nextId)
        posts += postNew
        nextId += 1
        return posts.last()
    }

    fun update(postFind: Post) : Boolean {
        for ((index, post) in posts.withIndex()){
            if (post.id == postFind.id) {
                posts[index] = postFind.copy(ownerId = post.ownerId, date = post.date)
                return true
            }
        }
        return false
    }

    fun print(){
        for (post in posts){
            println(post)
        }
    }

    fun createComment(comment: Comment) : Comment? {
        for (post in posts){
            println("post.id " + post.id + " comment.postId="+comment.postId)
            if (comment.postId == post.id) {
                comments += comment
                return comments.last()
            }
            else throw PostNotFoundException("Пост не найден")
        }
        return null
    }
}