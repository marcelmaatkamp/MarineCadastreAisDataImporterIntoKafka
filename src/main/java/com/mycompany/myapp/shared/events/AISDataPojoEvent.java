package com.mycompany.myapp.shared.events;

import com.mycompany.myapp.ais.AISDataPojo;
import org.springframework.context.ApplicationEvent;

public class AISDataPojoEvent extends ApplicationEvent { 

    private final AISDataPojo aisDataPojo;

    public AISDataPojoEvent(Object source, AISDataPojo aisDataPojo) {
        super(source);
        this.aisDataPojo = aisDataPojo;
    }

    public AISDataPojo getAISDataPojo() { 
        return this.aisDataPojo;
    }
}