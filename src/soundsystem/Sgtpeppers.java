package soundsystem;

/**
 *
 * 注解的意思@component意识是这个类将会作为组件类
 *
 * */

import org.springframework.stereotype.Component;

@Component
public class Sgtpeppers implements CompactDisc {
    private String title = "Sgt. pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";
    public void play() {
        System.out.println("Playing"+title+"by"+ artist);

    }
}
