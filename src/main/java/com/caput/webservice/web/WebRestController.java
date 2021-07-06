package com.caput.webservice.web;


import com.caput.webservice.domain.posts.PostsRepository;
import com.caput.webservice.dto.posts.PostsSaveRequestDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

 // 모든 필드를 인자값으로 하는 생성자를 생성해주는 lombok의 어노테이션
/**
 * public WebRestController(PostsRepository postsRepository){
 *     this.postsRepository = postsRepository;
 * }
 *
 * 위 생성자 자동 생성성 */
@RestController
@AllArgsConstructor
public class WebRestController {

    private PostsRepository postsRepository;

    @GetMapping("/hello")
    public String hello() {
        return "HelloWorld";
    }

    @PostMapping("/posts")
    public void savePosts(@RequestBody PostsSaveRequestDto dto){
        postsRepository.save(dto.toEntity());
    }
}