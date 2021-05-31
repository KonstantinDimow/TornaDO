package com.kd.tornado.view

import com.kd.tornado.Styles
import tornadofx.*

class MainView : View("Hello TornaDO") {
    override val root = hbox {
        label(title) {
            addClass(Styles.heading)
        }
        label(title) {
            addClass(Styles.heading)
        }
    }
}
