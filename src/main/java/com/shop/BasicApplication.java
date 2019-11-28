package com.shop;

import com.shop.gui.NewUI;
import java.awt.EventQueue;
import javax.swing.JFrame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BasicApplication {
    
    static JFrame f;

    public static void main(String[] args) {
//		SpringApplication.run(BasicApplication.class, args);
        ConfigurableApplicationContext ctx = new SpringApplicationBuilder(BasicApplication.class)
                .headless(false).run(args);
//             EventQueue.invokeLater(() -> {
//
//                BasicApplication ex = ctx.getBean(BasicApplication.class);
//                ex.setVisible(true);
//                f= new NewUI();
//                ex.add(f);
//        });
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                f = new NewUI();
                f.setVisible(true);
            }
        });
    }
    
}
