package com.hackathon.groom.service;


import com.hackathon.groom.domain.Post;
import com.hackathon.groom.domain.PostRepository;
import com.hackathon.groom.domain.User;
import com.hackathon.groom.domain.UserRepository;
import com.hackathon.groom.requestdto.NewPostRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PostService {

    private final PostRepository postRepository;
    private final UserRepository userRepository;


    public void createPost(Post post) {
        //User user = userRepository.findUserByUserName(newPostRequestDto.getUsername());
        //newPostRequestDto에 username을 받으니까 username으로 user 객체를 받아서
        //Post 객체에 setUserId 이런건 안좋은 패턴?

        //userName DB에 있는지 체크해주는 로직 필요할 듯

        postRepository.save(post);
    }
}
