package hello.postBoard.post;

import hello.postBoard.member.Member;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Post {
    //private Member member;
    private String title;
    private String content;

    public Post() {
    }

    public Post(String title, String content) {
        this.title = title;
        this.content = content;
        //this.member = member;
    }

    //    public Post(Member member, String title, String content) {
//        this.member = member;
//        this.title = title;
//        this.content = content;
//    }
}
