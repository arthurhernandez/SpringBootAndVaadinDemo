package com.example.demo;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

import java.awt.*;

@Route("")
public class MainView extends VerticalLayout {
    public MainView(){
        add(new H1("Hello World"));
        var button = new Button("click me!");
        var button2 = new Button("sign in");
        var textField = new TextField();
        add(textField,button);
        add(new HorizontalLayout(new H2("sign in with:"),button2));

    }

}
