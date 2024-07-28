package hello.postBoard.post;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PostRepository {

    private static Map<Long,Post> postList = new HashMap<>();
    private static Long sequence = 0L;

    private static  PostRepository instance = new PostRepository();

    public static PostRepository getInstance()
    {
        return instance;
    }

    private PostRepository() {
    }

    public void savePost(Post post){
        postList.put(sequence++,post);
    }

    public List findAll(){
        return new ArrayList<>(postList.values());
    }

//    public Long findPost(Post post){
//
//    }

}
