package com.utilities;

import com.express_scripts_corporate.pages.Visitor_Main;

public class Pages {
    private Visitor_Main visitorMain;

    public Visitor_Main visitorMain() {
        if (visitorMain == null) {
            visitorMain = new Visitor_Main();
        }
        return visitorMain;
    }
}

