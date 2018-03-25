package com.heynas.test;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * <p> Description:  TestPath </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class TestWatchService {
    public static void main(String[] args) throws IOException, InterruptedException {
        Path path = Paths.get("d:/temp");

        WatchService watchService = FileSystems.getDefault().newWatchService();

        path.register(watchService
                , StandardWatchEventKinds.ENTRY_CREATE
                , StandardWatchEventKinds.ENTRY_MODIFY
                , StandardWatchEventKinds.ENTRY_DELETE);

        while (true) {
            WatchKey watchKey = watchService.take();

            List<? extends WatchEvent> events = watchKey.pollEvents();

            for (WatchEvent event : events) {
                System.out.println(event.context());
                System.out.println(event.kind());
            }

            watchKey.reset();
        }

//        System.out.println("Finished");
    }
}
