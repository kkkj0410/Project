package hello.postBoard.controller;

import hello.postBoard.member.Member;
import hello.postBoard.member.MemberRepository;
import hello.postBoard.post.Post;
import hello.postBoard.post.PostRepository;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
public class PostController {

    MemberRepository memberRepository = MemberRepository.getInstance();
    PostRepository postRepository = PostRepository.getInstance();

    @GetMapping
    public String mainForm()
    {
        return "main-form";
    }

    @GetMapping("/new-form")
    public String newForm()
    {
        return "new-form";
    }

    @GetMapping("/post-form")
    public String postForm()
    {
        return "post-form";
    }


    //@RequestMapping(value = "/save", method = RequestMethod.POST)
    @PostMapping("/save")
    public String Save(@RequestParam("id") Long id,
                       @RequestParam("name") String name,
                       Model model)
    {
        Member member = new Member(id,name);
        memberRepository.saveMember(member);

        model.addAttribute("Member",member);

        return "save";
    }

    //@RequestMapping(value = "/save-post", method = RequestMethod.POST)
    @PostMapping("/save-post")
    public String Save(@RequestParam("title") String title,
                       @RequestParam("content") String content,
                       Model model)
    {
        Post post = new Post(title,content);
        postRepository.savePost(post);

        //"Post" 저장물은 main-form에서 사용할 예정
        //따라서 save-post에서는 해당 저장물이 저장되지만,
        //main-form에서는 해당 저장물이 사라짐
        model.addAttribute("Post", post);
        return "save-post";
    }


    @RequestMapping("/createCookie")
    public String createCookie(HttpServletResponse response) {
        Cookie cookie = new Cookie("useremail","blueskii");
        cookie.setDomain("localhost");
        cookie.setPath("/");
        // 30초간 저장
        cookie.setMaxAge(30*60);
        cookie.setSecure(true);
        response.addCookie(cookie);

        return "/";
    }
}
