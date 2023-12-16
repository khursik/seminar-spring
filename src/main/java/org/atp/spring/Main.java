package org.atp.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//
//        TestBean bean = new TestBean("Alex");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "app-config.xml"
        );
//        Music music = context.getBean("musicBean", Music.class);

        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
        player.playMusic();
        context.close();
    }
}
