package ke.willythedev.kafkapublisher;

import com.google.gson.JsonObject;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Service;

@Service
public class PublisherService {

    private final StreamBridge streamBridge;

    public PublisherService(StreamBridge streamBridge) {
        this.streamBridge = streamBridge;
    }

    public void sendGreeting() {
        String smsTopic = "send-text-topic";

        // Spring will inject for header.
        JsonObject message = new JsonObject();
        message.addProperty("phoneNumber", "254799930965");
        message.addProperty("message", "Hello there, again!");

        streamBridge.send(smsTopic, message.toString());
    }

}
