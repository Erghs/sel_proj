package org.hh.Base;

import com.codeborne.selenide.Selenide;

public class HhResumePage {

    public HhResumePage(String url) {
        Selenide.open(url);
    }
}
