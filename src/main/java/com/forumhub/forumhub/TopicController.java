package com.forumhub.forumhub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/topics")
public class TopicController {
    private List<Topic> topics = new ArrayList<>();
    @GetMapping
    public List<Topic> getAllTopics() {
        return topics;
    }
    @PostMapping
    public Topic addTopic(@RequestBody Topic topic) {
        topics.add(topic);
        return topic;
    }
}

