package entity;

import java.awt.image.BufferedImage;

public class Entity {
    public int x, y;
    public int speed;

    public BufferedImage up1, down1, left1, right1, up2, down2, left2, right2,
            upLeft1, upRight1, downLeft1, downRight1, upLeft2, upRight2, downLeft2, downRight2;
    public String direction;
    public int spriteCounter = 0;
    public int spriteNum = 1;
}
