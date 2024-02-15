package main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

    public boolean upPressed, downPressed, leftPressed, rightPressed;

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();  //get a key that is pressed

        if (code == KeyEvent.VK_W) {  // if the pressed key is W then:
            upPressed = true;
        }

        if (code == KeyEvent.VK_S) {  // if the pressed key is S then:
            downPressed = true;
        }

        if (code == KeyEvent.VK_A) {  // if the pressed key is A then:
            leftPressed = true;
        }

        if (code == KeyEvent.VK_D) {  // if the pressed key is D then:
            rightPressed = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

        int code = e.getKeyCode();

        if (code == KeyEvent.VK_W) {  // if the pressed key is W then:
            upPressed = false;
        }

        if (code == KeyEvent.VK_S) {  // if the pressed key is S then:
            downPressed = false;
        }

        if (code == KeyEvent.VK_A) {  // if the pressed key is A then:
            leftPressed = false;
        }

        if (code == KeyEvent.VK_D) {  // if the pressed key is D then:
            rightPressed = false;
        }
    }
}
