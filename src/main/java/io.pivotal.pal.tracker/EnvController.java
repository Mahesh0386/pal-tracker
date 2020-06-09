package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class EnvController {

    private final String PORT;
    private final String MEMORY_LIMIT;
    private final String CF_INSTANCE_INDEX;
    private final String CF_INSTANCE_ADDR;

    public EnvController( @Value("${PORT:NOT SET}") String port,
                          @Value("${MEMORY_LIMIT:NOT SET}") String memory,
                          @Value("$CF_INSTANCE_INDEX:NOT SET}") String instanceIndex,
                          @Value("${CF_INSTANCE_ADDR:NOT SET}") String instanceAddr) {
        this.PORT = port;
        this.MEMORY_LIMIT = memory;
        this.CF_INSTANCE_INDEX = instanceIndex;
        this.CF_INSTANCE_ADDR = instanceAddr;
    }

    @GetMapping("/env")
    public Map<String, String> getEnv() {
        Map<String, String> environment = new HashMap<>();
        environment.put("PORT",PORT);
        environment.put("MEMORY_LIMIT",MEMORY_LIMIT);
        environment.put("CF_INSTANCE_INDEX",CF_INSTANCE_INDEX);
        environment.put("CF_INSTANCE_ADDR",CF_INSTANCE_ADDR);

        return environment;
    }
}
