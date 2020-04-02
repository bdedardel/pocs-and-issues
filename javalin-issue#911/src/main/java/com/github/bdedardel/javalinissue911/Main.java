package com.github.bdedardel.javalinissue911;


import io.javalin.Javalin;
import io.javalin.plugin.rendering.vue.VueComponent;
    
public class Main {

    public static void main(String[] args) {  	    	
        Javalin app = Javalin.create(config -> {
        	config.enableWebjars();
        	config.addStaticFiles("/public");
        }).start(7000);
    	
        app.get("/", new VueComponent("<admin-login></admin-login>"));
    }
    
    

    


}
