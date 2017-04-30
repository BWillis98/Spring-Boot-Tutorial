package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
		new Topic("Spring", "Spring Framework", "Spring FrameWork Description"),
		new Topic("Spring2MaGuy", "No Spring Framework", "I don't feel like writing a Spring FrameWork Description"),
		new Topic("anal", "beads", "Well that shit was dirty")
		));
	
	public List<Topic> getAllTopics(){
		return (List<Topic>) topicRepository.findAll();
	}
	
	public Topic getTopic(String id){
		return topicRepository.findOne(id);
	}

	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}

	public void updateTopic(String id, Topic topic) {
		topicRepository.save(topic);
	}

	public void deleteTopic(String id) {
		topicRepository.delete(id);
	}
}
