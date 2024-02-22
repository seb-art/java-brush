package widgets;

import interfaces.UIWidget;

public class Dragger {
    public void drag(UIWidget widget) {
        widget.drag();
        System.out.println("Dragging done");
    }

}
