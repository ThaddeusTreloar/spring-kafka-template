package org.rnl.spring_template.pipelines;

import org.apache.kafka.streams.StreamsBuilder;
import org.rnl.spring_template.init.Topics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Streams {
    @Autowired
    public void placeholderStream(StreamsBuilder builder, Topics kafkaTopicsConfig) {
        var orders = builder.stream(
            "some_topic"    
        );
        
        orders.to(
            "another_topic"
        );
    }
}
