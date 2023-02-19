package org.example.hmm;


import java.util.Random;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Stream<Processor> build = Stream.<Processor>builder()
                .add(new Processor(1200))
                .add(new Processor(1000))
                .add(new Processor(random.nextInt(1000,5000)))
                .add(new Processor(random.nextInt(1000,5000)))
                .add(new Processor(random.nextInt(1000,5000)))
                .add(new Processor(random.nextInt(1000,5000)))
                .build();
        build.parallel().forEach(Processor::process);
    }


}
