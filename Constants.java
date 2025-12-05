package RocketGame.Util;

public class Constants {
    // Window settings
    public static final int WINDOW_WIDTH = 800;
    public static final int WINDOW_HEIGHT = 600;
    public static final String WINDOW_TITLE = "Epic Rocket Game";
    public static final int FPS = 60;

    // Game settings
    public static final int INITIAL_LIVES = 3;
    public static final int ROCKET_MAX_HEALTH = 100;
    public static final int ROCKET_MAX_SHIELD = 100;

    // Physics
    public static final float ROCKET_SPEED = 5.0f;
    public static final float BULLET_SPEED = 8.0f;
    public static final float ENEMY_BASE_SPEED = 2.0f;

    // Spawning
    public static final int OBSTACLE_SPAWN_INTERVAL = 1500; // milliseconds
    public static final float POWERUP_SPAWN_CHANCE = 0.001f; // per frame

    // Scoring
    public static final int SCORE_OBSTACLE_DODGE = 10;
    public static final int SCORE_OBSTACLE_DESTROY = 50;
    public static final int SCORE_ENEMY_DESTROY = 100;
    public static final int SCORE_BOSS_DESTROY = 1000;
    public static final int SCORE_COIN = 100;

    // Boss
    public static final int BOSS_SPAWN_LEVEL = 5; // Every 5 levels
    public static final int BOSS_HEALTH = 50;

    // Colors (RGB 0-1)
    public static final float[] COLOR_ROCKET = {1.0f, 0.27f, 0.27f}; // Red
    public static final float[] COLOR_BULLET = {0.0f, 1.0f, 0.0f}; // Green
    public static final float[] COLOR_ENEMY = {0.67f, 0.27f, 0.67f}; // Purple
    public static final float[] COLOR_BOSS = {1.0f, 0.0f, 0.0f}; // Red
    public static final float[] COLOR_SHIELD = {0.27f, 0.67f, 1.0f}; // Blue

    // Dimensions
    public static final int ROCKET_WIDTH = 40;
    public static final int ROCKET_HEIGHT = 60;
    public static final int BULLET_WIDTH = 6;
    public static final int BULLET_HEIGHT = 15;
    public static final int POWERUP_SIZE = 30;
}